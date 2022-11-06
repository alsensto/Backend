package capstone.everyhealth;

import capstone.everyhealth.domain.routine.Workout;
import capstone.everyhealth.domain.routine.WorkoutName;
import capstone.everyhealth.domain.stakeholder.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

@Component
@RequiredArgsConstructor
@Slf4j
public class InitDb {

    /*@Value("${spring.profiles.active}")
    private String mode;
    @Value("#{dev['spring.jpa.hibernate.ddl-auto']}")
    private String ddl;
    private final InitService initService;

    @PostConstruct
    public void init() {

        log.info("mode : {}", mode);
        log.info("ddl : {}", ddl);

        if (mode.equals("dev") && ddl.equals("create")) {
            log.info("CREATED");
            initService.dbInit();
        }
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {

        private final EntityManager em;

        public void dbInit() {

            saveMember();
            saveWorkout();
        }

        private void saveWorkout() {

            for (WorkoutName workoutName : WorkoutName.values()) {

                Workout workout = Workout.builder()
                        .workoutName(workoutName)
                        .workoutTarget(workoutName.getWorkoutTarget())
                        .build();

                em.persist(workout);
            }
        }

        public void saveMember() {

            for (int i = 0; i < 4; i++) {
                Member member = new Member();
                em.persist(member);
            }
        }
    }*/
}
