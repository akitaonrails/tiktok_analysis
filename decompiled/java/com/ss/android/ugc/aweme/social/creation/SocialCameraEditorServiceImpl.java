package com.ss.android.ugc.aweme.social.creation;

import X.AbstractC20660115st;
import X.AnonymousClass0515;
import X.C08A4;
import X.C098200Yq;
import X.C1227904rF;
import X.C13BV;
import X.C13LP;
import X.C1416310mxZ;
import X.C1430790nKv;
import X.C1433530nPL;
import X.C1434310nQb;
import X.C1434760nRK;
import X.C15438062q;
import X.C1697810uHb;
import X.C189200o6;
import X.C19719612Di;
import X.C19744512Mx;
import X.C19A3;
import X.C19EG;
import X.C2097908Jt;
import X.C2232408os;
import X.C351220Dpo;
import X.C352310DrZ;
import X.C354710DvR;
import X.C786410Ut5;
import X.InterfaceC20660615sy;
import android.app.Dialog;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.TTSocialFriendsEffect;
import com.ss.android.ugc.aweme.creative.model.TTSocialSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.social.creation.api.SocialCameraEditorService;
import com.ss.android.ugc.aweme.social.creation.api.edit.exp.SocialEffectNotificationExp;
import com.ss.android.ugc.aweme.social.creation.edit.SocialVideoEditContainerScene;
import com.ss.android.ugc.aweme.social.creation.record.SocialRecordScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public final class SocialCameraEditorServiceImpl implements SocialCameraEditorService {
    @Override // com.ss.android.ugc.aweme.social.creation.api.SocialCameraEditorService
    public final SocialRecordScene LIZ() {
        return new SocialRecordScene();
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.SocialCameraEditorService
    public final SocialVideoEditContainerScene LJFF() {
        return new SocialVideoEditContainerScene();
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.SocialCameraEditorService
    public final Class<? extends C19A3> LIZIZ() {
        return SocialVideoEditContainerScene.class;
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.SocialCameraEditorService
    public final Class<? extends C19A3> LIZJ() {
        return SocialRecordScene.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v4, types: [org.json.JSONObject] */
    @Override // com.ss.android.ugc.aweme.social.creation.api.SocialCameraEditorService
    public final List<String> LJ(VideoPublishEditModel videoPublishEditModel) {
        List<EditVideoSegment> videoList;
        boolean z;
        ?? arrayList;
        String resourceFile;
        Object next;
        TTSocialSegment tTSocialSegment;
        boolean z2;
        boolean z3;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        long jLongValue4;
        long jLongValue5;
        long jLongValue6;
        long jLongValue7;
        long jLongValue8;
        boolean z4;
        ArrayList arrayList2;
        boolean z5;
        String strJ3;
        Object c098200Yq;
        ?? jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArrayOptJSONArray;
        long jLongValue9;
        long jLongValue10;
        if (videoPublishEditModel == null) {
            return null;
        }
        C2232408os c2232408os = C19744512Mx.LIZ;
        ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
        EditPreviewInfo editPreviewInfo = videoPublishEditModel.getEditPreviewInfo();
        if (editPreviewInfo != null) {
            videoList = editPreviewInfo.getVideoList();
        } else {
            videoList = null;
        }
        if (videoList != null && finalVideoList.size() == videoList.size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Iterator<TimeSpeedModelExtension> it2 = finalVideoList.iterator();
            Iterator<EditVideoSegment> it3 = videoList.iterator();
            ArrayList arrayList3 = new ArrayList(Math.min(C15438062q.LJIJJ(finalVideoList, 10), C15438062q.LJIJJ(videoList, 10)));
            while (it2.hasNext() && it3.hasNext()) {
                TimeSpeedModelExtension next2 = it2.next();
                EditVideoSegment next3 = it3.next();
                TTSocialSegment tTSocialSegment2 = new TTSocialSegment(null, null, null);
                tTSocialSegment2.path = next3.getVideoPath();
                tTSocialSegment2.LIZ = next3.getVideoCutInfo();
                String str = next2.effectMessage;
                if (str != null && str.length() != 0) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (!z5 && C19744512Mx.LIZIZ(str)) {
                    try {
                        jSONObject = new JSONObject(str);
                        jSONObject2 = new JSONObject(jSONObject.optString("effect_state_json"));
                        jSONArrayOptJSONArray = jSONObject2.optJSONArray("tt_social_friends");
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (jSONArrayOptJSONArray == null) {
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                        C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        strJ3 = "";
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        int length = jSONArrayOptJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            C1227904rF c1227904rF = C1227904rF.LIZ;
                            String string = jSONArrayOptJSONArray.get(i).toString();
                            c1227904rF.getClass();
                            TTSocialFriendsEffect tTSocialFriendsEffect = (TTSocialFriendsEffect) C1227904rF.LIZIZ(string, TTSocialFriendsEffect.class);
                            if (tTSocialFriendsEffect != null) {
                                if (Intrinsics.LJFF(tTSocialFriendsEffect.visible, Boolean.TRUE)) {
                                    tTSocialFriendsEffect.setStartTime(tTSocialFriendsEffect.timestamp);
                                }
                                if (Intrinsics.LJFF(tTSocialFriendsEffect.visible, Boolean.FALSE)) {
                                    tTSocialFriendsEffect.setEndTime(tTSocialFriendsEffect.timestamp);
                                    Long l = tTSocialFriendsEffect.endTime;
                                    if (l != null) {
                                        jLongValue9 = l.longValue();
                                    } else {
                                        jLongValue9 = 0;
                                    }
                                    Long l2 = tTSocialFriendsEffect.startTime;
                                    if (l2 != null) {
                                        jLongValue10 = l2.longValue();
                                    } else {
                                        jLongValue10 = 0;
                                    }
                                    try {
                                        tTSocialFriendsEffect.setDuration(jLongValue9 - jLongValue10);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        TryCatchGuardChecker.doCheck(th);
                                        c098200Yq = new C098200Yq(th);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                        C189200o6.m5exceptionOrNullimpl(c098200Yq);
                                        strJ3 = "";
                                        tTSocialSegment2.socialFriendEffects = C19744512Mx.LJ(strJ3);
                                        arrayList3.add(tTSocialSegment2);
                                    }
                                }
                            }
                            if (tTSocialFriendsEffect != null) {
                                arrayList4.add(tTSocialFriendsEffect);
                            }
                        }
                        List<TTSocialFriendsEffect> listLIZJ = C19744512Mx.LIZJ(arrayList4);
                        JSONArray jSONArray = new JSONArray();
                        for (TTSocialFriendsEffect tTSocialFriendsEffect2 : listLIZJ) {
                            C1227904rF.LIZ.getClass();
                            jSONArray.put(C1227904rF.LJI(tTSocialFriendsEffect2));
                        }
                        jSONObject2.put("tt_social_friends", jSONArray);
                        jSONObject.put("effect_state_json", jSONObject2);
                        strJ3 = C786410Ut5.J3(jSONObject);
                    }
                } else {
                    strJ3 = "";
                }
                tTSocialSegment2.socialFriendEffects = C19744512Mx.LJ(strJ3);
                arrayList3.add(tTSocialSegment2);
            }
            ArrayList arrayList5 = new ArrayList(arrayList3);
            NLEModel nLEModelLJJLIIIJILLIZJL = C1416310mxZ.LJJLIIIJILLIZJL(videoPublishEditModel);
            if (nLEModelLJJLIIIJILLIZJL == null || !C19744512Mx.LIZ(videoPublishEditModel)) {
                arrayList = C13BV.INSTANCE;
            } else {
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList5, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (Object obj : arrayList5) {
                    linkedHashMap.put(((TTSocialSegment) obj).path, obj);
                }
                arrayList = new ArrayList();
                VecNLETrackSPtr tracks = nLEModelLJJLIIIJILLIZJL.getTracks();
                ArrayList arrayList6 = new ArrayList();
                for (NLETrack nLETrack : tracks) {
                    if (C351220Dpo.LLLLJ(nLETrack)) {
                        arrayList6.add(nLETrack);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    C19719612Di.LJJI(((NLETrack) it4.next()).getSlots(), arrayList7);
                }
                int i2 = 0;
                for (Object obj2 : arrayList7) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) ((NLETrackSlot) obj2).getMainSegment());
                        if (nLESegmentVideoDynamicCast != null) {
                            NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
                            if (resource != null) {
                                resourceFile = resource.getResourceFile();
                            } else {
                                resourceFile = null;
                            }
                            int iLIZ = C352310DrZ.LIZ(nLESegmentVideoDynamicCast.getTimeClipStart());
                            int iLIZ2 = C352310DrZ.LIZ(nLESegmentVideoDynamicCast.getTimeClipEnd());
                            IntRange intRange = new IntRange(iLIZ, iLIZ2);
                            ArrayList arrayList8 = new ArrayList();
                            for (Object obj3 : arrayList5) {
                                if (Intrinsics.LJFF(((TTSocialSegment) obj3).path, resourceFile)) {
                                    arrayList8.add(obj3);
                                }
                            }
                            if (!arrayList8.isEmpty()) {
                                if (arrayList8.size() == 1) {
                                    tTSocialSegment = (TTSocialSegment) C13LP.LJJJJZI(arrayList8);
                                } else {
                                    Iterator it5 = arrayList8.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            next = it5.next();
                                            VideoCutInfo videoCutInfo = ((TTSocialSegment) next).LIZ;
                                            if (videoCutInfo != null && videoCutInfo.getEnd() == iLIZ2) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                break;
                                            }
                                        } else {
                                            next = null;
                                            break;
                                        }
                                    }
                                    tTSocialSegment = (TTSocialSegment) next;
                                }
                                if (tTSocialSegment != null) {
                                    List<TTSocialFriendsEffect> list = tTSocialSegment.socialFriendEffects;
                                    if (list != null && !list.isEmpty()) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (!z3 && Intrinsics.LJFF(tTSocialSegment.path, resourceFile)) {
                                        ArrayList arrayList9 = new ArrayList();
                                        List<TTSocialFriendsEffect> list2 = tTSocialSegment.socialFriendEffects;
                                        if (list2 != null) {
                                            for (TTSocialFriendsEffect tTSocialFriendsEffect3 : list2) {
                                                if (!C08A4.LIZIZ(tTSocialFriendsEffect3.endTime)) {
                                                    tTSocialFriendsEffect3.setEndTime(Long.valueOf(intRange.LLILLJJLI));
                                                }
                                                Long l3 = tTSocialFriendsEffect3.endTime;
                                                if (l3 != null) {
                                                    jLongValue = l3.longValue();
                                                } else {
                                                    jLongValue = 0;
                                                }
                                                if (jLongValue >= intRange.LL) {
                                                    Long l4 = tTSocialFriendsEffect3.startTime;
                                                    if (l4 != null) {
                                                        jLongValue2 = l4.longValue();
                                                    } else {
                                                        jLongValue2 = 0;
                                                    }
                                                    if (jLongValue2 <= intRange.LLILLJJLI) {
                                                        Long l5 = tTSocialFriendsEffect3.endTime;
                                                        if (l5 != null) {
                                                            jLongValue3 = l5.longValue();
                                                        } else {
                                                            jLongValue3 = 0;
                                                        }
                                                        long j = intRange.LLILLJJLI;
                                                        if (jLongValue3 >= j) {
                                                            tTSocialFriendsEffect3.setEndTime(Long.valueOf(j));
                                                        }
                                                        Long l6 = tTSocialFriendsEffect3.startTime;
                                                        if (l6 != null) {
                                                            jLongValue4 = l6.longValue();
                                                        } else {
                                                            jLongValue4 = 0;
                                                        }
                                                        long j2 = intRange.LL;
                                                        if (jLongValue4 <= j2) {
                                                            tTSocialFriendsEffect3.setStartTime(Long.valueOf(j2));
                                                        }
                                                        Long l7 = tTSocialFriendsEffect3.endTime;
                                                        if (l7 != null) {
                                                            jLongValue5 = l7.longValue();
                                                        } else {
                                                            jLongValue5 = 0;
                                                        }
                                                        Long l8 = tTSocialFriendsEffect3.startTime;
                                                        if (l8 != null) {
                                                            jLongValue6 = l8.longValue();
                                                        } else {
                                                            jLongValue6 = 0;
                                                        }
                                                        tTSocialFriendsEffect3.setDuration(jLongValue5 - jLongValue6);
                                                        Long l9 = tTSocialFriendsEffect3.startTime;
                                                        if (l9 != null) {
                                                            jLongValue7 = l9.longValue();
                                                        } else {
                                                            jLongValue7 = 0;
                                                        }
                                                        Long l10 = tTSocialFriendsEffect3.endTime;
                                                        if (l10 != null) {
                                                            jLongValue8 = l10.longValue();
                                                        } else {
                                                            jLongValue8 = 0;
                                                        }
                                                        C354710DvR c354710DvR = new C354710DvR(jLongValue7, jLongValue8);
                                                        if (jLongValue7 < intRange.LLILLJJLI && intRange.LL < c354710DvR.LLILLJJLI) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        if (z4) {
                                                            arrayList9.add(tTSocialFriendsEffect3);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                        for (Object obj4 : arrayList9) {
                                            String str2 = ((TTSocialFriendsEffect) obj4).uid;
                                            Object arrayList10 = linkedHashMap2.get(str2);
                                            if (arrayList10 == null) {
                                                arrayList10 = new ArrayList();
                                                linkedHashMap2.put(str2, arrayList10);
                                            }
                                            ((List) arrayList10).add(obj4);
                                        }
                                        ArrayList arrayList11 = new ArrayList(linkedHashMap2.size());
                                        for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                            entry.getKey();
                                            List list3 = (List) entry.getValue();
                                            TTSocialFriendsEffect tTSocialFriendsEffect4 = (TTSocialFriendsEffect) C13LP.LJJJJZI(list3);
                                            Iterator it6 = list3.iterator();
                                            long j3 = 0;
                                            while (it6.hasNext()) {
                                                j3 += ((TTSocialFriendsEffect) it6.next()).duration;
                                            }
                                            arrayList11.add(tTSocialFriendsEffect4.copy(tTSocialFriendsEffect4.visible, tTSocialFriendsEffect4.timestamp, tTSocialFriendsEffect4.id, tTSocialFriendsEffect4.uid, tTSocialFriendsEffect4.startTime, tTSocialFriendsEffect4.endTime, j3));
                                        }
                                        tTSocialSegment.socialFriendEffects = new ArrayList(arrayList11);
                                        arrayList.add(tTSocialSegment);
                                    }
                                }
                            }
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList2 = new ArrayList(C15438062q.LJIJJ(finalVideoList, 10));
                Iterator<TimeSpeedModelExtension> it7 = finalVideoList.iterator();
                while (it7.hasNext()) {
                    arrayList2.add(C19744512Mx.LIZLLL(it7.next(), null));
                }
            } else {
                Iterator<TimeSpeedModelExtension> it8 = finalVideoList.iterator();
                Iterator it9 = arrayList.iterator();
                arrayList2 = new ArrayList(Math.min(C15438062q.LJIJJ(finalVideoList, 10), C15438062q.LJIJJ(arrayList, 10)));
                while (it8.hasNext() && it9.hasNext()) {
                    arrayList2.add(C19744512Mx.LIZLLL(it8.next(), (TTSocialSegment) it9.next()));
                }
            }
            return C13LP.LJJJJLI(arrayList2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Oub] */
    @Override // com.ss.android.ugc.aweme.social.creation.api.SocialCameraEditorService
    public final boolean LIZLLL(final C19EG c19eg, VideoPublishEditModel videoPublishEditModel) {
        if ((SocialEffectNotificationExp.LJ || (SocialEffectNotificationExp.LIZJ && !((Boolean) AnonymousClass0515.LIZ(Boolean.FALSE, "social_friends_shown")).booleanValue())) && videoPublishEditModel != null && C19744512Mx.LIZ(videoPublishEditModel)) {
            final ?? r0 = new InterfaceC20660615sy() { // from class: X.0Oub
                @Override // X.InterfaceC20660615sy
                public final boolean t2() {
                    return true;
                }

                @Override // X.InterfaceC20658015sY
                public final boolean Xu() {
                    return !c19eg.isFinishing();
                }

                @Override // X.InterfaceC20658015sY
                public final C688120Qyw i2() {
                    C19EG c19eg2 = c19eg;
                    return new C688120Qyw(c19eg2, c19eg2, null);
                }

                @Override // X.InterfaceC20658015sY
                public final String getSceneId() {
                    return C634060Otw.LIZ(this);
                }
            };
            PopupManager.LJIJI(new AbstractC20660115st<Dialog>(r0) { // from class: X.0TSB
                public final int LL = 10;

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return this.LL;
                }

                @Override // com.bytedance.poplayer.IPopupTask
                public final Object showPopup(C688120Qyw c688120Qyw) {
                    AnonymousClass0515.LIZIZ(Boolean.TRUE, "social_friends_shown");
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("enter_from", "video_edit_page");
                    C20684815ws.LJIILLIIL("ttsocial_effect_popup_show", c0lab.LIZ);
                    C1397580mTM c1397580mTM = new C1397580mTM(c688120Qyw.LIZ);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_bell;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                    C1235760iGM.LIZIZ(c1397580mTM, c419910GdJ.LIZ(c688120Qyw.LIZ));
                    c1397580mTM.LJFF(2131848584);
                    c1397580mTM.LIZ(2131848582);
                    C985403tE.LIZ(c1397580mTM, AFwS245S0000000_12.get$arr$(114));
                    c1397580mTM.LJII = false;
                    return new C1397510mTF(c1397580mTM).LJ();
                }
            }, true);
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.SocialCameraEditorService
    public final C1434760nRK LJI(C1433530nPL c1433530nPL, String str, C1430790nKv c1430790nKv, C1434310nQb c1434310nQb) {
        return new C1434760nRK(c1433530nPL, c1430790nKv, c1434310nQb);
    }
}
