package com.ss.android.ugc.aweme.pcs.course.coursedetailpage.viewmodel;

import X.AbstractC1837080xuE;
import X.C0IJT;
import X.C0K6H;
import X.C1161920gLG;
import X.C1554960qZC;
import X.C1791770wj9;
import X.C1836920xty;
import X.C1837060xuC;
import X.C1837160xuM;
import X.C474500IjA;
import X.C490580JLs;
import X.C497740JfY;
import X.C512030K6f;
import X.C512040K6g;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import com.bytedance.android.livesdk.chatroom.api.SMBCourseVideo;
import com.bytedance.android.livesdk.livesetting.wallet.CanRechargeSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS77S1000000_27;
import webcast.api.smb.GetSMBCourseDetailResponse;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsCourseDetailVM extends AssemViewModel<C1837060xuC> {
    public InterfaceC665370Q7z LL;
    public C1836920xty LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1837060xuC(0);
    }

    public final C1836920xty yQ2() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLILLJJLI == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            C1836920xty c1836920xty = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C1836920xty.class, null)) != null) {
                c1836920xty = (C1836920xty) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILLJJLI = c1836920xty;
        }
        return this.LLILLJJLI;
    }

    public final void vQ2(List<SMBCourseVideo> list) {
        Long lValueOf;
        GScope gScope = GScope.LL;
        C1836920xty c1836920xtyYQ2 = yQ2();
        Long lValueOf2 = null;
        if (c1836920xtyYQ2 != null) {
            lValueOf = Long.valueOf(c1836920xtyYQ2.LLILLJJLI);
        } else {
            lValueOf = null;
        }
        C1836920xty c1836920xtyYQ22 = yQ2();
        if (c1836920xtyYQ22 != null) {
            lValueOf2 = Long.valueOf(c1836920xtyYQ22.LL);
        }
        C1554960qZC.LIZ(gScope, new C490580JLs(list, lValueOf, lValueOf2), C490580JLs.class, "source_default_key");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2(android.content.Context r13) {
        /*
            r12 = this;
            r0 = 138(0x8a, float:1.93E-43)
            kotlin.jvm.internal.AFwS269S0000000_27 r0 = kotlin.jvm.internal.AFwS269S0000000_27.get$arr$(r0)
            r4 = r12
            r4.setState(r0)
            kotlin.jvm.internal.AwS606S0100000_27 r9 = new kotlin.jvm.internal.AwS606S0100000_27
            r0 = 169(0xa9, float:2.37E-43)
            r9.<init>(r4, r0)
            r0 = 158(0x9e, float:2.21E-43)
            kotlin.jvm.internal.AFwS216S0000000_27 r6 = kotlin.jvm.internal.AFwS216S0000000_27.get$arr$(r0)
            kotlin.jvm.internal.AwS606S0100000_27 r8 = new kotlin.jvm.internal.AwS606S0100000_27
            r0 = 170(0xaa, float:2.38E-43)
            r8.<init>(r4, r0)
            kotlin.jvm.internal.AwS606S0100000_27 r10 = new kotlin.jvm.internal.AwS606S0100000_27
            r0 = 171(0xab, float:2.4E-43)
            r10.<init>(r4, r0)
            kotlin.jvm.internal.AwS586S0100000_7 r7 = new kotlin.jvm.internal.AwS586S0100000_7
            r0 = 254(0xfe, float:3.56E-43)
            r7.<init>(r4, r0)
            X.0xty r0 = r4.yQ2()
            if (r0 == 0) goto L4c
            boolean r1 = r0.LLJ
            r0 = 1
            if (r1 != r0) goto L4c
        L37:
            r1 = 3
            if (r0 == 0) goto L4a
            r5 = 3
        L3b:
            X.01wk r0 = r4.getAssemVMScope()
            X.0xu8 r2 = new X.0xu8
            r11 = 0
            r3 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.C23250099c.LIZLLL(r0, r11, r11, r2, r1)
            return
        L4a:
            r5 = 2
            goto L3b
        L4c:
            r0 = 0
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pcs.course.coursedetailpage.viewmodel.PcsCourseDetailVM.xQ2(android.content.Context):void");
    }

    public static boolean BQ2(String str, boolean z) {
        if (str.length() > 0 || !z || !CanRechargeSetting.INSTANCE.getValue() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isCoin()) {
            return true;
        }
        return false;
    }

    public final void AQ2(long j, boolean z) {
        Long lValueOf;
        Long lValueOf2;
        String str;
        C1836920xty c1836920xtyYQ2 = yQ2();
        Long l = null;
        if (c1836920xtyYQ2 != null) {
            lValueOf = Long.valueOf(c1836920xtyYQ2.LLILLL);
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        C1836920xty c1836920xtyYQ22 = yQ2();
        if (c1836920xtyYQ22 != null) {
            lValueOf2 = Long.valueOf(c1836920xtyYQ22.LLILLJJLI);
        } else {
            lValueOf2 = null;
        }
        String strValueOf2 = String.valueOf(lValueOf2);
        C1836920xty c1836920xtyYQ23 = yQ2();
        if (c1836920xtyYQ23 != null) {
            str = c1836920xtyYQ23.LLILZLL;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        C1836920xty c1836920xtyYQ24 = yQ2();
        if (c1836920xtyYQ24 != null) {
            l = c1836920xtyYQ24.LLILZ;
        }
        String strValueOf3 = String.valueOf(l);
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_pcs_payment_benefit_unlock");
        Map<String, String> map = c512030K6fLIZ.LIZLLL;
        "live_course".toString();
        map.put("source", "live_course");
        Map<String, String> map2 = c512030K6fLIZ.LIZLLL;
        strValueOf.toString();
        map2.put("user_id", strValueOf);
        Map<String, String> map3 = c512030K6fLIZ.LIZLLL;
        strValueOf2.toString();
        map3.put("to_user_id", strValueOf2);
        Map<String, String> map4 = c512030K6fLIZ.LIZLLL;
        str.toString();
        map4.put("show_entrance", str);
        c512030K6fLIZ.LIZ(Long.valueOf(jCurrentTimeMillis), "duration");
        Map<String, String> map5 = c512030K6fLIZ.LIZLLL;
        strValueOf3.toString();
        map5.put("room_id", strValueOf3);
        c512030K6fLIZ.LIZ(Boolean.valueOf(z), "is_success");
        Map<String, String> map6 = c512030K6fLIZ.LIZLLL;
        "".toString();
        map6.put("log_id", "");
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
    }

    public final void wQ2(C1791770wj9 c1791770wj9, GetSMBCourseDetailResponse.Data data) {
        String strLJIJI;
        boolean z;
        if (data == null || (strLJIJI = data.blockPurchaseReason) == null) {
            strLJIJI = "";
        }
        if (c1791770wj9 != null && !c1791770wj9.LIZ) {
            z = false;
        } else {
            z = true;
        }
        if (!BQ2(strLJIJI, z)) {
            return;
        }
        if (!CanRechargeSetting.INSTANCE.getValue()) {
            strLJIJI = C497740JfY.LJIJJ(2131855750, 18);
        } else if (strLJIJI.length() <= 0) {
            strLJIJI = C497740JfY.LJIJI(2131855751);
        }
        setState(new AwS77S1000000_27(strLJIJI, 5));
    }

    public static void zQ2(PcsCourseDetailVM pcsCourseDetailVM, String str, String str2, Long l, boolean z, int i) {
        Long lValueOf;
        Long lValueOf2;
        String str3;
        Long lValueOf3;
        Long lValueOf4;
        String str4;
        Long lValueOf5;
        Object obj;
        Object objValueOf = null;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        boolean z2 = false;
        if ((i & 8) != 0) {
            z = false;
        }
        C1836920xty c1836920xtyYQ2 = pcsCourseDetailVM.yQ2();
        if (c1836920xtyYQ2 != null) {
            z2 = c1836920xtyYQ2.LLIZLLLIL;
        }
        if (!z2) {
            C1837060xuC state = pcsCourseDetailVM.getState();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_purchase_page");
            C1836920xty c1836920xtyYQ22 = pcsCourseDetailVM.yQ2();
            if (c1836920xtyYQ22 != null) {
                lValueOf3 = Long.valueOf(c1836920xtyYQ22.LLILLJJLI);
            } else {
                lValueOf3 = null;
            }
            c474500IjALIZ.LJJII(lValueOf3, "anchor_id");
            C1836920xty c1836920xtyYQ23 = pcsCourseDetailVM.yQ2();
            if (c1836920xtyYQ23 != null) {
                lValueOf4 = Long.valueOf(c1836920xtyYQ23.LLILLL);
            } else {
                lValueOf4 = null;
            }
            c474500IjALIZ.LJJII(lValueOf4, "user_id");
            C1836920xty c1836920xtyYQ24 = pcsCourseDetailVM.yQ2();
            if (c1836920xtyYQ24 == null || (str4 = c1836920xtyYQ24.LLIZ) == null) {
                str4 = "";
            }
            c474500IjALIZ.LJJII(str4, "show_entrance");
            c474500IjALIZ.LJJII(str2, "click_position");
            c474500IjALIZ.LJJII(str, "action_type");
            C1836920xty c1836920xtyYQ25 = pcsCourseDetailVM.yQ2();
            if (c1836920xtyYQ25 != null) {
                lValueOf5 = Long.valueOf(c1836920xtyYQ25.LL);
            } else {
                lValueOf5 = null;
            }
            c474500IjALIZ.LJJII(lValueOf5, "course_id");
            C1836920xty c1836920xtyYQ26 = pcsCourseDetailVM.yQ2();
            if (c1836920xtyYQ26 != null) {
                objValueOf = c1836920xtyYQ26.LLILZLL;
            }
            c474500IjALIZ.LJJII(objValueOf, "enter_from");
            AbstractC1837080xuE abstractC1837080xuE = state.LLILLJJLI;
            abstractC1837080xuE.getClass();
            String str5 = "1";
            if (abstractC1837080xuE instanceof C1837160xuM) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(obj, "is_unlock");
            c474500IjALIZ.LJJII(l, "video_id");
            if (!z) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str5, "guide_m2");
            c474500IjALIZ.LIZ();
            return;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_service_plus_purchased_course_detail_page");
        C1836920xty c1836920xtyYQ27 = pcsCourseDetailVM.yQ2();
        if (c1836920xtyYQ27 != null) {
            lValueOf = Long.valueOf(c1836920xtyYQ27.LLILLJJLI);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ2.LJJII(lValueOf, "anchor_id");
        C1836920xty c1836920xtyYQ28 = pcsCourseDetailVM.yQ2();
        if (c1836920xtyYQ28 != null) {
            lValueOf2 = Long.valueOf(c1836920xtyYQ28.LLILLL);
        } else {
            lValueOf2 = null;
        }
        c474500IjALIZ2.LJJII(lValueOf2, "user_id");
        C1836920xty c1836920xtyYQ29 = pcsCourseDetailVM.yQ2();
        if (c1836920xtyYQ29 != null) {
            str3 = c1836920xtyYQ29.LLILZLL;
        } else {
            str3 = null;
        }
        c474500IjALIZ2.LJJII(str3, "show_entrance");
        c474500IjALIZ2.LJJII(str2, "click_position");
        c474500IjALIZ2.LJJII(str, "action_type");
        C1836920xty c1836920xtyYQ210 = pcsCourseDetailVM.yQ2();
        if (c1836920xtyYQ210 != null) {
            objValueOf = Long.valueOf(c1836920xtyYQ210.LL);
        }
        c474500IjALIZ2.LJJII(objValueOf, "course_id");
        c474500IjALIZ2.LJJII(l, "video_id");
        c474500IjALIZ2.LIZ();
    }
}
