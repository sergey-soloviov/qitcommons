package com.qitsoft.qitcommons.dao.test;

import java.util.UUID;

import com.qitsoft.qitcommons.model.AbstractIntEntity;
import com.qitsoft.qitcommons.model.AbstractUuidEntity;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class DaoTestUtils {

    public static Matcher<? super AbstractUuidEntity> withId(String id) {
        return new BaseMatcher<AbstractUuidEntity>() {
            @Override
            public boolean matches(Object item) {
                AbstractUuidEntity abstractEntity = (AbstractUuidEntity) item;
                return abstractEntity.getId() != null && abstractEntity.getId().toString().equals(id);
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("entity with id ").appendValue(id).appendText(".");
            }
        };
    }

    public static Matcher<? super AbstractUuidEntity> withId(UUID id) {
        return new BaseMatcher<AbstractUuidEntity>() {
            @Override
            public boolean matches(Object item) {
                AbstractUuidEntity abstractEntity = (AbstractUuidEntity) item;
                return abstractEntity.getId() != null && abstractEntity.getId().equals(id);
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("entity with id ").appendValue(id.toString()).appendText(".");
            }
        };
    }

    public static Matcher<? super AbstractIntEntity> withId(long id) {
        return new BaseMatcher<AbstractIntEntity>() {
            @Override
            public boolean matches(Object item) {
                AbstractIntEntity abstractEntity = (AbstractIntEntity) item;
                return abstractEntity.getId() != null && abstractEntity.getId().equals(id);
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("entity with id ").appendValue(id).appendText(".");
            }
        };
    }

}
