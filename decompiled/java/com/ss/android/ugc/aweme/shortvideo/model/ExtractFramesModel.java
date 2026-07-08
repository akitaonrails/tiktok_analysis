package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C13LP;
import X.C15438062q;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2286708xd;
import X.InterfaceC1294060jmO;
import X.InterfaceC2270808v4;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class ExtractFramesModel implements Serializable {

    @C09CT("extractType")
    public String extractType;

    @C09CT("first_frame_with_effect")
    public String firstFrameWithEffect;

    @C09CT("segmentEffectPhoto")
    @InterfaceC2270808v4
    public HashMap<String, List<String>> segmentEffectPhoto;
    public String stickerIds;

    @C09CT("extractFramesDir")
    public String extractFramesDir = "";

    @C09CT("stickerFacesMap")
    @InterfaceC2270808v4
    public final HashMap<Integer, String> stickerPersons = new HashMap<>();

    @C09CT("multiStickersMap")
    @InterfaceC2270808v4
    public HashMap<Integer, List<String>> multiStickers = new HashMap<>();

    @C09CT("frames")
    @InterfaceC2270808v4
    public HashMap<Integer, ArrayList<String>> frames = new HashMap<>();

    @C09CT("frames_v1")
    public HashMap<Integer, ArrayList<FrameItem>> framesV1 = new HashMap<>();

    @C09CT("effect_frames")
    public HashMap<Integer, ArrayList<FrameItem>> effectFrames = new HashMap<>();

    @C09CT("segmentFrameKey")
    public HashMap<Integer, String> segmentFrameKeys = new HashMap<>();

    @C09CT("framesTimestamp")
    public HashMap<String, Long> framesTimestamp = new HashMap<>();

    @InterfaceC1294060jmO
    public static /* synthetic */ void getStickerPersons$annotations() {
    }

    private final boolean isOldVersion() {
        return !this.frames.isEmpty();
    }

    public final void clearAllFrames() {
        this.frames.clear();
        HashMap<Integer, ArrayList<FrameItem>> map = this.framesV1;
        if (map != null) {
            map.clear();
        }
        HashMap<Integer, ArrayList<FrameItem>> map2 = this.effectFrames;
        if (map2 != null) {
            map2.clear();
        }
        HashMap<Integer, String> map3 = this.segmentFrameKeys;
        if (map3 != null) {
            map3.clear();
        }
    }

    public final ExtractFramesModel convertToV1IfNeed() {
        if (isOldVersion()) {
            this.framesV1 = new HashMap<>();
            for (Map.Entry<Integer, ArrayList<String>> entry : this.frames.entrySet()) {
                ArrayList<String> value = entry.getValue();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(value, 10));
                for (String str : value) {
                    FrameItem frameItem = new FrameItem(str, 1, -1, false, null, null);
                    HashMap<String, Long> map = this.framesTimestamp;
                    if (map != null && map.get(str) != null && this.framesTimestamp.get(str).longValue() >= 0) {
                        frameItem.setTimeStamp(this.framesTimestamp.get(str).longValue());
                    }
                    arrayList.add(frameItem);
                }
                HashMap<Integer, ArrayList<FrameItem>> map2 = this.framesV1;
                if (map2 != null) {
                    map2.put(entry.getKey(), new ArrayList<>(arrayList));
                }
            }
            HashMap<Integer, List<String>> map3 = this.multiStickers;
            if (map3 == null || map3.isEmpty()) {
                HashMap<Integer, List<String>> map4 = new HashMap<>();
                this.multiStickers = map4;
                HashMap<Integer, String> map5 = this.stickerPersons;
                LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map5.size()));
                Iterator<T> it2 = map5.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    linkedHashMap.put(entry2.getKey(), Collections.singletonList(entry2.getValue()));
                }
                C2097608Jq.LJIIL(map4, linkedHashMap);
            }
            this.frames.clear();
            HashMap<String, Long> map6 = this.framesTimestamp;
            if (map6 != null) {
                map6.clear();
            }
        }
        return this;
    }

    public final List<FrameItem> getAllEffectFrames() {
        ArrayList arrayList = new ArrayList();
        HashMap<Integer, ArrayList<FrameItem>> map = this.effectFrames;
        if (map != null) {
            for (Map.Entry<Integer, ArrayList<FrameItem>> entry : map.entrySet()) {
                if (!entry.getValue().isEmpty()) {
                    arrayList.addAll(entry.getValue());
                }
            }
        }
        for (Map.Entry<Integer, String> entry2 : this.stickerPersons.entrySet()) {
            if (entry2.getValue().length() > 0) {
                arrayList.add(new FrameItem(entry2.getValue(), 1, -1, false, null, null));
            }
        }
        HashMap<Integer, List<String>> map2 = this.multiStickers;
        if (map2 != null) {
            for (Map.Entry<Integer, List<String>> entry3 : map2.entrySet()) {
                if (!entry3.getValue().isEmpty()) {
                    List<String> value = entry3.getValue();
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(value, 10));
                    Iterator<T> it2 = value.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new FrameItem((String) it2.next(), 1, -1, false, null, null));
                    }
                    arrayList.addAll(arrayList2);
                }
            }
        }
        return arrayList;
    }

    public final List<FrameItem> getAllFrames() {
        ArrayList arrayList = new ArrayList();
        HashMap<Integer, ArrayList<FrameItem>> map = this.framesV1;
        if (map != null) {
            for (Map.Entry<Integer, ArrayList<FrameItem>> entry : map.entrySet()) {
                if (!entry.getValue().isEmpty()) {
                    arrayList.addAll(entry.getValue());
                }
            }
        }
        for (Map.Entry<Integer, String> entry2 : this.stickerPersons.entrySet()) {
            if (entry2.getValue().length() > 0) {
                arrayList.add(new FrameItem(entry2.getValue(), 1, -1, false, null, null));
            }
        }
        HashMap<Integer, List<String>> map2 = this.multiStickers;
        if (map2 != null) {
            for (Map.Entry<Integer, List<String>> entry3 : map2.entrySet()) {
                if (!entry3.getValue().isEmpty()) {
                    List<String> value = entry3.getValue();
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(value, 10));
                    Iterator<T> it2 = value.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new FrameItem((String) it2.next(), 1, -1, false, null, null));
                    }
                    arrayList.addAll(arrayList2);
                }
            }
        }
        return arrayList;
    }

    public final int getFrameSize() {
        HashMap<Integer, ArrayList<FrameItem>> map = this.framesV1;
        if (map != null) {
            return map.size();
        }
        return 0;
    }

    public final void initSegmentEffectPhoto() {
        if (this.segmentEffectPhoto == null) {
            this.segmentEffectPhoto = new HashMap<>();
        }
    }

    public final void removeFile() {
        C2286708xd.LJIIZILJ(this.extractFramesDir);
        C2286708xd.LJIJ(this.extractFramesDir);
    }

    public final void removeLastSegment() {
        HashMap<Integer, ArrayList<FrameItem>> map = this.framesV1;
        if (map != null && (!map.isEmpty())) {
            map.remove(Integer.valueOf(map.size() - 1));
        }
        if (this.segmentFrameKeys != null && (!r0.isEmpty())) {
            this.segmentFrameKeys.remove(Integer.valueOf(r1.size() - 1));
        }
        HashMap<Integer, ArrayList<FrameItem>> map2 = this.effectFrames;
        if (map2 == null || !(!map2.isEmpty())) {
            return;
        }
        map2.remove(Integer.valueOf(map2.size() - 1));
    }

    public final void removeMultiImages() {
        HashMap<Integer, List<String>> map = this.multiStickers;
        if (map == null || !(!map.isEmpty())) {
            return;
        }
        map.remove(Integer.valueOf(getFrameSize()));
    }

    public String toString() {
        return GsonProtectorUtils.toJson(new e().LIZ(), this);
    }

    public final void removeFileAndResetData() {
        removeFile();
        resetData();
    }

    public final HashMap<Integer, ArrayList<FrameItem>> getEffectFrames() {
        return this.effectFrames;
    }

    public final String getExtractFramesDir() {
        return this.extractFramesDir;
    }

    public final String getExtractType() {
        return this.extractType;
    }

    public final String getFirstFrameWithEffect() {
        return this.firstFrameWithEffect;
    }

    public final HashMap<Integer, ArrayList<String>> getFrames() {
        return this.frames;
    }

    public final HashMap<String, Long> getFramesTimestamp() {
        return this.framesTimestamp;
    }

    public final HashMap<Integer, ArrayList<FrameItem>> getFramesV1() {
        return this.framesV1;
    }

    public final HashMap<Integer, List<String>> getMultiStickers() {
        return this.multiStickers;
    }

    public final HashMap<String, List<String>> getSegmentEffectPhoto() {
        return this.segmentEffectPhoto;
    }

    public final HashMap<Integer, String> getSegmentFrameKeys() {
        return this.segmentFrameKeys;
    }

    public final String getStickerIds() {
        return this.stickerIds;
    }

    public final HashMap<Integer, String> getStickerPersons() {
        return this.stickerPersons;
    }

    public final void resetData() {
        clearAllFrames();
    }

    public ExtractFramesModel(String str) {
        this.extractType = str;
    }

    public final void addEffectFrameAtLastSegment(FrameItem frameItem) {
        HashMap<Integer, ArrayList<FrameItem>> map = this.effectFrames;
        if (map != null) {
            if (map.get(Integer.valueOf(map.size() - 1)) != null) {
                ArrayList<FrameItem> arrayList = map.get(Integer.valueOf(map.size() - 1));
                if (arrayList != null) {
                    arrayList.add(frameItem);
                    return;
                }
                return;
            }
            ArrayList<FrameItem> arrayList2 = map.get(C13LP.LJJLIIIJLJLI(map.keySet()));
            if (arrayList2 == null) {
                return;
            }
            arrayList2.add(frameItem);
        }
    }

    public final void addFrameAtLastSegment(FrameItem frameItem) {
        HashMap<Integer, ArrayList<FrameItem>> map = this.framesV1;
        if (map != null) {
            if (map.get(Integer.valueOf(map.size() - 1)) != null) {
                ArrayList<FrameItem> arrayList = map.get(Integer.valueOf(map.size() - 1));
                if (arrayList != null) {
                    arrayList.add(frameItem);
                    return;
                }
                return;
            }
            ArrayList<FrameItem> arrayList2 = map.get(C13LP.LJJLIIIJLJLI(map.keySet()));
            if (arrayList2 == null) {
                return;
            }
            arrayList2.add(frameItem);
        }
    }

    public final void addMultiImages(List<String> list) {
        int frameSize = getFrameSize();
        HashMap<Integer, List<String>> map = this.multiStickers;
        if (map != null) {
            map.put(Integer.valueOf(frameSize), list);
        }
    }

    public final void addMultiImagesAfterShoot(List<String> list) {
        int frameSize = getFrameSize() - 1;
        HashMap<Integer, List<String>> map = this.multiStickers;
        if (map != null) {
            map.put(Integer.valueOf(frameSize), list);
        }
    }

    public final ExtractFramesModel copy(boolean z) {
        ExtractFramesModel extractFramesModel = new ExtractFramesModel(this.extractType);
        extractFramesModel.extractFramesDir = this.extractFramesDir;
        if (!this.frames.isEmpty()) {
            if (z) {
                for (Map.Entry<Integer, ArrayList<String>> entry : this.frames.entrySet()) {
                    int iIntValue = entry.getKey().intValue();
                    ArrayList<String> value = entry.getValue();
                    HashMap<Integer, ArrayList<String>> map = extractFramesModel.frames;
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.addAll(value);
                    map.put(numValueOf, arrayList);
                }
            } else {
                extractFramesModel.frames.putAll(this.frames);
            }
        }
        HashMap<Integer, ArrayList<FrameItem>> map2 = this.framesV1;
        if (map2 != null && !map2.isEmpty()) {
            if (z) {
                for (Map.Entry<Integer, ArrayList<FrameItem>> entry2 : map2.entrySet()) {
                    int iIntValue2 = entry2.getKey().intValue();
                    ArrayList<FrameItem> value2 = entry2.getValue();
                    HashMap<Integer, ArrayList<FrameItem>> map3 = extractFramesModel.framesV1;
                    if (map3 != null) {
                        Integer numValueOf2 = Integer.valueOf(iIntValue2);
                        ArrayList<FrameItem> arrayList2 = new ArrayList<>();
                        arrayList2.addAll(value2);
                        map3.put(numValueOf2, arrayList2);
                    }
                }
            } else {
                HashMap<Integer, ArrayList<FrameItem>> map4 = extractFramesModel.framesV1;
                if (map4 != null) {
                    map4.putAll(map2);
                }
            }
        }
        HashMap<Integer, ArrayList<FrameItem>> map5 = this.effectFrames;
        if (map5 != null && !map5.isEmpty()) {
            if (z) {
                for (Map.Entry<Integer, ArrayList<FrameItem>> entry3 : map5.entrySet()) {
                    int iIntValue3 = entry3.getKey().intValue();
                    ArrayList<FrameItem> value3 = entry3.getValue();
                    HashMap<Integer, ArrayList<FrameItem>> map6 = extractFramesModel.effectFrames;
                    if (map6 != null) {
                        Integer numValueOf3 = Integer.valueOf(iIntValue3);
                        ArrayList<FrameItem> arrayList3 = new ArrayList<>();
                        arrayList3.addAll(value3);
                        map6.put(numValueOf3, arrayList3);
                    }
                }
            } else {
                HashMap<Integer, ArrayList<FrameItem>> map7 = extractFramesModel.effectFrames;
                if (map7 != null) {
                    map7.putAll(map5);
                }
            }
        }
        if (this.stickerPersons != null && (!r0.isEmpty())) {
            C2097608Jq.LJIIL(extractFramesModel.getStickerPersons(), this.stickerPersons);
        }
        HashMap<Integer, List<String>> map8 = this.multiStickers;
        if (map8 != null && (!map8.isEmpty())) {
            if (z) {
                for (Map.Entry<Integer, List<String>> entry4 : map8.entrySet()) {
                    int iIntValue4 = entry4.getKey().intValue();
                    List<String> value4 = entry4.getValue();
                    HashMap<Integer, List<String>> map9 = extractFramesModel.multiStickers;
                    if (map9 != null) {
                        Integer numValueOf4 = Integer.valueOf(iIntValue4);
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.addAll(value4);
                        map9.put(numValueOf4, arrayList4);
                    }
                }
            } else {
                HashMap<Integer, List<String>> multiStickers = extractFramesModel.getMultiStickers();
                if (multiStickers != null) {
                    C2097608Jq.LJIIL(multiStickers, map8);
                }
            }
        }
        HashMap<Integer, String> map10 = this.segmentFrameKeys;
        if (true ^ map10.isEmpty()) {
            if (z) {
                for (Map.Entry<Integer, String> entry5 : map10.entrySet()) {
                    int iIntValue5 = entry5.getKey().intValue();
                    extractFramesModel.segmentFrameKeys.put(Integer.valueOf(iIntValue5), entry5.getValue());
                }
            } else {
                C2097608Jq.LJIIL(extractFramesModel.segmentFrameKeys, map10);
            }
        }
        return extractFramesModel;
    }

    public final void setEffectFrames(HashMap<Integer, ArrayList<FrameItem>> map) {
        this.effectFrames = map;
    }

    public final void setExtractFramesDir(String str) {
        this.extractFramesDir = str;
    }

    public final void setExtractType(String str) {
        this.extractType = str;
    }

    public final void setFirstFrameWithEffect(String str) {
        this.firstFrameWithEffect = str;
    }

    public final void setFrames(HashMap<Integer, ArrayList<String>> map) {
        this.frames = map;
    }

    public final void setFramesTimestamp(HashMap<String, Long> map) {
        this.framesTimestamp = map;
    }

    public final void setFramesV1(HashMap<Integer, ArrayList<FrameItem>> map) {
        this.framesV1 = map;
    }

    public final void setSegmentEffectPhoto(HashMap<String, List<String>> map) {
        this.segmentEffectPhoto = map;
    }

    public final void setSegmentFrameKeys(HashMap<Integer, String> map) {
        this.segmentFrameKeys = map;
    }

    public final void setStickerIds(String str) {
        this.stickerIds = str;
    }

    public final void addFrameAtLastSegmentForEditorPro(ArrayList<FrameItem> arrayList, String str) {
        HashMap<Integer, ArrayList<FrameItem>> map = this.framesV1;
        if (map != null) {
            if (map.get(Integer.valueOf(map.size() - 1)) != null) {
                ArrayList<FrameItem> arrayList2 = map.get(Integer.valueOf(map.size() - 1));
                if (arrayList2 != null) {
                    arrayList2.addAll(arrayList);
                    return;
                }
                return;
            }
            if (!map.isEmpty()) {
                ArrayList<FrameItem> arrayList3 = map.get(C13LP.LJJLIIIJLJLI(map.keySet()));
                if (arrayList3 == null) {
                    return;
                }
                arrayList3.addAll(arrayList);
                return;
            }
            map.put(0, arrayList);
            HashMap<Integer, String> map2 = this.segmentFrameKeys;
            if (map2 == null) {
                return;
            }
            map2.put(0, str);
        }
    }

    public final void bindSegmentEffectPhoto(List<String> list, String str) {
        HashMap<String, List<String>> map = this.segmentEffectPhoto;
        if (map == null) {
            return;
        }
        if (!map.containsKey(str)) {
            this.segmentEffectPhoto.put(str, new ArrayList());
        }
        List<String> list2 = this.segmentEffectPhoto.get(str);
        if (list2 != null) {
            list2.addAll(list);
        }
    }

    public final void addFrameSegment(ArrayList<FrameItem> arrayList, String str, ArrayList<FrameItem> arrayList2) {
        HashMap<Integer, ArrayList<FrameItem>> map = this.framesV1;
        if (map != null) {
            map.put(Integer.valueOf(map.size()), arrayList);
        }
        HashMap<Integer, String> map2 = this.segmentFrameKeys;
        if (map2 != null) {
            map2.put(Integer.valueOf(map2.size()), str);
        }
        HashMap<Integer, ArrayList<FrameItem>> map3 = this.effectFrames;
        if (map3 != null) {
            map3.put(Integer.valueOf(map3.size()), arrayList2);
        }
    }
}
