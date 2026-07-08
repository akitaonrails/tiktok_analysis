package l5a;

import X.AbstractC1429940nJY;
import X.C09JN;
import X.C11K9;
import X.C11NZ;
import X.C11RO;
import X.C11S5;
import X.C1429980nJc;
import X.C1430450nKN;
import X.C1430540nKW;
import X.C1697810uHb;
import X.C19482111Jz;
import X.C19487811Me;
import X.C19501611Rm;
import X.InterfaceC1430460nKO;
import Y.AfS191S0100000_22;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.creative.model.AutoSelectedAnchorInfos;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class a {
    public static final a LIZIZ;
    public final /* synthetic */ C1430540nKW LIZ = new C1430540nKW();

    static {
        a aVar = new a();
        LIZIZ = aVar;
        ((ArrayList) aVar.LIZ.LIZ).addAll(C1697810uHb.LJIIJJI(new AbstractC1429940nJY() { // from class: X.0nJV
            public final C07YB LIZLLL = new C07YB(null, null, null, null, 15);

            @Override // X.AbstractC1429970nJb
            public final /* bridge */ /* synthetic */ C07YC LIZLLL() {
                return this.LIZLLL;
            }

            @Override // X.AbstractC1429970nJb
            public final C07YC LJII(LinkedHashMap linkedHashMap) {
                String str;
                Object obj = linkedHashMap.get("text_extra");
                if ((obj instanceof String) && (str = (String) obj) != null) {
                    List listLJ = C08JS.LJ(AVTextExtraStruct[].class, str);
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJ, 10));
                    Iterator it2 = listLJ.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((AVTextExtraStruct) it2.next()).hashTagName);
                    }
                    return new C07YB(null, null, null, C189100o5.LIZ(arrayList), 7);
                }
                return this.LIZLLL;
            }

            @Override // X.AbstractC1429970nJb
            public final C07YC LJ(ShortVideoContext shortVideoContext, List list) {
                String str;
                List<String> challengeNames;
                AVChallenge recordChallenge = shortVideoContext.creativeModel.commerceModel.getRecordChallenge();
                if (recordChallenge == null || (str = recordChallenge.challengeName) == null) {
                    str = "";
                }
                Mission mission = shortVideoContext.creativeModel.commerceModel.getMission();
                if (mission != null) {
                    challengeNames = mission.getChallengeNames();
                } else {
                    challengeNames = null;
                }
                return new C07YB(str, C189100o5.LIZ(challengeNames), null, null, 12);
            }

            @Override // X.AbstractC1429970nJb
            public final C07YC LJFF(VideoPublishEditModel videoPublishEditModel, EnumC1429920nJW enumC1429920nJW) {
                String str;
                List<String> challengeNames;
                List<AVTextExtraStruct> list;
                if (enumC1429920nJW == EnumC1429920nJW.BEFORE_REAL_PUBLISH) {
                    C0CHQ.LIZ().getPublishService().LJIIJJI();
                    if (C856610Xj1.LIZ(videoPublishEditModel)) {
                        list = videoPublishEditModel.creativeModel.postPageModel.captionModel.markupExtra;
                    } else {
                        list = videoPublishEditModel.creativeModel.postPageModel.markupExtra;
                    }
                    List listLIZ = C189100o5.LIZ(list);
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
                    Iterator it2 = listLIZ.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((AVTextExtraStruct) it2.next()).hashTagName);
                    }
                    return new C07YB(null, null, null, C189100o5.LIZ(arrayList), 7);
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(videoPublishEditModel.getRecordEffectChallenges());
                AVChallenge recordChallenge = videoPublishEditModel.creativeModel.commerceModel.getRecordChallenge();
                if (recordChallenge == null || (str = recordChallenge.challengeName) == null) {
                    str = "";
                }
                Mission mission = videoPublishEditModel.creativeModel.commerceModel.getMission();
                if (mission != null) {
                    challengeNames = mission.getChallengeNames();
                } else {
                    challengeNames = null;
                }
                List listLIZ2 = C189100o5.LIZ(challengeNames);
                List listLIZ3 = C189100o5.LIZ(arrayList2);
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLIZ3, 10));
                Iterator it3 = listLIZ3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((AVChallenge) it3.next()).challengeName);
                }
                return new C07YB(str, listLIZ2, C189100o5.LIZ(arrayList3), null, 8);
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            public static final boolean LJIIIIZZ(String str, EnumC1429920nJW enumC1429920nJW, EnumC1429920nJW enumC1429920nJW2) {
                switch (str.hashCode()) {
                    case 96673:
                        if (!str.equals("all") || enumC1429920nJW2 != EnumC1429920nJW.REAL_PUBLISH || enumC1429920nJW != EnumC1429920nJW.BEFORE_REAL_PUBLISH) {
                            return false;
                        }
                        return true;
                    case 3449699:
                        if (!str.equals("prop") || enumC1429920nJW2 != EnumC1429920nJW.ENTER_PUBLISH) {
                            return false;
                        }
                        return true;
                    case 203736818:
                        if (!str.equals("bring_in")) {
                            return false;
                        }
                        break;
                    case 1069449612:
                        if (!str.equals("mission")) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
                return C1429930nJX.LIZ.contains(enumC1429920nJW2);
            }

            @Override // X.AbstractC1429970nJb
            public final List<Object> LIZJ(C07YC c07yc, C07YC c07yc2, EnumC1429920nJW enumC1429920nJW, EnumC1429920nJW enumC1429920nJW2) {
                if ((c07yc instanceof C07YB) && (c07yc2 instanceof C07YB)) {
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(enumC1429920nJW);
                    sbLIZ.append('-');
                    sbLIZ.append(enumC1429920nJW2);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C07YB c07yb = (C07YB) c07yc;
                    C07YB c07yb2 = (C07YB) c07yc2;
                    String strLIZIZ2 = C1403540mcy.LIZIZ(c07yb.LIZIZ, c07yb2.LIZIZ, LJIIIIZZ("mission", enumC1429920nJW, enumC1429920nJW2));
                    if (strLIZIZ2 != null) {
                        arrayList.add(new C1430520nKU("mission", strLIZIZ2, strLIZIZ));
                    }
                    String strLIZ = C1403540mcy.LIZ(c07yb.LIZ, c07yb2.LIZ, LJIIIIZZ("bring_in", enumC1429920nJW, enumC1429920nJW2));
                    if (strLIZ != null) {
                        arrayList.add(new C1430520nKU("bring_in", strLIZ, strLIZIZ));
                    }
                    String strLIZIZ3 = C1403540mcy.LIZIZ(c07yb.LIZJ, c07yb2.LIZJ, LJIIIIZZ("prop", enumC1429920nJW, enumC1429920nJW2));
                    if (strLIZIZ3 != null) {
                        arrayList.add(new C1430520nKU("prop", strLIZIZ3, strLIZIZ));
                    }
                    String strLIZIZ4 = C1403540mcy.LIZIZ(c07yb.LIZLLL, c07yb2.LIZLLL, LJIIIIZZ("all", enumC1429920nJW, enumC1429920nJW2));
                    if (strLIZIZ4 != null) {
                        arrayList.add(new C1430520nKU("all", strLIZIZ4, strLIZIZ));
                    }
                    return arrayList;
                }
                return C13BV.INSTANCE;
            }
        }, new AbstractC1429940nJY() { // from class: X.0nJU
            public boolean LIZLLL;
            public final C07YD LJ = new C07YD(null, null, null, null, null, 31);

            @Override // X.AbstractC1429970nJb
            public final /* bridge */ /* synthetic */ C07YC LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC1429970nJb
            public final C07YC LJII(LinkedHashMap linkedHashMap) {
                String str;
                Object obj = linkedHashMap.get("source_info");
                if (!(obj instanceof String)) {
                    obj = null;
                }
                this.LIZLLL = Intrinsics.LJFF(obj, "{\"source_type\":\"vicut\",\"data\":{\"product\":\"tt_template\"}}");
                Object obj2 = linkedHashMap.get("anchors");
                if ((obj2 instanceof String) && (str = (String) obj2) != null) {
                    List listLJ = C08JS.LJ(CreateAnchorInfo[].class, str);
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJ, 10));
                    Iterator it2 = listLJ.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((CreateAnchorInfo) it2.next()).getKeyword());
                    }
                    return new C07YD(null, null, null, null, C189100o5.LIZ(arrayList), 15);
                }
                return this.LJ;
            }

            @Override // X.AbstractC1429970nJb
            public final C07YC LJ(ShortVideoContext shortVideoContext, List list) {
                String str;
                AutoSelectedAnchorInfos autoSelectedAnchorInfos = shortVideoContext.creativeFlowData.getAutoSelectedAnchorInfos();
                if (autoSelectedAnchorInfos == null || (str = autoSelectedAnchorInfos.anchorShootWay) == null) {
                    str = "";
                }
                return new C07YD(null, str, null, null, null, 23);
            }

            @Override // X.AbstractC1429970nJb
            public final C07YC LJFF(VideoPublishEditModel videoPublishEditModel, EnumC1429920nJW enumC1429920nJW) {
                String str;
                String name;
                AVUploadMiscInfoStruct uploadMiscInfoStruct;
                MvModel mvModel;
                String propSource;
                ArrayList<TimeSpeedModelExtension> arrayListDeepCopyFinalVideoList;
                JSONObject jSONObjectOptJSONObject;
                AutoSelectedAnchorInfos autoSelectedAnchorInfos = videoPublishEditModel.getCreativeFlowData().getAutoSelectedAnchorInfos();
                if (autoSelectedAnchorInfos == null || (str = autoSelectedAnchorInfos.anchorShootWay) == null) {
                    str = "";
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String stickers = videoPublishEditModel.getStickers();
                if (stickers != null && stickers.length() != 0 && (propSource = videoPublishEditModel.getPropSource()) != null && propSource.length() != 0 && (arrayListDeepCopyFinalVideoList = videoPublishEditModel.deepCopyFinalVideoList()) != null) {
                    Iterator<TimeSpeedModelExtension> it2 = arrayListDeepCopyFinalVideoList.iterator();
                    while (it2.hasNext()) {
                        SimpleEffect effectInfo = it2.next().getEffectInfo();
                        if (effectInfo != null) {
                            String extra = effectInfo.getExtra();
                            if (extra != null && extra.length() != 0 && (jSONObjectOptJSONObject = new JSONObject(extra).optJSONObject("linked_anchor")) != null) {
                                arrayList.add(jSONObjectOptJSONObject.optString("keyword"));
                            }
                            if (C123100dR.LIZ(effectInfo.getResourceId())) {
                                arrayList2.add(effectInfo.getName());
                            }
                        }
                    }
                }
                if (videoPublishEditModel.isPhotoMvMode() || (uploadMiscInfoStruct = videoPublishEditModel.getUploadMiscInfoStruct()) == null || (mvModel = uploadMiscInfoStruct.mvInfo) == null || (name = mvModel.getName()) == null) {
                    name = "";
                }
                if (enumC1429920nJW == EnumC1429920nJW.BEFORE_REAL_PUBLISH) {
                    ArrayList arrayList3 = new ArrayList(C13LP.LJLIL(C189100o5.LIZ(C189100o5.LIZIZ(arrayList2)), C189100o5.LIZIZ(arrayList)));
                    if (name.length() > 0) {
                        arrayList3.add(name);
                    }
                    return new C07YD(null, null, null, null, arrayList3, 15);
                }
                return new C07YD(name, str, C189100o5.LIZIZ(arrayList), C189100o5.LIZ(C189100o5.LIZIZ(arrayList2)), null, 16);
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final boolean LJIIIIZZ(java.lang.String r4, X.EnumC1429920nJW r5, X.EnumC1429920nJW r6) {
                /*
                    int r0 = r4.hashCode()
                    r3 = 1
                    r2 = 0
                    switch(r0) {
                        case -1655966961: goto L53;
                        case -728339626: goto L41;
                        case 3497: goto L25;
                        case 96673: goto L14;
                        case 3449699: goto Lb;
                        default: goto L9;
                    }
                L9:
                    r3 = 0
                La:
                    return r3
                Lb:
                    java.lang.String r0 = "prop"
                    boolean r0 = r4.equals(r0)
                    if (r0 != 0) goto L4a
                    goto L9
                L14:
                    java.lang.String r0 = "all"
                    boolean r0 = r4.equals(r0)
                    if (r0 == 0) goto L9
                    X.0nJW r0 = X.EnumC1429920nJW.REAL_PUBLISH
                    if (r6 != r0) goto L9
                    X.0nJW r0 = X.EnumC1429920nJW.BEFORE_REAL_PUBLISH
                    if (r5 != r0) goto L9
                    return r3
                L25:
                    java.lang.String r0 = "mv"
                    boolean r0 = r4.equals(r0)
                    if (r0 == 0) goto L9
                    r0 = 2
                    X.0nJW[] r1 = new X.EnumC1429920nJW[r0]
                    X.0nJW r0 = X.EnumC1429920nJW.ENTER_PUBLISH
                    r1[r2] = r0
                    X.0nJW r0 = X.EnumC1429920nJW.ENTER_EDIT
                    r1[r3] = r0
                    java.util.List r0 = X.C1697810uHb.LJIIJJI(r1)
                    boolean r3 = r0.contains(r6)
                    return r3
                L41:
                    java.lang.String r0 = "prop_link"
                    boolean r0 = r4.equals(r0)
                    if (r0 != 0) goto L4a
                    goto L9
                L4a:
                    X.0nJW r0 = X.EnumC1429920nJW.ENTER_PUBLISH
                    if (r6 == r0) goto La
                    X.0nJW r0 = X.EnumC1429920nJW.ENTER_EDIT
                    if (r6 != r0) goto L9
                    return r3
                L53:
                    java.lang.String r0 = "activity"
                    boolean r0 = r4.equals(r0)
                    if (r0 == 0) goto L9
                    java.util.List<X.0nJW> r0 = X.C1429930nJX.LIZ
                    boolean r0 = r0.contains(r6)
                    if (r0 == 0) goto L9
                    X.0nJW r0 = X.EnumC1429920nJW.ENTER_RECORD
                    if (r6 == r0) goto L9
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1429900nJU.LJIIIIZZ(java.lang.String, X.0nJW, X.0nJW):boolean");
            }

            @Override // X.AbstractC1429970nJb
            public final List<Object> LIZJ(C07YC c07yc, C07YC c07yc2, EnumC1429920nJW enumC1429920nJW, EnumC1429920nJW enumC1429920nJW2) {
                if ((c07yc instanceof C07YD) && (c07yc2 instanceof C07YD)) {
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(enumC1429920nJW);
                    sbLIZ.append('-');
                    sbLIZ.append(enumC1429920nJW2);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    boolean z = true;
                    if (enumC1429920nJW2 == EnumC1429920nJW.REAL_PUBLISH) {
                        z = true ^ this.LIZLLL;
                    }
                    C07YD c07yd = (C07YD) c07yc;
                    C07YD c07yd2 = (C07YD) c07yc2;
                    String strLIZIZ2 = C1403540mcy.LIZIZ(c07yd.LIZ, c07yd2.LIZ, LJIIIIZZ("prop_link", enumC1429920nJW, enumC1429920nJW2));
                    if (strLIZIZ2 != null) {
                        arrayList.add(new C1430510nKT("prop_link", strLIZIZ2, strLIZIZ, z));
                    }
                    String strLIZIZ3 = C1403540mcy.LIZIZ(c07yd.LIZIZ, c07yd2.LIZIZ, LJIIIIZZ("prop", enumC1429920nJW, enumC1429920nJW2));
                    if (strLIZIZ3 != null) {
                        arrayList.add(new C1430510nKT("prop", strLIZIZ3, strLIZIZ, z));
                    }
                    String strLIZ = C1403540mcy.LIZ(c07yd.LIZJ, c07yd2.LIZJ, LJIIIIZZ("mv", enumC1429920nJW, enumC1429920nJW2));
                    if (strLIZ != null) {
                        arrayList.add(new C1430510nKT("mv", strLIZ, strLIZIZ, z));
                    }
                    String strLIZ2 = C1403540mcy.LIZ(c07yd.LIZLLL, c07yd2.LIZLLL, LJIIIIZZ("activity", enumC1429920nJW, enumC1429920nJW2));
                    if (strLIZ2 != null) {
                        arrayList.add(new C1430510nKT("activity", strLIZ2, strLIZIZ, z));
                    }
                    String strLIZIZ4 = C1403540mcy.LIZIZ(c07yd.LJ, c07yd2.LJ, LJIIIIZZ("all", enumC1429920nJW, enumC1429920nJW2));
                    if (strLIZIZ4 != null) {
                        arrayList.add(new C1430510nKT("all", strLIZIZ4, strLIZIZ, z));
                    }
                    return arrayList;
                }
                return C13BV.INSTANCE;
            }
        }, new AbstractC1429940nJY() { // from class: X.0nJa
            public final C1429950nJZ LIZLLL = new C1429950nJZ(0);

            @Override // X.AbstractC1429970nJb
            public final /* bridge */ /* synthetic */ C07YC LIZLLL() {
                return this.LIZLLL;
            }

            @Override // X.AbstractC1429970nJb
            public final C07YC LJI(Intent intent) {
                String strLJIIIIZZ;
                String str;
                Mission mission;
                String stickerId;
                AVChallenge aVChallenge;
                ArrayList arrayList = new ArrayList();
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("reuse_sticker_ids");
                if (LJIIIIZZ(intent, "sticker_id") != null) {
                    strLJIIIIZZ = LJIIIIZZ(intent, "sticker_id");
                } else {
                    strLJIIIIZZ = C0MUK.LIZIZ(intent).recordEffectModel.stickerID;
                }
                ArrayList<String> arrayListLIZIZ = C1624570sNT.LIZIZ(strLJIIIIZZ);
                ArrayList<String> arrayListLIZIZ2 = C1624570sNT.LIZIZ(LJIIIIZZ(intent, "music_reuse_sticker_id"));
                if (stringArrayListExtra != null) {
                    arrayList.addAll(C189100o5.LIZ(stringArrayListExtra));
                }
                arrayList.addAll(C189100o5.LIZ(arrayListLIZIZ));
                arrayList.addAll(C189100o5.LIZ(arrayListLIZIZ2));
                Serializable serializableExtra = intent.getSerializableExtra("extra_open_record_challenge");
                String missionId = null;
                if ((serializableExtra instanceof AVChallenge) && (aVChallenge = (AVChallenge) serializableExtra) != null) {
                    str = aVChallenge.challengeName;
                    if (aVChallenge.getStickerId() != null) {
                        arrayList.add(aVChallenge.getStickerId());
                    }
                } else {
                    str = null;
                }
                String strLJIIIIZZ2 = LJIIIIZZ(intent, "shoot_way");
                if (Intrinsics.LJFF(strLJIIIIZZ2, "tcm_upload")) {
                    try {
                        mission = (Mission) C20485080t.LIZ(LJIIIIZZ(intent, "mission_data"), Mission.class);
                    } catch (RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else {
                    mission = (Mission) intent.getParcelableExtra("mission_data");
                }
                if (mission != null) {
                    if (TextUtils.equals(strLJIIIIZZ2, "mission")) {
                        missionId = mission.getMissionId();
                        String stickerId2 = mission.getStickerId();
                        if (stickerId2 != null) {
                            arrayList.add(stickerId2);
                        }
                    } else if (TextUtils.equals(strLJIIIIZZ2, "tcm_upload") && TextUtils.isEmpty(mission.getMissionId()) && (stickerId = mission.getStickerId()) != null) {
                        arrayList.add(stickerId);
                    }
                }
                if (missionId == null) {
                    missionId = "";
                }
                List<String> listLIZIZ = C189100o5.LIZIZ(C189100o5.LIZ(arrayList));
                if (str == null) {
                    str = "";
                }
                return new C1429950nJZ(listLIZIZ, str, missionId);
            }

            public static String LJIIIIZZ(Intent intent, String str) {
                try {
                    return intent.getStringExtra(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }

            @Override // X.AbstractC1429970nJb
            public final C07YC LJ(ShortVideoContext shortVideoContext, List list) {
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof C1429950nJZ) {
                            arrayList.add(obj);
                        }
                    }
                    C1429950nJZ c1429950nJZ = (C1429950nJZ) C13LP.LJJJLL(arrayList);
                    if (c1429950nJZ != null) {
                        return c1429950nJZ;
                    }
                }
                return this.LIZLLL;
            }

            @Override // X.AbstractC1429970nJb
            public final List<Object> LIZJ(C07YC c07yc, C07YC c07yc2, EnumC1429920nJW enumC1429920nJW, EnumC1429920nJW enumC1429920nJW2) {
                if ((c07yc instanceof C1429950nJZ) && (c07yc2 instanceof C1429950nJZ)) {
                    ArrayList arrayList = new ArrayList();
                    EnumC1429920nJW enumC1429920nJW3 = EnumC1429920nJW.ENTER_RECORD;
                    if (enumC1429920nJW2 == enumC1429920nJW3 && enumC1429920nJW == EnumC1429920nJW.BEFORE_ENTER_RECORD) {
                        C1429950nJZ c1429950nJZ = (C1429950nJZ) c07yc2;
                        C1429950nJZ c1429950nJZ2 = (C1429950nJZ) c07yc;
                        if (!c1429950nJZ.LIZ.containsAll(c1429950nJZ2.LIZ)) {
                            arrayList.add(new C1430480nKQ("prop", C13LP.LJJLIIIJ(c1429950nJZ2.LIZ, ",", null, null, 0, null, null, 62), C13LP.LJJLIIIJ(c1429950nJZ.LIZ, ",", null, null, 0, null, null, 62)));
                        }
                    }
                    if (enumC1429920nJW2 == enumC1429920nJW3 && enumC1429920nJW == EnumC1429920nJW.BEFORE_ENTER_RECORD) {
                        C1429950nJZ c1429950nJZ3 = (C1429950nJZ) c07yc2;
                        C1429950nJZ c1429950nJZ4 = (C1429950nJZ) c07yc;
                        if (!TextUtils.equals(c1429950nJZ3.LIZIZ, c1429950nJZ4.LIZIZ)) {
                            arrayList.add(new C1430480nKQ("challenge", c1429950nJZ4.LIZIZ, c1429950nJZ3.LIZIZ));
                        }
                    }
                    if (enumC1429920nJW2 == enumC1429920nJW3 && enumC1429920nJW == EnumC1429920nJW.BEFORE_ENTER_RECORD) {
                        C1429950nJZ c1429950nJZ5 = (C1429950nJZ) c07yc;
                        if (c1429950nJZ5.LIZJ.length() > 0) {
                            C1429950nJZ c1429950nJZ6 = (C1429950nJZ) c07yc2;
                            if (!Intrinsics.LJFF(c1429950nJZ6.LIZJ, c1429950nJZ5.LIZJ)) {
                                arrayList.add(new C1430480nKQ("mission", c1429950nJZ5.LIZJ, c1429950nJZ6.LIZJ));
                            }
                        }
                    }
                    return arrayList;
                }
                return C13BV.INSTANCE;
            }
        }));
        ((ArrayList) aVar.LIZ.LIZIZ).addAll(C1697810uHb.LJIIJJI(new InterfaceC1430460nKO() { // from class: X.0nKS
            @Override // X.InterfaceC1430460nKO
            public final void LIZ(List<Object> list, Context context, Object obj) {
                String str;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (ArrayList) list) {
                    if (obj2 instanceof C1430520nKU) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                C1345105Of.LIZ.getClass();
                String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(361), 30);
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C1430520nKU) it2.next()).LIZIZ);
                }
                String strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
                C1430520nKU c1430520nKU = (C1430520nKU) C13LP.LJJJLL(arrayList);
                if (c1430520nKU != null) {
                    str = c1430520nKU.LIZJ;
                } else {
                    str = null;
                }
                C1345105Of.LIZ("commercial_hashtag_lost", C2097608Jq.LJIIIIZZ(new Pair("hashtag_type", strLJJLIIIJ), new Pair("hashtag_name", strLJJLIIIJ2), new Pair("error_stage", str), new Pair("creation_id", C1403540mcy.LIZJ(obj)), new Pair("shoot_way", C1403540mcy.LJI(obj, null)), new Pair("enter_from", C1403540mcy.LIZLLL(obj)), new Pair("enter_method", C1403540mcy.LJ(obj))));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((C1430520nKU) obj3).LIZLLL) {
                        arrayList3.add(obj3);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    C1430530nKV c1430530nKV = C1430530nKV.LIZ;
                    String strLJJLIIIJ3 = C13LP.LJJLIIIJ(arrayList3, "\n", null, null, 0, null, AFwS261S0000000_22.get$arr$(368), 30);
                    c1430530nKV.getClass();
                    C1430530nKV.LIZ(context, "hashtag", strLJJLIIIJ3);
                }
            }
        }, new InterfaceC1430460nKO() { // from class: X.0nKR
            @Override // X.InterfaceC1430460nKO
            public final void LIZ(List<Object> list, Context context, Object obj) {
                String str;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (ArrayList) list) {
                    if (obj2 instanceof C1430510nKT) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                C1345105Of.LIZ.getClass();
                String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(358), 30);
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C1430510nKT) it2.next()).LIZIZ);
                }
                String strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
                C1430510nKT c1430510nKT = (C1430510nKT) C13LP.LJJJLL(arrayList);
                if (c1430510nKT != null) {
                    str = c1430510nKT.LIZJ;
                } else {
                    str = null;
                }
                C1345105Of.LIZ("video_anchor_lost", C2097608Jq.LJIIIIZZ(new Pair("anchor_type", strLJJLIIIJ), new Pair("anchor_info", strLJJLIIIJ2), new Pair("error_stage", str), new Pair("creation_id", C1403540mcy.LIZJ(obj)), new Pair("shoot_way", C1403540mcy.LJI(obj, null)), new Pair("enter_from", C1403540mcy.LIZLLL(obj)), new Pair("enter_method", C1403540mcy.LJ(obj))));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((C1430510nKT) obj3).LIZLLL) {
                        arrayList3.add(obj3);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    C1430530nKV c1430530nKV = C1430530nKV.LIZ;
                    String strLJJLIIIJ3 = C13LP.LJJLIIIJ(arrayList3, "\n", null, null, 0, null, AFwS261S0000000_22.get$arr$(366), 30);
                    c1430530nKV.getClass();
                    C1430530nKV.LIZ(context, "anchor", strLJJLIIIJ3);
                }
            }
        }, new InterfaceC1430460nKO() { // from class: X.0nKP
            @Override // X.InterfaceC1430460nKO
            public final void LIZ(List<Object> list, Context context, Object obj) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (ArrayList) list) {
                    if (obj2 instanceof C1430480nKQ) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                C1345105Of.LIZ.getClass();
                C1345105Of.LIZ("commercial_data_trans_error", C2097608Jq.LJIIIIZZ(new Pair("data_type", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(360), 30)), new Pair("data_info", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(359), 30)), new Pair("creation_id", C1403540mcy.LIZJ(obj)), new Pair("enter_from", C1403540mcy.LIZLLL(obj)), new Pair("shoot_way", C1403540mcy.LJI(obj, null))));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((C1430480nKQ) obj3).LIZLLL) {
                        arrayList2.add(obj3);
                    }
                }
                if (true ^ arrayList2.isEmpty()) {
                    C1430530nKV c1430530nKV = C1430530nKV.LIZ;
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, "\n", null, null, 0, null, AFwS261S0000000_22.get$arr$(367), 30);
                    c1430530nKV.getClass();
                    C1430530nKV.LIZ(context, "data_trans", strLJJLIIIJ);
                }
            }
        }));
    }

    public final void LIZ(final String str) {
        C1430540nKW c1430540nKW = this.LIZ;
        if (str == null) {
            c1430540nKW.getClass();
            return;
        }
        C19482111Jz c19482111JzLJJJJIZL = C11NZ.LJJJJIZL(c1430540nKW.LIZ);
        ExecutorService executorService = c1430540nKW.LIZJ;
        C11RO c11ro = C11S5.LIZ;
        c19482111JzLJJJJIZL.LJL(new C19501611Rm(executorService)).LJJLL(new C09JN() { // from class: X.0nKM
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DataMonitor@54f0.clearData$1");
                ((InterfaceC1430430nKL) obj).LIZ(str);
                C1C7U.LIZIZ("DataMonitor@54f0.clearData$1");
            }
        }, C19487811Me.LIZLLL);
    }

    public final <T> void LIZIZ(String str, C1429980nJc<T> c1429980nJc, Context context) {
        C1430540nKW c1430540nKW = this.LIZ;
        c1430540nKW.getClass();
        C11K9 c11k9LJJJJZ = C11NZ.LJJJJZ(new C1430450nKN(str, c1429980nJc, context));
        ExecutorService executorService = c1430540nKW.LIZJ;
        C11RO c11ro = C11S5.LIZ;
        c11k9LJJJJZ.LJJJLZIJ(new C19501611Rm(executorService)).LJJLL(new AfS191S0100000_22(c1430540nKW, 39), new AfS191S0100000_22(context, 40));
    }
}
