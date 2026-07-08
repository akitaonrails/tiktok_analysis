package com.samsung.sdk.sperf;

import java.util.HashMap;

/* JADX INFO: loaded from: classes32.dex */
public class BoostLevelControl {
    public static int boostResourceCount;
    public static BoostResource[] boostResources = new BoostResource[11];
    public static BoostLevelControl instance;
    public static boolean isBoostLevelIntialized;
    public HashMap<Integer, BoostObject> scenarioBoostObjectMap = new HashMap<>();

    public static BoostLevelControl createInstance(SessionControl sessionControl) {
        if (instance == null) {
            instance = new BoostLevelControl(sessionControl);
            if (!isBoostLevelIntialized || boostResourceCount <= 0) {
                instance = null;
            }
        }
        return instance;
    }

    public static BoostResource getBoostResource(int i) {
        if (i < 0 || i >= 11) {
            return null;
        }
        return boostResources[i];
    }

    public static int getRealBoostLevel(int i, int i2) {
        if (instance != null && i2 >= 0 && i2 < 11) {
            return boostResources[i2].getRealBoostLevel(i);
        }
        return -1;
    }

    public static int getRealBoostLevel(BoostObject boostObject, int i) {
        if (instance != null && i >= 0 && i < 11) {
            return boostResources[i].getRealBoostLevel(boostObject.getLevel(i));
        }
        return -1;
    }

    private void initScenarioBoostObject() {
        BoostObject boostObject = new BoostObject();
        boostObject.update(0, 2, 64532198);
        boostObject.update(6, 1, 64532198);
        this.scenarioBoostObjectMap.put(64, boostObject);
        BoostObject boostObject2 = new BoostObject();
        boostObject2.update(2, 2, 64532198);
        this.scenarioBoostObjectMap.put(128, boostObject2);
        BoostObject boostObject3 = new BoostObject();
        boostObject3.update(4, 2, 64532198);
        this.scenarioBoostObjectMap.put(256, boostObject3);
    }

    public static int setBoostResource(int i, int[] iArr, int i2) {
        if (i < 0 || i >= 11 || boostResources[i] != null) {
            return -1;
        }
        SPerfUtil.log("====setBoostResource==== type : " + i);
        boostResourceCount = boostResourceCount + 1;
        boostResources[i] = new BoostResource(iArr, i2);
        return boostResourceCount;
    }

    public BoostObject getBoostObjectByScenario(int i, int i2) {
        int i3 = 64;
        BoostObject boostObject = null;
        do {
            if ((i3 & i) == i3) {
                BoostObject boostObject2 = this.scenarioBoostObjectMap.get(Integer.valueOf(i3));
                if (boostObject2 != null) {
                    if (boostObject == null) {
                        boostObject = new BoostObject();
                    }
                } else if (boostObject != null) {
                }
                if (!boostObject.combineBoostObject(boostObject2)) {
                    return null;
                }
            }
            i3 <<= 1;
        } while (i3 <= 256);
        if (boostObject == null) {
            return null;
        }
        int i4 = 0;
        do {
            int level = boostObject.getLevel(i4);
            if (level != 64532198) {
                boostObject.update(i4, level, i2);
            }
            i4++;
        } while (i4 < 11);
        return boostObject;
    }

    public int updateBoost(int i, int i2, int i3, BoostObject boostObject) {
        BoostResource boostResource;
        StringBuilder sb;
        if (i >= 0) {
            BoostResource[] boostResourceArr = boostResources;
            if (i >= boostResourceArr.length || boostObject == null || (boostResource = boostResourceArr[i]) == null) {
                return -1;
            }
            int iAdjustLevel = boostResource.adjustLevel(i2);
            int iAdjustTimeout = boostResources[i].adjustTimeout(i3);
            if (iAdjustLevel != i2) {
                sb = new StringBuilder("Requested Boost Level is not available : ");
                sb.append(i2);
            } else {
                if (iAdjustTimeout == i3) {
                    return boostObject.update(i, iAdjustLevel, iAdjustTimeout);
                }
                sb = new StringBuilder("Requested Boost timeout is not available : ");
                sb.append(i3);
            }
            SPerfUtil.log(sb.toString());
            return -1;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x01de, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01df, code lost:
    
        r1 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BoostLevelControl(com.samsung.sdk.sperf.SessionControl r19) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.sdk.sperf.BoostLevelControl.<init>(com.samsung.sdk.sperf.SessionControl):void");
    }
}
