package ru.netology.Radio;

public class Radio {

    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        maxStation = 9;

    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;
            }

    public int getMaxStation() {
        return maxStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void nextStation() {
        if (currentStation > minStation) {
            currentStation = currentStation + 1;
        }
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation <= minStation) {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        }
        if (currentStation <= minStation) {
            currentStation = maxStation;
        }

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
    }


}
