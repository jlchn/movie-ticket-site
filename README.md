# movie-ticket-site


### install zookeeper

download from http://mirror.bit.edu.cn/apache/zookeeper/zookeeper-3.4.10/

```
cd conf/
mv zoo-sample.cfg zoo.cfg

cd ../bin
./zkServer.sh start
```

### install mysql

```
sudo apt-get update
sudo apt-get install mysql-server
mysql_secure_installation

```