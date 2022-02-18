package nvc.it.ice_factory_wisarut.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.it.ice_factory_wisarut.model.Camera;
import nvc.it.ice_factory_wisarut.model.Event;
import nvc.it.ice_factory_wisarut.repository.CameraRepository;

@Service
public class CameraService {
    
    @Autowired
    private CameraRepository cameraRepository;

    public List<Camera> getCameras(){
        return cameraRepository.findAll();
    }

    public Optional<Camera> findById(String id){
        return cameraRepository.findById(id);
    }

    public Camera addCamera(Camera camera){
        return cameraRepository.save(camera);
    }

    public Optional<Camera> addEvent(String id, Event event){
        Camera currentCamera = cameraRepository.findById(id).get();
        List<Event> events = currentCamera.getEvents();
        events.add(event);
        currentCamera.setEvents(events);

        return Optional.of(cameraRepository.save(currentCamera));
    }
}
