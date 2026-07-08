package com.ss.android.ugc.aweme.feed.model;

import X.C13BV;
import X.C13LP;
import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class DashVideoModelUtil {
    public static final Companion Companion = new Companion();

    public static final class Companion {
        public final String getDashJsonStrFromVideo(Video video) {
            Object originUri;
            Long lValueOf;
            String quality;
            Long lValueOf2;
            Long lValueOf3;
            String codecType;
            String fileHash;
            String mainUrl;
            String backupUrl;
            String fallbackUrl;
            String subInfo;
            String fileId;
            String fidProfileLabels;
            BitrateUrlStruct urlList;
            BitrateUrlStruct urlList2;
            BitrateUrlStruct urlList3;
            JSONObject jSONObject;
            int bitRate;
            String strOptString;
            String strOptString2;
            String strOptString3;
            String strOptString4;
            String strOptString5;
            Integer numValueOf;
            Integer numValueOf2;
            String fileHash2;
            String strOptString6;
            String strOptString7;
            String str;
            String str2;
            String str3;
            String str4;
            if (video != null && video.hasDashBitrate()) {
                List<BitRate> rawBitRate = video.getRawBitRate();
                if (rawBitRate == null) {
                    rawBitRate = C13BV.INSTANCE;
                }
                List<BitrateAudioStruct> list = video.bitRateAudio;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                String str5 = video.meta;
                VideoUrlModel videoUrlModel = video.playAddr;
                if (videoUrlModel != null) {
                    originUri = videoUrlModel.getOriginUri();
                } else {
                    originUri = null;
                }
                int duration = video.getDuration();
                Object didProfileLabels = video.getDidProfileLabels();
                Object vidProfileLabels = video.getVidProfileLabels();
                if ((!rawBitRate.isEmpty()) || (!list.isEmpty())) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str5);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("enable_video_dash_reconstruct", 1);
                        jSONObject3.put("video_meta", jSONObject2.optString("video_meta"));
                        jSONObject3.put("video_id", originUri);
                        jSONObject3.put("video_duration", Float.valueOf(duration / 1000.0f));
                        jSONObject3.put("media_type", "video");
                        jSONObject3.put("did_profile_labels", didProfileLabels);
                        jSONObject3.put("vid_profile_labels", vidProfileLabels);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("dynamic_type", "segment_base");
                        JSONArray jSONArray = new JSONArray();
                        for (BitRate bitRate2 : rawBitRate) {
                            if (!TextUtils.isEmpty(bitRate2.videoExtra)) {
                                jSONObject = new JSONObject(bitRate2.videoExtra);
                            } else {
                                jSONObject = null;
                            }
                            if (jSONObject == null) {
                                bitRate = bitRate2.getBitRate();
                            } else {
                                bitRate = jSONObject.optInt("real_bitrate", bitRate2.getBitRate());
                            }
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("real_bitrate", bitRate);
                            jSONObject5.put("fps", bitRate2.fps);
                            if (jSONObject == null) {
                                strOptString = null;
                            } else {
                                strOptString = jSONObject.optString("definition");
                            }
                            jSONObject5.put("definition", strOptString);
                            if (jSONObject == null) {
                                strOptString2 = null;
                            } else {
                                strOptString2 = jSONObject.optString("quality");
                            }
                            jSONObject5.put("quality", strOptString2);
                            if (jSONObject == null) {
                                strOptString3 = null;
                            } else {
                                strOptString3 = jSONObject.optString("audio_file_id");
                            }
                            jSONObject5.put("audio_file_id", strOptString3);
                            if (jSONObject == null) {
                                strOptString4 = null;
                            } else {
                                strOptString4 = jSONObject.optString("mvmaf");
                            }
                            jSONObject5.put("mvmaf", strOptString4);
                            if (jSONObject == null) {
                                strOptString5 = null;
                            } else {
                                strOptString5 = jSONObject.optString("gearvqm");
                            }
                            jSONObject5.put("gearvqm", strOptString5);
                            jSONObject5.put("vtype", "dash");
                            UrlModel playAddr = bitRate2.getPlayAddr();
                            if (playAddr != null) {
                                numValueOf = Integer.valueOf(playAddr.getWidth());
                            } else {
                                numValueOf = null;
                            }
                            jSONObject5.put("vwidth", numValueOf);
                            UrlModel playAddr2 = bitRate2.getPlayAddr();
                            if (playAddr2 != null) {
                                numValueOf2 = Integer.valueOf(playAddr2.getHeight());
                            } else {
                                numValueOf2 = null;
                            }
                            jSONObject5.put("vheight", numValueOf2);
                            jSONObject5.put("bitrate", bitRate2.getBitRate());
                            jSONObject5.put("size", bitRate2.getSize());
                            int iIsBytevc1 = bitRate2.isBytevc1();
                            String str6 = "h264";
                            if (iIsBytevc1 != 0) {
                                if (iIsBytevc1 != 1) {
                                    if (iIsBytevc1 == 2) {
                                        str6 = "bytevc2";
                                    }
                                } else {
                                    str6 = "bytevc1";
                                }
                            }
                            jSONObject5.put("codec_type", str6);
                            UrlModel playAddr3 = bitRate2.getPlayAddr();
                            if (playAddr3 != null) {
                                fileHash2 = playAddr3.getFileHash();
                            } else {
                                fileHash2 = null;
                            }
                            jSONObject5.put("file_hash", fileHash2);
                            if (jSONObject == null) {
                                strOptString6 = null;
                            } else {
                                strOptString6 = jSONObject.optString("file_id");
                            }
                            jSONObject5.put("file_id", strOptString6);
                            List<String> listUrlList = bitRate2.urlList();
                            if (listUrlList != null && (str4 = (String) C13LP.LJJJLZIJ(0, listUrlList)) != null) {
                                jSONObject5.put("main_url", str4);
                            }
                            List<String> listUrlList2 = bitRate2.urlList();
                            if (listUrlList2 != null && (str3 = (String) C13LP.LJJJLZIJ(1, listUrlList2)) != null) {
                                jSONObject5.put("backup_url_1", str3);
                            }
                            List<String> listUrlList3 = bitRate2.urlList();
                            if (listUrlList3 != null && (str2 = (String) C13LP.LJJJLZIJ(2, listUrlList3)) != null) {
                                jSONObject5.put("backup_url_2", str2);
                            }
                            List<String> listUrlList4 = bitRate2.urlList();
                            if (listUrlList4 != null && (str = (String) C13LP.LJJJLZIJ(3, listUrlList4)) != null) {
                                jSONObject5.put("backup_url_3", str);
                            }
                            if (jSONObject == null) {
                                strOptString7 = null;
                            } else {
                                strOptString7 = jSONObject.optString("sub_info");
                            }
                            jSONObject5.put("sub_info", strOptString7);
                            jSONObject5.put("fid_profile_labels", bitRate2.getFidProfileLabels());
                            jSONObject5.put("hdr_type", bitRate2.getHdrType());
                            jSONObject5.put("gear_name", bitRate2.getGearName());
                            jSONArray.put(jSONObject5);
                        }
                        jSONObject4.put("dynamic_video_list", jSONArray);
                        JSONArray jSONArray2 = new JSONArray();
                        for (BitrateAudioStruct bitrateAudioStruct : list) {
                            JSONObject jSONObject6 = new JSONObject();
                            BitrateMetaStruct audioMeta = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta != null) {
                                lValueOf = Long.valueOf(audioMeta.getBitrate());
                            } else {
                                lValueOf = null;
                            }
                            jSONObject6.put("real_bitrate", lValueOf);
                            BitrateMetaStruct audioMeta2 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta2 != null) {
                                quality = audioMeta2.getQuality();
                            } else {
                                quality = null;
                            }
                            jSONObject6.put("quality", quality);
                            jSONObject6.put("vtype", "dash");
                            BitrateMetaStruct audioMeta3 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta3 != null) {
                                lValueOf2 = Long.valueOf(audioMeta3.getBitrate());
                            } else {
                                lValueOf2 = null;
                            }
                            jSONObject6.put("bitrate", lValueOf2);
                            BitrateMetaStruct audioMeta4 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta4 != null) {
                                lValueOf3 = Long.valueOf(audioMeta4.getSize());
                            } else {
                                lValueOf3 = null;
                            }
                            jSONObject6.put("size", lValueOf3);
                            BitrateMetaStruct audioMeta5 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta5 != null) {
                                codecType = audioMeta5.getCodecType();
                            } else {
                                codecType = null;
                            }
                            jSONObject6.put("codec_type", codecType);
                            BitrateMetaStruct audioMeta6 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta6 != null) {
                                fileHash = audioMeta6.getFileHash();
                            } else {
                                fileHash = null;
                            }
                            jSONObject6.put("file_hash", fileHash);
                            BitrateMetaStruct audioMeta7 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta7 != null && (urlList3 = audioMeta7.getUrlList()) != null) {
                                mainUrl = urlList3.getMainUrl();
                            } else {
                                mainUrl = null;
                            }
                            jSONObject6.put("main_url", mainUrl);
                            BitrateMetaStruct audioMeta8 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta8 != null && (urlList2 = audioMeta8.getUrlList()) != null) {
                                backupUrl = urlList2.getBackupUrl();
                            } else {
                                backupUrl = null;
                            }
                            jSONObject6.put("backup_url_1", backupUrl);
                            BitrateMetaStruct audioMeta9 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta9 != null && (urlList = audioMeta9.getUrlList()) != null) {
                                fallbackUrl = urlList.getFallbackUrl();
                            } else {
                                fallbackUrl = null;
                            }
                            jSONObject6.put("backup_url_2", fallbackUrl);
                            BitrateMetaStruct audioMeta10 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta10 != null) {
                                subInfo = audioMeta10.getSubInfo();
                            } else {
                                subInfo = null;
                            }
                            jSONObject6.put("sub_info", subInfo);
                            BitrateMetaStruct audioMeta11 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta11 != null) {
                                fileId = audioMeta11.getFileId();
                            } else {
                                fileId = null;
                            }
                            jSONObject6.put("file_id", fileId);
                            BitrateMetaStruct audioMeta12 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta12 != null) {
                                fidProfileLabels = audioMeta12.getFidProfileLabels();
                            } else {
                                fidProfileLabels = null;
                            }
                            jSONObject6.put("fid_profile_labels", fidProfileLabels);
                            jSONArray2.put(jSONObject6);
                        }
                        jSONObject4.put("dynamic_audio_list", jSONArray2);
                        jSONObject3.put("dynamic_video", jSONObject4);
                        return C786410Ut5.J3(jSONObject3);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return null;
                    }
                }
            }
            return null;
        }

        public final Map<String, Object> getDashMapFromVideo(Video video) {
            String originUri;
            Long lValueOf;
            String quality;
            Long lValueOf2;
            Long lValueOf3;
            String codecType;
            String fileHash;
            String mainUrl;
            String backupUrl;
            String fallbackUrl;
            String subInfo;
            String fileId;
            String fidProfileLabels;
            BitrateUrlStruct urlList;
            BitrateUrlStruct urlList2;
            BitrateUrlStruct urlList3;
            JSONObject jSONObject;
            int bitRate;
            String strOptString;
            String strOptString2;
            String strOptString3;
            String strOptString4;
            String strOptString5;
            Integer numValueOf;
            Integer numValueOf2;
            String fileHash2;
            String strOptString6;
            String strOptString7;
            String str;
            String str2;
            String str3;
            String str4;
            if (video != null && video.hasDashBitrate()) {
                List<BitRate> rawBitRate = video.getRawBitRate();
                if (rawBitRate == null) {
                    rawBitRate = C13BV.INSTANCE;
                }
                List<BitrateAudioStruct> list = video.bitRateAudio;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                String str5 = video.meta;
                VideoUrlModel videoUrlModel = video.playAddr;
                if (videoUrlModel != null) {
                    originUri = videoUrlModel.getOriginUri();
                } else {
                    originUri = null;
                }
                int duration = video.getDuration();
                String didProfileLabels = video.getDidProfileLabels();
                String vidProfileLabels = video.getVidProfileLabels();
                if ((!rawBitRate.isEmpty()) || (!list.isEmpty())) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str5);
                        HashMap map = new HashMap();
                        map.put("enable_video_dash_reconstruct", 1);
                        map.put("video_meta", jSONObject2.optString("video_meta"));
                        map.put("video_id", originUri);
                        map.put("video_duration", Float.valueOf(duration / 1000.0f));
                        map.put("media_type", "video");
                        map.put("did_profile_labels", didProfileLabels);
                        map.put("vid_profile_labels", vidProfileLabels);
                        HashMap map2 = new HashMap();
                        map2.put("dynamic_type", "segment_base");
                        ArrayList arrayList = new ArrayList();
                        for (BitRate bitRate2 : rawBitRate) {
                            if (!TextUtils.isEmpty(bitRate2.videoExtra)) {
                                jSONObject = new JSONObject(bitRate2.videoExtra);
                            } else {
                                jSONObject = null;
                            }
                            if (jSONObject == null) {
                                bitRate = bitRate2.getBitRate();
                            } else {
                                bitRate = jSONObject.optInt("real_bitrate", bitRate2.getBitRate());
                            }
                            HashMap map3 = new HashMap();
                            map3.put("real_bitrate", Integer.valueOf(bitRate));
                            map3.put("fps", bitRate2.fps);
                            if (jSONObject == null) {
                                strOptString = null;
                            } else {
                                strOptString = jSONObject.optString("definition");
                            }
                            map3.put("definition", strOptString);
                            if (jSONObject == null) {
                                strOptString2 = null;
                            } else {
                                strOptString2 = jSONObject.optString("quality");
                            }
                            map3.put("quality", strOptString2);
                            if (jSONObject == null) {
                                strOptString3 = null;
                            } else {
                                strOptString3 = jSONObject.optString("mvmaf");
                            }
                            map3.put("mvmaf", strOptString3);
                            if (jSONObject == null) {
                                strOptString4 = null;
                            } else {
                                strOptString4 = jSONObject.optString("gearvqm");
                            }
                            map3.put("gearvqm", strOptString4);
                            if (jSONObject == null) {
                                strOptString5 = null;
                            } else {
                                strOptString5 = jSONObject.optString("audio_file_id");
                            }
                            map3.put("audio_file_id", strOptString5);
                            map3.put("vtype", "dash");
                            UrlModel playAddr = bitRate2.getPlayAddr();
                            if (playAddr != null) {
                                numValueOf = Integer.valueOf(playAddr.getWidth());
                            } else {
                                numValueOf = null;
                            }
                            map3.put("vwidth", numValueOf);
                            UrlModel playAddr2 = bitRate2.getPlayAddr();
                            if (playAddr2 != null) {
                                numValueOf2 = Integer.valueOf(playAddr2.getHeight());
                            } else {
                                numValueOf2 = null;
                            }
                            map3.put("vheight", numValueOf2);
                            map3.put("bitrate", Integer.valueOf(bitRate2.getBitRate()));
                            map3.put("size", Integer.valueOf(bitRate2.getSize()));
                            int iIsBytevc1 = bitRate2.isBytevc1();
                            String str6 = "h264";
                            if (iIsBytevc1 != 0) {
                                if (iIsBytevc1 != 1) {
                                    if (iIsBytevc1 == 2) {
                                        str6 = "bytevc2";
                                    }
                                } else {
                                    str6 = "bytevc1";
                                }
                            }
                            map3.put("codec_type", str6);
                            UrlModel playAddr3 = bitRate2.getPlayAddr();
                            if (playAddr3 != null) {
                                fileHash2 = playAddr3.getFileHash();
                            } else {
                                fileHash2 = null;
                            }
                            map3.put("file_hash", fileHash2);
                            if (jSONObject == null) {
                                strOptString6 = null;
                            } else {
                                strOptString6 = jSONObject.optString("file_id");
                            }
                            map3.put("file_id", strOptString6);
                            List<String> listUrlList = bitRate2.urlList();
                            if (listUrlList != null && (str4 = (String) C13LP.LJJJLZIJ(0, listUrlList)) != null) {
                                map3.put("main_url", str4);
                            }
                            List<String> listUrlList2 = bitRate2.urlList();
                            if (listUrlList2 != null && (str3 = (String) C13LP.LJJJLZIJ(1, listUrlList2)) != null) {
                                map3.put("backup_url_1", str3);
                            }
                            List<String> listUrlList3 = bitRate2.urlList();
                            if (listUrlList3 != null && (str2 = (String) C13LP.LJJJLZIJ(2, listUrlList3)) != null) {
                                map3.put("backup_url_2", str2);
                            }
                            List<String> listUrlList4 = bitRate2.urlList();
                            if (listUrlList4 != null && (str = (String) C13LP.LJJJLZIJ(3, listUrlList4)) != null) {
                                map3.put("backup_url_3", str);
                            }
                            if (jSONObject == null) {
                                strOptString7 = null;
                            } else {
                                strOptString7 = jSONObject.optString("sub_info");
                            }
                            map3.put("sub_info", strOptString7);
                            map3.put("fid_profile_labels", bitRate2.getFidProfileLabels());
                            map3.put("hdr_type", Integer.valueOf(bitRate2.getHdrType()));
                            map3.put("gear_name", bitRate2.getGearName());
                            arrayList.add(map3);
                        }
                        map2.put("dynamic_video_list", arrayList);
                        ArrayList arrayList2 = new ArrayList();
                        for (BitrateAudioStruct bitrateAudioStruct : list) {
                            HashMap map4 = new HashMap();
                            BitrateMetaStruct audioMeta = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta != null) {
                                lValueOf = Long.valueOf(audioMeta.getBitrate());
                            } else {
                                lValueOf = null;
                            }
                            map4.put("real_bitrate", lValueOf);
                            BitrateMetaStruct audioMeta2 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta2 != null) {
                                quality = audioMeta2.getQuality();
                            } else {
                                quality = null;
                            }
                            map4.put("quality", quality);
                            map4.put("vtype", "dash");
                            BitrateMetaStruct audioMeta3 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta3 != null) {
                                lValueOf2 = Long.valueOf(audioMeta3.getBitrate());
                            } else {
                                lValueOf2 = null;
                            }
                            map4.put("bitrate", lValueOf2);
                            BitrateMetaStruct audioMeta4 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta4 != null) {
                                lValueOf3 = Long.valueOf(audioMeta4.getSize());
                            } else {
                                lValueOf3 = null;
                            }
                            map4.put("size", lValueOf3);
                            BitrateMetaStruct audioMeta5 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta5 != null) {
                                codecType = audioMeta5.getCodecType();
                            } else {
                                codecType = null;
                            }
                            map4.put("codec_type", codecType);
                            BitrateMetaStruct audioMeta6 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta6 != null) {
                                fileHash = audioMeta6.getFileHash();
                            } else {
                                fileHash = null;
                            }
                            map4.put("file_hash", fileHash);
                            BitrateMetaStruct audioMeta7 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta7 != null && (urlList3 = audioMeta7.getUrlList()) != null) {
                                mainUrl = urlList3.getMainUrl();
                            } else {
                                mainUrl = null;
                            }
                            map4.put("main_url", mainUrl);
                            BitrateMetaStruct audioMeta8 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta8 != null && (urlList2 = audioMeta8.getUrlList()) != null) {
                                backupUrl = urlList2.getBackupUrl();
                            } else {
                                backupUrl = null;
                            }
                            map4.put("backup_url_1", backupUrl);
                            BitrateMetaStruct audioMeta9 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta9 != null && (urlList = audioMeta9.getUrlList()) != null) {
                                fallbackUrl = urlList.getFallbackUrl();
                            } else {
                                fallbackUrl = null;
                            }
                            map4.put("backup_url_2", fallbackUrl);
                            BitrateMetaStruct audioMeta10 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta10 != null) {
                                subInfo = audioMeta10.getSubInfo();
                            } else {
                                subInfo = null;
                            }
                            map4.put("sub_info", subInfo);
                            BitrateMetaStruct audioMeta11 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta11 != null) {
                                fileId = audioMeta11.getFileId();
                            } else {
                                fileId = null;
                            }
                            map4.put("file_id", fileId);
                            BitrateMetaStruct audioMeta12 = bitrateAudioStruct.getAudioMeta();
                            if (audioMeta12 != null) {
                                fidProfileLabels = audioMeta12.getFidProfileLabels();
                            } else {
                                fidProfileLabels = null;
                            }
                            map4.put("fid_profile_labels", fidProfileLabels);
                            arrayList2.add(map4);
                        }
                        map2.put("dynamic_audio_list", arrayList2);
                        map.put("dynamic_video", map2);
                        return map;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return null;
                    }
                }
            }
            return null;
        }
    }
}
