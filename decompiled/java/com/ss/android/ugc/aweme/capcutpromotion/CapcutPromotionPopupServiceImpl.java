package com.ss.android.ugc.aweme.capcutpromotion;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C04TD;
import X.C10ZL;
import X.C11V5;
import X.C11V8;
import X.C11VA;
import X.C19EG;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2214201BlK;
import X.C452501pT;
import android.app.Activity;
import android.app.Dialog;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.capcutpromotion.CapcutPopupResponse;
import com.ss.android.ugc.aweme.capcutpromotion.PopupInfo;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public final class CapcutPromotionPopupServiceImpl implements CapcutPromotionPopupService {
    public boolean LIZIZ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(40));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 64));

    public static CapcutPromotionPopupService LIZIZ() {
        Object objLIZ = C04TD.LIZ(CapcutPromotionPopupService.class, false);
        if (objLIZ != null) {
            return (CapcutPromotionPopupService) objLIZ;
        }
        if (C04TD.LLILZIL == null) {
            synchronized (CapcutPromotionPopupService.class) {
                if (C04TD.LLILZIL == null) {
                    C04TD.LLILZIL = new CapcutPromotionPopupServiceImpl();
                }
            }
        }
        return C04TD.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.capcutpromotion.CapcutPromotionPopupService
    public final boolean LIZ(PublishModel publishModel, Aweme aweme) {
        VideoPublishEditModelKt videoPublishEditModelKt;
        ArrayList<ImportVideoInfo> importInfoList;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("should_request_capcut_popup", false)) {
            return false;
        }
        BaseShortVideoContext baseShortVideoContext = null;
        if (publishModel != null) {
            baseShortVideoContext = publishModel.editModel;
        }
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModelKt = (VideoPublishEditModelKt) baseShortVideoContext) != null && (importInfoList = videoPublishEditModelKt.getImportInfoList()) != null) {
            Iterator<ImportVideoInfo> it2 = importInfoList.iterator();
            while (it2.hasNext()) {
                String description = it2.next().getDescription();
                if (description != null) {
                    try {
                        if (Intrinsics.LJFF(new JSONObject(description).optString("source_type"), "vicut")) {
                            Activity activityLJFF = C2214201BlK.LJFF();
                            String strLIZ = C10ZL.LIZ(C2211631BhB.LJII());
                            boolean zLJFF = Intrinsics.LJFF(strLIZ, "tt_live_play");
                            if (Intrinsics.LJFF(strLIZ, "profile_from_feed")) {
                                strLIZ = "others_homepage";
                            }
                            if (activityLJFF != null) {
                                final C11V8 c11v8 = new C11V8(activityLJFF, strLIZ, activityLJFF, this);
                                if ((activityLJFF instanceof C19EG) && !zLJFF) {
                                    AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) C11V5.LIZ.getValue();
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("CapcutPromotionPopupMonitor");
                                    sbLIZ.append(", try to initiate popup task");
                                    abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                                    final C19EG c19eg = (C19EG) activityLJFF;
                                    final AwS273S0300000_29 awS273S0300000_29 = new AwS273S0300000_29(aweme, this, publishModel, 31);
                                    PopupManager.LJIJI(new C11VA(c19eg, c11v8, awS273S0300000_29) { // from class: X.11V9
                                        public final C19EG LLILZIL;
                                        public final InterfaceC1631620sYq<C20656615sK, PopupInfo, Function0<Unit>, Dialog> LLILZLL;
                                        public final Function0<CapcutPopupResponse> LLIZ;
                                        public PopupInfo LLIZLLLIL;

                                        @Override // X.InterfaceC20660515sx
                                        public final int getPriority() {
                                            return 0;
                                        }

                                        @Override // X.C11VC
                                        public final long getTimeout() {
                                            return 2000L;
                                        }

                                        @Override // X.C11VC
                                        public final void LJIIIIZZ() throws JSONException {
                                            try {
                                                C11V7 c11v7 = (C11V7) C11V5.LIZ.getValue();
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("CapcutPromotionPopupMonitor");
                                                sbLIZ2.append(", start request");
                                                c11v7.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                                JSONObject jSONObject = new JSONObject();
                                                jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1");
                                                C793770VBv.LJII("request_capcut_campaing_popup", jSONObject, null, null);
                                                PopupInfo popupInfo = this.LLIZ.invoke().popupInfo;
                                                this.LLIZLLLIL = popupInfo;
                                                if (popupInfo != null && popupInfo.isShow) {
                                                    C11VB.LIZ(this, true);
                                                } else {
                                                    C11VB.LIZ(this, false);
                                                    C11V5.LIZ("don't need to show");
                                                }
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                                JSONObject jSONObject2 = new JSONObject();
                                                jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT);
                                                C793770VBv.LJII("request_capcut_campaing_popup", jSONObject2, null, null);
                                                C11VB.LIZ(this, false);
                                                C11V5.LIZ("server error");
                                            }
                                        }

                                        @Override // X.InterfaceC20660415sw
                                        public final C688120Qyw i2() {
                                            C19EG c19eg2 = this.LLILZIL;
                                            return new C688120Qyw(c19eg2, c19eg2, null);
                                        }

                                        @Override // X.InterfaceC20659015si
                                        public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                            PopupInfo popupInfo = this.LLIZLLLIL;
                                            if (popupInfo != null) {
                                                AbstractC1604130rqV abstractC1604130rqV2 = (AbstractC1604130rqV) C11V5.LIZ.getValue();
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("CapcutPromotionPopupMonitor");
                                                sbLIZ2.append(", popup showed");
                                                abstractC1604130rqV2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                                this.LLILZLL.invoke(c20656615sK, popupInfo, new AwS573S0100000_29(c20656615sK, 1111));
                                            }
                                        }

                                        {
                                            this.LLILZIL = c19eg;
                                            this.LLILZLL = c11v8;
                                            this.LLIZ = awS273S0300000_29;
                                        }
                                    }, true);
                                }
                            }
                            return true;
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        return false;
    }
}
