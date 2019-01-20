# SpringCloudLearn
- ConfigData is holding all application's configurations...
- The properties in application.* will apply to all applications.
# This is enhanced with lab-8. Spring cloud bus with Rabbit MQ
- LuckyWordController uses `@ConfigurationProperties`
- RefreshScopeLuckyWordController  uses `@RefreshScope`
- After changing the properties in ConfigServer give the POST refresh url
- We can simpley do this with following command
  > `curl --request POST http://localhost:9090/actuator/bus-refresh`
