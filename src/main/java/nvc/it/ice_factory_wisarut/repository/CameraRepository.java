package nvc.it.ice_factory_wisarut.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import nvc.it.ice_factory_wisarut.model.Camera;

public interface CameraRepository extends MongoRepository<Camera,String>{
    
}
