-- executed by spring boot on H2 DB at test and application start time
CREATE TABLE IF NOT EXISTS WORDS  (
   ID               INT  NOT NULL AUTO_INCREMENT  PRIMARY KEY
  ,value           VARCHAR(255) NOT NULL CONSTRAINT PUBLISHERS_NAME_UC UNIQUE
);