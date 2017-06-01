package com.jiangzehui.weatherdemo;

import java.util.List;

/**
 * Created by jiangzehui on 17/6/1.
 */
public class WeatherModel {


    /**
     * msg : success
     * result : [{"airCondition":"良","city":"南京","coldIndex":"低发期","date":"2017-06-01","distrct":"南京","dressingIndex":"薄短袖类","exerciseIndex":"不适宜","future":[{"date":"2017-06-01","dayTime":"多云","night":"晴","temperature":"33°C / 22°C","week":"今天","wind":"东风 小于3级"},{"date":"2017-06-02","dayTime":"晴","night":"晴","temperature":"33°C / 20°C","week":"星期五","wind":"东风 3～4级"},{"date":"2017-06-03","dayTime":"多云","night":"多云","temperature":"33°C / 20°C","week":"星期六","wind":"东风 3～4级"},{"date":"2017-06-04","dayTime":"多云","night":"阴","temperature":"30°C / 20°C","week":"星期日","wind":"东南风 3～4级"},{"date":"2017-06-05","dayTime":"阵雨","night":"中雨-大雨","temperature":"26°C / 20°C","week":"星期一","wind":"东南风 3～4级"},{"date":"2017-06-06","dayTime":"阵雨","night":"阴","temperature":"24°C / 17°C","week":"星期二","wind":"西南风 3～4级"},{"date":"2017-06-07","dayTime":"少云","night":"少云","temperature":"31°C / 21°C","week":"星期三","wind":"西北偏西风 2级"},{"date":"2017-06-08","dayTime":"晴","night":"少云","temperature":"33°C / 23°C","week":"星期四","wind":"西南偏南风 3级"},{"date":"2017-06-09","dayTime":"零散雷雨","night":"零散雷雨","temperature":"33°C / 23°C","week":"星期五","wind":"西南偏南风 3级"},{"date":"2017-06-10","dayTime":"雷雨","night":"雷雨","temperature":"30°C / 22°C","week":"星期六","wind":"西南偏南风 3级"}],"humidity":"湿度：51%","pollutionIndex":"85","province":"江苏","sunrise":"05:00","sunset":"19:06","temperature":"32℃","time":"13:21","updateTime":"20170601134813","washIndex":"不太适宜","weather":"多云","week":"周四","wind":"南风2级"}]
     * retCode : 200
     */

    private String msg;
    private String retCode;
    /**
     * airCondition : 良
     * city : 南京
     * coldIndex : 低发期
     * date : 2017-06-01
     * distrct : 南京
     * dressingIndex : 薄短袖类
     * exerciseIndex : 不适宜
     * future : [{"date":"2017-06-01","dayTime":"多云","night":"晴","temperature":"33°C / 22°C","week":"今天","wind":"东风 小于3级"},{"date":"2017-06-02","dayTime":"晴","night":"晴","temperature":"33°C / 20°C","week":"星期五","wind":"东风 3～4级"},{"date":"2017-06-03","dayTime":"多云","night":"多云","temperature":"33°C / 20°C","week":"星期六","wind":"东风 3～4级"},{"date":"2017-06-04","dayTime":"多云","night":"阴","temperature":"30°C / 20°C","week":"星期日","wind":"东南风 3～4级"},{"date":"2017-06-05","dayTime":"阵雨","night":"中雨-大雨","temperature":"26°C / 20°C","week":"星期一","wind":"东南风 3～4级"},{"date":"2017-06-06","dayTime":"阵雨","night":"阴","temperature":"24°C / 17°C","week":"星期二","wind":"西南风 3～4级"},{"date":"2017-06-07","dayTime":"少云","night":"少云","temperature":"31°C / 21°C","week":"星期三","wind":"西北偏西风 2级"},{"date":"2017-06-08","dayTime":"晴","night":"少云","temperature":"33°C / 23°C","week":"星期四","wind":"西南偏南风 3级"},{"date":"2017-06-09","dayTime":"零散雷雨","night":"零散雷雨","temperature":"33°C / 23°C","week":"星期五","wind":"西南偏南风 3级"},{"date":"2017-06-10","dayTime":"雷雨","night":"雷雨","temperature":"30°C / 22°C","week":"星期六","wind":"西南偏南风 3级"}]
     * humidity : 湿度：51%
     * pollutionIndex : 85
     * province : 江苏
     * sunrise : 05:00
     * sunset : 19:06
     * temperature : 32℃
     * time : 13:21
     * updateTime : 20170601134813
     * washIndex : 不太适宜
     * weather : 多云
     * week : 周四
     * wind : 南风2级
     */

    private List<ResultBean> result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        private String airCondition;
        private String city;
        private String coldIndex;
        private String date;
        private String distrct;
        private String dressingIndex;
        private String exerciseIndex;
        private String humidity;
        private String pollutionIndex;
        private String province;
        private String sunrise;
        private String sunset;
        private String temperature;
        private String time;
        private String updateTime;
        private String washIndex;
        private String weather;
        private String week;
        private String wind;
        /**
         * date : 2017-06-01
         * dayTime : 多云
         * night : 晴
         * temperature : 33°C / 22°C
         * week : 今天
         * wind : 东风 小于3级
         */

        private List<FutureBean> future;

        public String getAirCondition() {
            return airCondition;
        }

        public void setAirCondition(String airCondition) {
            this.airCondition = airCondition;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getColdIndex() {
            return coldIndex;
        }

        public void setColdIndex(String coldIndex) {
            this.coldIndex = coldIndex;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getDistrct() {
            return distrct;
        }

        public void setDistrct(String distrct) {
            this.distrct = distrct;
        }

        public String getDressingIndex() {
            return dressingIndex;
        }

        public void setDressingIndex(String dressingIndex) {
            this.dressingIndex = dressingIndex;
        }

        public String getExerciseIndex() {
            return exerciseIndex;
        }

        public void setExerciseIndex(String exerciseIndex) {
            this.exerciseIndex = exerciseIndex;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public String getPollutionIndex() {
            return pollutionIndex;
        }

        public void setPollutionIndex(String pollutionIndex) {
            this.pollutionIndex = pollutionIndex;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getSunrise() {
            return sunrise;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public String getSunset() {
            return sunset;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getWashIndex() {
            return washIndex;
        }

        public void setWashIndex(String washIndex) {
            this.washIndex = washIndex;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public String getWeek() {
            return week;
        }

        public void setWeek(String week) {
            this.week = week;
        }

        public String getWind() {
            return wind;
        }

        public void setWind(String wind) {
            this.wind = wind;
        }

        public List<FutureBean> getFuture() {
            return future;
        }

        public void setFuture(List<FutureBean> future) {
            this.future = future;
        }

        public static class FutureBean {
            private String date;
            private String dayTime;
            private String night;
            private String temperature;
            private String week;
            private String wind;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDayTime() {
                return dayTime;
            }

            public void setDayTime(String dayTime) {
                this.dayTime = dayTime;
            }

            public String getNight() {
                return night;
            }

            public void setNight(String night) {
                this.night = night;
            }

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }
        }
    }


}
