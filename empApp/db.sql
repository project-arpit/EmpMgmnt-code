CREATE TABLE IF NOT EXISTS UserMaster (
  id int(5) NOT NULL,
  name varchar(50) NOT NULL,
  mailId varchar(40) NOT NULL,
  password varchar(15) NOT NULL,
  question varchar(80) NOT NULL,
  ans varchar(80) NOT NULL,
  role int(1) NOT NULL,
   PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/
CREATE TABLE IF NOT EXISTS CityMaster (
  cityId int(5) NOT NULL,
  name varchar(50) NOT NULL,
  PRIMARY KEY (cityId)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/
CREATE TABLE IF NOT EXISTS CategoryMaster (
  categoryId int(5) NOT NULL,
  name varchar(50) NOT NULL,
  PRIMARY KEY (categoryId)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/
CREATE TABLE IF NOT EXISTS PostMaster (
  postId int(5) NOT NULL,
  Title varchar(100) NOT NULL,
  contents varchar(500) NOT NULL,
  containsImage int(1) NOT NULL,
  imageUrl varchar(100) NULL,
  posterId int(5) NOT NULL,
  categoryId int(5) NOT NULL,
  cityId int(5) NOT NULL,
  viewCount int(5) NOT NULL,
  PRIMARY KEY (postId)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/
CREATE TABLE IF NOT EXISTS QueryMaster (
  queryId int(5) NOT NULL,
  Title varchar(100) NOT NULL,
  description varchar(500) NOT NULL,
  posterId int(5) NOT NULL,
  adId int(5) NOT NULL,
  status int(5) NOT NULL,
  PRIMARY KEY (queryId)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/
CREATE TABLE IF NOT EXISTS ReplyMaster (
  replyId int(5) NOT NULL,
  queryId int(5) NOT NULL,
  Title varchar(100) NOT NULL,
  description varchar(500) NOT NULL,
  posterId int(5) NOT NULL,
  PRIMARY KEY (replyId)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
