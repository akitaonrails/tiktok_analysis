package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C09CT;
import X.C13LN;
import X.C13LP;
import X.C1476750oX3;
import X.C1477980oZ2;
import X.C2188811AlT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Audio implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("CdnUrlExpired")
    public long CdnUrlExpired;

    @C09CT("TtsInfos")
    public List<TtsInfos> TtsInfos;

    @C09CT("original_sound_infos")
    public List<OriginalSound> originalSoundInfos;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes12.dex */
    public static final class InfoIdType {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ InfoIdType[] $VALUES;
        public static final InfoIdType ORIGINAL = new InfoIdType("ORIGINAL", 0, 1);
        public static final InfoIdType TRANSLATED = new InfoIdType("TRANSLATED", 1, 2);
        public final int infoId;

        public static final /* synthetic */ InfoIdType[] $values() {
            return new InfoIdType[]{ORIGINAL, TRANSLATED};
        }

        public static InterfaceC2044707zh<InfoIdType> getEntries() {
            return $ENTRIES;
        }

        static {
            InfoIdType[] infoIdTypeArr$values = $values();
            $VALUES = infoIdTypeArr$values;
            $ENTRIES = new C2254308sP(infoIdTypeArr$values);
        }

        public static InfoIdType[] values() {
            return (InfoIdType[]) $VALUES.clone();
        }

        public final int getInfoId() {
            return this.infoId;
        }

        public static InfoIdType valueOf(String str) {
            return (InfoIdType) C08FF.LIZ(InfoIdType.class, str);
        }

        public InfoIdType(String str, int i, int i2) {
            this.infoId = i2;
        }
    }

    public Audio() {
    }

    public static final List<C1476750oX3> convertToSimAudio(Video video, Audio audio, String str, String str2) {
        return Companion.convertToSimAudio(video, audio, str, str2);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Audio(CdnUrlExpired=");
        sbLIZ.append(this.CdnUrlExpired);
        sbLIZ.append(", TtsInfos=");
        sbLIZ.append(this.TtsInfos);
        sbLIZ.append(", originalSoundInfos=");
        sbLIZ.append(this.originalSoundInfos);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long getCdnUrlExpired() {
        return this.CdnUrlExpired;
    }

    public final List<TtsInfos> getTtsInfos() {
        return this.TtsInfos;
    }

    public Audio(long j, List<TtsInfos> list, List<OriginalSound> list2) {
        this.CdnUrlExpired = j;
        this.TtsInfos = list;
        this.originalSoundInfos = list2;
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        public final List<C1476750oX3> convertToSimAudio(Video video, Audio audio, String str, String str2) {
            Integer numValueOf;
            List<String> urlList;
            String strLIZIZ;
            BitRate bitRate;
            String str3;
            String str4;
            List<String> list;
            String str5;
            List<String> list2;
            String str6;
            String strLL;
            List<TtsInfos> ttsInfos;
            String sourceId;
            String str7 = str2;
            VideoUrlModel videoUrlModel = video.playAddr;
            if (videoUrlModel != null && (sourceId = videoUrlModel.getSourceId()) != null) {
                str7 = sourceId;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Audio::convertToSimAudio: autoDubbing, ttsInfos.size=");
            if (audio != null && (ttsInfos = audio.getTtsInfos()) != null) {
                numValueOf = Integer.valueOf(ttsInfos.size());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(", from=");
            sbLIZ.append(str);
            sbLIZ.append(", aid=");
            sbLIZ.append(str7);
            C2188811AlT.LIZIZ(sbLIZ);
            if (audio == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int infoId = InfoIdType.TRANSLATED.getInfoId();
            List<TtsInfos> ttsInfos2 = audio.getTtsInfos();
            if (ttsInfos2 != null) {
                for (TtsInfos ttsInfos3 : ttsInfos2) {
                    if (ttsInfos3.playAddress != null && ttsInfos3.languageCode != null) {
                        if (Intrinsics.LJFF(ttsInfos3.format, "mp4")) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            PlayAddress playAddress = ttsInfos3.playAddress;
                            if (playAddress != null) {
                                str6 = playAddress.fileHash;
                            } else {
                                str6 = null;
                            }
                            sbLIZ2.append(str6);
                            sbLIZ2.append('_');
                            if (str7 != null) {
                                strLL = C13LN.LL(4, str7);
                            } else {
                                strLL = null;
                            }
                            sbLIZ2.append(strLL);
                            sbLIZ2.append('_');
                            sbLIZ2.append(ttsInfos3.bitRate);
                            sbLIZ2.append('_');
                            sbLIZ2.append(ttsInfos3.languageCode);
                            sbLIZ2.append('_');
                            sbLIZ2.append(ttsInfos3.format);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        } else {
                            PlayAddress playAddress2 = ttsInfos3.playAddress;
                            if (playAddress2 != null) {
                                strLIZIZ = playAddress2.fileHash;
                            } else {
                                strLIZIZ = null;
                            }
                        }
                        C1477980oZ2 c1477980oZ2 = new C1477980oZ2();
                        String str8 = ttsInfos3.voiceType;
                        if (str8 != null) {
                            c1477980oZ2.LIZ.setVoiceType(str8);
                        }
                        Integer num = ttsInfos3.bitRate;
                        if (num != null) {
                            c1477980oZ2.LIZ.setBitRate(Integer.valueOf(num.intValue()));
                        } else {
                            List<BitRate> bitRate2 = video.getBitRate();
                            if (bitRate2 != null && (bitRate = (BitRate) C13LP.LJJJLL(bitRate2)) != null) {
                                c1477980oZ2.LIZ.setBitRate(Integer.valueOf(bitRate.getBitRate()));
                            }
                        }
                        String str9 = ttsInfos3.languageCode;
                        if (str9 != null) {
                            c1477980oZ2.LIZ.setLanguageCode(str9);
                        }
                        PlayAddress playAddress3 = ttsInfos3.playAddress;
                        if (playAddress3 != null && (list2 = playAddress3.urlList) != null) {
                            c1477980oZ2.LIZJ(list2);
                        }
                        PlayAddress playAddress4 = ttsInfos3.playAddress;
                        if (playAddress4 == null || (str3 = playAddress4.urlKey) == null) {
                            str3 = strLIZIZ;
                        }
                        c1477980oZ2.LIZ.setFileKey(str3);
                        PlayAddress playAddress5 = ttsInfos3.playAddress;
                        if (playAddress5 == null || (str4 = playAddress5.urlKey) == null) {
                            str4 = strLIZIZ;
                        }
                        c1477980oZ2.LIZLLL(str4);
                        PlayAddress playAddress6 = ttsInfos3.playAddress;
                        if (playAddress6 != null && playAddress6.fileHash != null) {
                            c1477980oZ2.LIZIZ(strLIZIZ);
                        }
                        c1477980oZ2.LIZ.setCdnUrlExpired(Long.valueOf(audio.getCdnUrlExpired()));
                        PlayAddress playAddress7 = ttsInfos3.playAddress;
                        if (playAddress7 != null && (str5 = playAddress7.fileCS) != null) {
                            c1477980oZ2.LIZ(str5);
                        }
                        String str10 = ttsInfos3.volumeInfo;
                        if (str10 != null) {
                            c1477980oZ2.LIZ.setVolumeInfo(str10);
                        }
                        String str11 = ttsInfos3.format;
                        if (str11 != null) {
                            c1477980oZ2.LIZ.setFormat(str11);
                        }
                        String str12 = ttsInfos3.subInfo;
                        if (str12 != null) {
                            c1477980oZ2.LIZ.setSubInfo(str12);
                        }
                        int i = infoId + 1;
                        c1477980oZ2.LIZ.setInfoId(Integer.valueOf(infoId));
                        try {
                            c1477980oZ2.LIZ.setLoudness(Float.valueOf((float) JSONObjectProtectorUtils.getDouble(new JSONObject(ttsInfos3.volumeInfo), "Loudness")));
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        try {
                            c1477980oZ2.LIZ.setPeak(Float.valueOf((float) JSONObjectProtectorUtils.getDouble(new JSONObject(ttsInfos3.volumeInfo), "Peak")));
                        } catch (JSONException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        PlayAddress playAddress8 = ttsInfos3.playAddress;
                        if (playAddress8 != null && (list = playAddress8.urlList) != null) {
                            C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
                        }
                        c1477980oZ2.LIZ.setCreateTime(SystemClock.elapsedRealtime());
                        arrayList.add(c1477980oZ2.LIZ);
                        infoId = i;
                    }
                }
                VideoUrlModel videoUrlModel2 = video.playAddr;
                if (videoUrlModel2 != null && (urlList = videoUrlModel2.getUrlList()) != null && C13LP.LJJJLL(urlList) != null) {
                    return arrayList;
                }
            }
            return null;
        }
    }
}
