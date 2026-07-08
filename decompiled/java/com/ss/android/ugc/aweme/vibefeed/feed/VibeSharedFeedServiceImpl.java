package com.ss.android.ugc.aweme.vibefeed.feed;

import X.C099R;
import X.C0P32;
import X.C0P40;
import X.C0ZA0;
import X.C13LE;
import X.C1575210r5r;
import X.C1575290r5z;
import X.C1575440r6E;
import X.C1575940r72;
import X.C1575960r74;
import X.C1575970r75;
import X.C1575990r77;
import X.C1576040r7C;
import X.C19719912Dl;
import X.C20152913tH;
import X.C20153113tJ;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2296808zG;
import X.C299810Bp5;
import X.C638810P3v;
import X.C638830P3x;
import X.C786410Ut5;
import X.C787920UvW;
import X.C897840ZKc;
import X.C909090ZlT;
import X.EnumC1575230r5t;
import X.EnumC1576090r7H;
import X.EnumC629350OmL;
import X.EnumC912680ZrG;
import X.InterfaceC1364105Vn;
import X.InterfaceC20153213tK;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.vibefeed.feed.entrance.VibeFeedRouteInterceptor;
import com.ss.android.ugc.aweme.vibefeed.feed.imdetail.VibeTransitionEntranceComponent;
import com.ss.android.ugc.aweme.vibefeed.feed.preload.VibeConfigPreload;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class VibeSharedFeedServiceImpl implements IVibeEntranceService {
    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService
    public final boolean LJFF() {
        C787920UvW.LIZ.getClass();
        return C787920UvW.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService
    public final VibeFeedRouteInterceptor LJIIJ() {
        return new VibeFeedRouteInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService
    public final boolean LJIIZILJ() {
        C787920UvW.LIZ.getClass();
        return C787920UvW.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService
    public final C19719912Dl LJIIJJI() {
        if (C1576040r7C.LIZ() && C1576040r7C.LJFF().transitionEnable) {
            return C13LE.LIZ(VibeTransitionEntranceComponent.class);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService
    public final boolean LIZ(String str) {
        if (C1575210r5r.LLILLJJLI.LIZIZ(str) != EnumC1575230r5t.HIDE) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService
    public final boolean LIZIZ(String str) {
        if (C1576040r7C.LIZ() && C1575210r5r.LLILLJJLI.LIZIZ(str) == EnumC1575230r5t.STARTED) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService
    public final boolean LIZLLL(String str) {
        C1575990r77 c1575990r77LIZJ;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C1575960r74 c1575960r74 = C1575960r74.LL;
        c1575960r74.getClass();
        Boolean boolLIZ = C1575210r5r.LLILLJJLI.LIZ(str);
        if (boolLIZ != null && (c1575990r77LIZJ = C1575970r75.LIZJ(str, boolLIZ.booleanValue())) != null) {
            Keva kevaLIZJ = C1575960r74.LIZJ(String.valueOf(C1575440r6E.LIZ()));
            String strLIZ = C1575960r74.LIZ(str, c1575990r77LIZJ.LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cai_action_bar_exposed_times_");
            sbLIZ.append(strLIZ);
            int i = kevaLIZJ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cai_action_bar_impression_days_");
            sbLIZ2.append(strLIZ);
            int i2 = kevaLIZJ.getInt(C2188811AlT.LIZIZ(sbLIZ2), 0);
            int i3 = c1575990r77LIZJ.LIZIZ;
            int i4 = c1575990r77LIZJ.LIZJ;
            if (i3 > 0) {
                z = true;
            } else {
                z = false;
            }
            if (i4 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && i < i3) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z2 && i2 < i4) {
                z4 = false;
            } else {
                z4 = true;
            }
            if ((z || z2) && z3 && z4) {
                z5 = true;
            } else {
                z5 = false;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("hitClientAIExposeLimit conv=");
            sbLIZ3.append(str);
            sbLIZ3.append(" intent=");
            sbLIZ3.append(c1575990r77LIZJ.LIZ.getTrackingName());
            sbLIZ3.append(" times=");
            sbLIZ3.append(i);
            sbLIZ3.append('/');
            sbLIZ3.append(i3);
            sbLIZ3.append(" days=");
            sbLIZ3.append(i2);
            sbLIZ3.append('/');
            sbLIZ3.append(i4);
            sbLIZ3.append(" exit=");
            sbLIZ3.append(z5);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (z5) {
                if (c1575990r77LIZJ.LIZLLL > 0) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("cai_action_bar_reached_timestamp_");
                    sbLIZ4.append(strLIZ);
                    long j = kevaLIZJ.getLong(C2188811AlT.LIZIZ(sbLIZ4), 0L);
                    if (j > 0) {
                        if ((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - j >= ((long) c1575990r77LIZJ.LIZLLL) * 86400) {
                            c1575960r74.LJFF(str, c1575990r77LIZJ.LIZ);
                        } else {
                            return true;
                        }
                    } else {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("cai_action_bar_reached_timestamp_");
                        sbLIZ5.append(strLIZ);
                        kevaLIZJ.storeLong(C2188811AlT.LIZIZ(sbLIZ5), System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("cai_action_bar_reached_timestamp_");
                sbLIZ6.append(strLIZ);
                if (kevaLIZJ.getLong(C2188811AlT.LIZIZ(sbLIZ6), 0L) != 0) {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("cai_action_bar_reached_timestamp_");
                    sbLIZ7.append(strLIZ);
                    kevaLIZJ.storeLong(C2188811AlT.LIZIZ(sbLIZ7), 0L);
                }
            }
        } else {
            C909090ZlT.LIZ.getClass();
            if (!C909090ZlT.LIZ().enableImpressionLimitControl) {
                c1575960r74.LJ(str);
            } else {
                Keva kevaLIZJ2 = C1575960r74.LIZJ(String.valueOf(C1575440r6E.LIZ()));
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("action_bar_exposed_times_v2_");
                sbLIZ8.append(str);
                if (kevaLIZJ2.getInt(C2188811AlT.LIZIZ(sbLIZ8), 0) >= C909090ZlT.LIZ().exposeImpressionLimit) {
                    String strValueOf = String.valueOf(C1575440r6E.LIZ());
                    Keva kevaLIZJ3 = C1575960r74.LIZJ(strValueOf);
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("action_bar_exit_timestamp_");
                    sbLIZ9.append(str);
                    if (kevaLIZJ3.getLong(C2188811AlT.LIZIZ(sbLIZ9), 0L) == 0) {
                        Keva kevaLIZJ4 = C1575960r74.LIZJ(strValueOf);
                        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                        sbLIZ10.append("action_bar_exit_timestamp_");
                        sbLIZ10.append(str);
                        kevaLIZJ4.storeLong(C2188811AlT.LIZIZ(sbLIZ10), System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    }
                    if (!C909090ZlT.LIZ().autoReEntranceEnabled) {
                        return true;
                    }
                    String strValueOf2 = String.valueOf(C1575440r6E.LIZ());
                    Keva kevaLIZJ5 = C1575960r74.LIZJ(strValueOf2);
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append("action_bar_exit_timestamp_");
                    sbLIZ11.append(str);
                    long j2 = kevaLIZJ5.getLong(C2188811AlT.LIZIZ(sbLIZ11), 0L);
                    if (j2 == 0) {
                        return true;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    if (jCurrentTimeMillis - j2 < ((long) C909090ZlT.LIZ().autoReEntranceDays) * 86400) {
                        return true;
                    }
                    Keva kevaLIZJ6 = C1575960r74.LIZJ(strValueOf2);
                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                    sbLIZ12.append("action_bar_last_auto_reentrance_timestamp_");
                    sbLIZ12.append(str);
                    if (kevaLIZJ6.getLong(C2188811AlT.LIZIZ(sbLIZ12), 0L) >= j2) {
                        return true;
                    }
                    Keva kevaLIZJ7 = C1575960r74.LIZJ(strValueOf2);
                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                    sbLIZ13.append("action_bar_last_auto_reentrance_timestamp_");
                    sbLIZ13.append(str);
                    kevaLIZJ7.storeLong(C2188811AlT.LIZIZ(sbLIZ13), jCurrentTimeMillis);
                    c1575960r74.LJ(str);
                    return false;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x024e, code lost:
    
        if (r2.getInt(X.C2188811AlT.LIZIZ(r1), 0) >= r3) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132 A[PHI: r11
      0x0132: PHI (r11v5 java.util.Map<java.lang.String, java.lang.Object>) = (r11v4 java.util.Map<java.lang.String, java.lang.Object>), (r11v11 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:62:0x0130, B:51:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01da  */
    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.feed.model.Aweme LJIILL(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.vibefeed.feed.VibeSharedFeedServiceImpl.LJIILL(java.lang.String):com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService
    public final void LJII(final String str, final String str2) {
        if (str != null && C299810Bp5.LIZ() && C1575210r5r.LLILLJJLI.LIZIZ(str) == EnumC1575230r5t.STARTED) {
            final EnumC912680ZrG enumC912680ZrGLJI = C1575440r6E.LJI(str);
            if (enumC912680ZrGLJI.isPrivate() && str2.length() == 0) {
                return;
            }
            C20153113tJ c20153113tJ = C20152913tH.LIZLLL;
            InterfaceC20153213tK interfaceC20153213tK = new InterfaceC20153213tK() { // from class: X.0r7I
                @Override // X.InterfaceC20153213tK
                public final void LIZ(C20152113t9 c20152113t9) {
                    Bundle bundle = new Bundle();
                    String str3 = str2;
                    String str4 = str;
                    EnumC912680ZrG enumC912680ZrG = enumC912680ZrGLJI;
                    C786410Ut5.LJJJI("to_user_id", str3, bundle);
                    C786410Ut5.LJJJI("conversation_id", str4, bundle);
                    bundle.putInt("mutual_feed_scene", enumC912680ZrG.getValue());
                    c20152113t9.LIZ(bundle, VibeConfigPreload.class, new InterfaceC1726310v1Z() { // from class: X.0r7J
                        @Override // X.InterfaceC1726310v1Z
                        public final void LIZ(Exception exc) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("preloadVibeConfig onFail ");
                            sbLIZ.append(Unit.LIZ);
                            C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.InterfaceC1726310v1Z
                        public final void onSuccess(Object obj) {
                        }
                    }, Boolean.FALSE);
                }
            };
            c20153113tJ.getClass();
            C20153113tJ.LIZJ(interfaceC20153213tK);
            C638830P3x.LIZ(new C638810P3v(enumC912680ZrGLJI, "", null, str2, "", str, null, 196), null, null, EnumC629350OmL.SCENE_PREVIEW.getValue(), null, 0, 54);
        }
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService
    public final Object LJIILJJIL(List<C0ZA0> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (!C299810Bp5.LIZ()) {
            return Unit.LIZ;
        }
        C0P32 c0p32 = C0P32.LLILLJJLI;
        c0p32.getClass();
        Object objLJ = C2296808zG.LJ(new C897840ZKc(list, c0p32, null), interfaceC1364105Vn);
        if (objLJ != C099R.LJFF()) {
            objLJ = Unit.LIZ;
        }
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService
    public final void LJIILIIL(String str, String str2, EnumC912680ZrG enumC912680ZrG) {
        C1575990r77 c1575990r77LIZJ;
        boolean z;
        C1575290r5z.LIZ.getClass();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "chat"), new Pair("button_type", str2), new Pair("conversation_id", str), new Pair("chat_type", enumC912680ZrG.stringValue()));
        mapLJIIJ.putAll(C0P40.LIZ(str));
        if (enumC912680ZrG.isPrivate()) {
            String strLIZJ = C1575210r5r.LLILLJJLI.LIZJ(str);
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            mapLJIIJ.put("invitee_uid", strLIZJ);
        }
        C20684815ws.LJIILLIIL("ttsocial_chat_shared_feed_btn_show", mapLJIIJ);
        if (Intrinsics.LJFF(str2, "shared_feed_action_bar")) {
            C1575960r74.LL.getClass();
            Boolean boolLIZ = C1575210r5r.LLILLJJLI.LIZ(str);
            if (boolLIZ != null && (c1575990r77LIZJ = C1575970r75.LIZJ(str, boolLIZ.booleanValue())) != null) {
                EnumC1576090r7H enumC1576090r7H = c1575990r77LIZJ.LIZ;
                Keva kevaLIZJ = C1575960r74.LIZJ(String.valueOf(C1575440r6E.LIZ()));
                String strLIZ = C1575960r74.LIZ(str, enumC1576090r7H);
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                long timeInMillis = (calendar.getTimeInMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / 86400;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cai_action_bar_exposed_times_");
                sbLIZ.append(strLIZ);
                int i = kevaLIZJ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("cai_action_bar_exposed_times_");
                sbLIZ2.append(strLIZ);
                int i2 = i + 1;
                kevaLIZJ.storeInt(C2188811AlT.LIZIZ(sbLIZ2), i2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("cai_action_bar_day_last_counted_");
                sbLIZ3.append(strLIZ);
                if (kevaLIZJ.getLong(C2188811AlT.LIZIZ(sbLIZ3), -1L) != timeInMillis) {
                    z = true;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("cai_action_bar_impression_days_");
                    sbLIZ4.append(strLIZ);
                    int i3 = kevaLIZJ.getInt(C2188811AlT.LIZIZ(sbLIZ4), 0);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("cai_action_bar_impression_days_");
                    sbLIZ5.append(strLIZ);
                    kevaLIZJ.storeInt(C2188811AlT.LIZIZ(sbLIZ5), i3 + 1);
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("cai_action_bar_day_last_counted_");
                    sbLIZ6.append(strLIZ);
                    kevaLIZJ.storeLong(C2188811AlT.LIZIZ(sbLIZ6), timeInMillis);
                } else {
                    z = false;
                }
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("recordClientAIImpression conv=");
                sbLIZ7.append(str);
                sbLIZ7.append(" intent=");
                sbLIZ7.append(enumC1576090r7H.getTrackingName());
                sbLIZ7.append(" times=");
                sbLIZ7.append(i2);
                sbLIZ7.append(" localDayCode=");
                sbLIZ7.append(timeInMillis);
                sbLIZ7.append(" newDay=");
                sbLIZ7.append(z);
                C2188811AlT.LIZIZ(sbLIZ7);
                return;
            }
            C909090ZlT.LIZ.getClass();
            if (!C909090ZlT.LIZ().enableImpressionLimitControl) {
                return;
            }
            String strValueOf = String.valueOf(C1575440r6E.LIZ());
            Keva kevaLIZJ2 = C1575960r74.LIZJ(strValueOf);
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("action_bar_exposed_times_v2_");
            sbLIZ8.append(str);
            int i4 = kevaLIZJ2.getInt(C2188811AlT.LIZIZ(sbLIZ8), 0);
            Keva kevaLIZJ3 = C1575960r74.LIZJ(strValueOf);
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("action_bar_exposed_times_v2_");
            sbLIZ9.append(str);
            kevaLIZJ3.storeInt(C2188811AlT.LIZIZ(sbLIZ9), i4 + 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(android.view.View r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            android.view.ViewParent r2 = r5.getParent()
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L4a
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L4a
            int r3 = r2.getWidth()
            if (r3 <= 0) goto L4a
            r0 = 2
            int[] r1 = new int[r0]
            r5.getLocationInWindow(r1)
            int[] r0 = new int[r0]
            r2.getLocationInWindow(r0)
            r2 = 0
            r1 = r1[r2]
            r0 = r0[r2]
            int r1 = r1 - r0
            int r0 = r5.getWidth()
            int r0 = r0 + r1
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.min(r0, r3)
            int r0 = r0 - r1
            int r1 = java.lang.Math.max(r0, r2)
            int r0 = r5.getWidth()
            if (r0 <= 0) goto L4a
            float r1 = (float) r1
            int r0 = r5.getWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
        L45:
            r0 = 1
            r4.LJIIL(r0, r1, r6, r7)
            return
        L4a:
            r1 = 0
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.vibefeed.feed.VibeSharedFeedServiceImpl.LJIILLIIL(android.view.View, java.lang.String, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService
    public final void LJ(String str, String str2, int i, EnumC912680ZrG enumC912680ZrG) {
        C1575290r5z.LIZ.getClass();
        C20684815ws.LJIILLIIL("ttsocial_chat_shared_feed_red_spot_show", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "chat"), new Pair("button_type", str2), new Pair("conversation_id", str), new Pair("is_red_spot", String.valueOf(i)), new Pair("chat_type", enumC912680ZrG.stringValue())));
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService
    public final void LJIIIIZZ(String str, String str2, int i, EnumC912680ZrG enumC912680ZrG) {
        C1575290r5z.LIZ.getClass();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "chat"), new Pair("button_type", str2), new Pair("conversation_id", str), new Pair("is_red_spot", String.valueOf(i)), new Pair("chat_type", enumC912680ZrG.stringValue()));
        mapLJIIJ.putAll(C0P40.LIZ(str));
        if (enumC912680ZrG.isPrivate()) {
            String strLIZJ = C1575210r5r.LLILLJJLI.LIZJ(str);
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            mapLJIIJ.put("invitee_uid", strLIZJ);
        }
        C20684815ws.LJIILLIIL("ttsocial_chat_shared_feed_btn_click", mapLJIIJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(boolean r10, float r11, java.lang.String r12, java.lang.String r13) {
        /*
            r9 = this;
            X.0r5z r0 = X.C1575290r5z.LIZ
            r0.getClass()
            X.0r5r r4 = X.C1575210r5r.LLILLJJLI
            X.0r5t r0 = r4.LIZIZ(r12)
            int[] r1 = X.C1575220r5s.LIZ
            int r0 = r0.ordinal()
            r2 = r1[r0]
            r1 = 5
            r3 = 4
            r5 = 3
            r7 = 2
            if (r2 == r7) goto L7f
            if (r2 == r5) goto L73
            if (r2 == r3) goto L73
            if (r2 == r1) goto L73
            r0 = 6
            if (r2 == r0) goto L7c
            java.lang.String r4 = "initial"
        L24:
            if (r10 == 0) goto L70
            java.lang.String r6 = "in_datasource"
        L28:
            kotlin.Pair[] r2 = new kotlin.Pair[r1]
            kotlin.Pair r8 = new kotlin.Pair
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "chat"
            r8.<init>(r1, r0)
            r0 = 0
            r2[r0] = r8
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "conversation_id"
            r1.<init>(r0, r12)
            r0 = 1
            r2[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "chat_type"
            r1.<init>(r0, r13)
            r2[r7] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "entrance_status"
            r1.<init>(r0, r6)
            r2[r5] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "feed_status"
            r1.<init>(r0, r4)
            r2[r3] = r1
            java.util.Map r2 = X.C2097608Jq.LJIIJ(r2)
            if (r10 == 0) goto L6a
            java.lang.String r1 = "visibility_ratio"
            java.lang.String r0 = java.lang.String.valueOf(r11)
            r2.put(r1, r0)
        L6a:
            java.lang.String r0 = "shared_feed_action_bar_entrance_state"
            X.C20684815ws.LJIILLIIL(r0, r2)
            return
        L70:
            java.lang.String r6 = "missing_in_datasource"
            goto L28
        L73:
            boolean r0 = r4.LJ(r12)
            if (r0 == 0) goto L7c
            java.lang.String r4 = "invitor"
            goto L24
        L7c:
            java.lang.String r4 = "acceptor"
            goto L24
        L7f:
            java.lang.String r4 = "active"
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.vibefeed.feed.VibeSharedFeedServiceImpl.LJIIL(boolean, float, java.lang.String, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService
    public final void LIZJ(Context context, String str, IMUser iMUser, String str2, String str3, String str4) throws JSONException {
        String secUid;
        String str5;
        String str6;
        String uid;
        String secUid2;
        C1575940r72.LIZ.getClass();
        EnumC912680ZrG enumC912680ZrGLJI = C1575440r6E.LJI(str2);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://aweme/detail/");
        smartRouteBuildRoute.withParam("activity_has_activity_options", true);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, str, bundle);
        String uid2 = null;
        if (iMUser != null) {
            uid2 = iMUser.getUid();
        }
        String str7 = "";
        if (uid2 == null) {
            uid2 = "";
        }
        C786410Ut5.LJJJI("userid", uid2, bundle);
        if (iMUser == null || (secUid = iMUser.getSecUid()) == null) {
            secUid = "";
        }
        C786410Ut5.LJJJI("sec_userid", secUid, bundle);
        C786410Ut5.LJJJI("enter_method", "click_chat_message", bundle);
        bundle.putInt("video_type", 57);
        C786410Ut5.LJJJI("enter_from", "shared_feed_like_history", bundle);
        C786410Ut5.LJJJI("conversation_id", str2, bundle);
        if (str4 == null) {
            str5 = "";
        } else {
            str5 = str4;
        }
        C786410Ut5.LJJJI("shared_feed_id", str5, bundle);
        C786410Ut5.LJJJI("chat_type_str", enumC912680ZrGLJI.stringValue(), bundle);
        HashMap map = new HashMap();
        if (str4 == null) {
            str6 = "";
        } else {
            str6 = str4;
        }
        map.put("feed_id", str6);
        C786410Ut5.LJJIZ(bundle, "feed_param_extra", map);
        smartRouteBuildRoute.withParam(bundle);
        JSONObject jSONObject = new JSONObject();
        if (iMUser == null || (uid = iMUser.getUid()) == null) {
            uid = "";
        }
        jSONObject.put("to_user_id", uid);
        if (iMUser == null || (secUid2 = iMUser.getSecUid()) == null) {
            secUid2 = "";
        }
        jSONObject.put("to_user_sec_uid", secUid2);
        jSONObject.put("conversation_id", str2);
        if (str4 != null) {
            str7 = str4;
        }
        jSONObject.put("feed_id", str7);
        jSONObject.put("enter_from", "shared_feed_like_history");
        jSONObject.put("enter_type", "click_chat_message");
        jSONObject.put("shared_feed_refresh_time", str3);
        jSONObject.put("mutual_feed_scene", enumC912680ZrGLJI.getValue());
        smartRouteBuildRoute.withParam("vibe_feed_extra", C786410Ut5.J3(jSONObject));
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService
    public final void LJI(Context context, String str, String str2, String str3, String str4, String str5, List<String> list) {
        C1575940r72.LIZ.getClass();
        C1575940r72.LIZIZ(context, str, str2, str3, str4, str5, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0207  */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0Gmg, android.view.ViewTreeObserver$OnGlobalLayoutListener] */
    @Override // com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(boolean r35, final java.lang.String r36, final java.lang.String r37, final java.lang.String r38, final android.view.View r39, final X.EnumC2007507th r40, kotlin.jvm.functions.Function0 r41) {
        /*
            Method dump skipped, instruction units count: 1383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.vibefeed.feed.VibeSharedFeedServiceImpl.LJIIIZ(boolean, java.lang.String, java.lang.String, java.lang.String, android.view.View, X.07th, kotlin.jvm.functions.Function0):void");
    }
}
