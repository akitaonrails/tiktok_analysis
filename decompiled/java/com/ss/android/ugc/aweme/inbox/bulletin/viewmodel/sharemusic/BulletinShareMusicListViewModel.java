package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.sharemusic;

import X.AbstractC316870CbV;
import X.C06J8;
import X.C09R9;
import X.C0OHA;
import X.C0OOW;
import X.C0OU4;
import X.C0OUB;
import X.C13LE;
import X.C1545590qK5;
import X.C1559260qg8;
import X.C1907940zkW;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C618880OPe;
import X.C618910OPh;
import X.C623470Ocr;
import X.C627660Ojc;
import X.C723600SZy;
import X.EnumC618850OPb;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import android.net.Uri;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardUIInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridCardConfigStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SingleBulletinItemCreateInfo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinShareMusicListViewModel extends AssemListViewModel<C618880OPe, InterfaceC1891350zJl, Integer> {
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C0OHA.class));
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C06J8.class, "bulletin_publish_data"), true);
    public EnumC618850OPb LLILLL;
    public int LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C618880OPe(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 232));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r10) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.sharemusic.BulletinShareMusicListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(int r7, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r8) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.sharemusic.BulletinShareMusicListViewModel.onLoadMore(int, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(num.intValue(), interfaceC1364105Vn);
    }

    public final C0OOW vQ2(long j, int i, String str, String str2, String str3, List list, String str4) {
        Long l;
        String strLIZIZ;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        Integer numLJIIJJI3;
        Integer numLJIIJJI4;
        Integer numLJIIJJI5;
        Integer numLJIIJJI6;
        Integer numLJIIJJI7;
        Integer numLJIIJJI8;
        C06J8 c06j8 = (C06J8) this.LLILLJJLI.getValue();
        if (c06j8 == null || (l = c06j8.LL) == null) {
            return null;
        }
        long jLongValue = l.longValue();
        SingleBulletinItemCreateInfo singleBulletinItemCreateInfo = new SingleBulletinItemCreateInfo(Integer.valueOf(i), Long.valueOf(jLongValue), null, null, null, null, str4, null);
        String str5 = (String) ((Map) C0OUB.LIZIZ.getValue()).get(Long.valueOf(j));
        if (str5 == null) {
            return null;
        }
        if (C0OU4.LIZ(str5)) {
            strLIZIZ = C1545590qK5.LIZIZ.LIZIZ(str5, C2097608Jq.LJ());
        } else {
            strLIZIZ = str5;
        }
        Uri uri = UriProtector.parse(strLIZIZ);
        String strLIZIZ2 = C1907940zkW.LIZIZ(uri, "bulletin_card_width");
        if (strLIZIZ2 != null && (numLJIIJJI8 = C2095008Iq.LJIIJJI(strLIZIZ2)) != null) {
            iIntValue = numLJIIJJI8.intValue();
        } else {
            iIntValue = 180;
        }
        String strLIZIZ3 = C1907940zkW.LIZIZ(uri, "bulletin_card_height");
        if (strLIZIZ3 != null && (numLJIIJJI7 = C2095008Iq.LJIIJJI(strLIZIZ3)) != null) {
            iIntValue2 = numLJIIJJI7.intValue();
        } else {
            iIntValue2 = 290;
        }
        String strLIZIZ4 = C1907940zkW.LIZIZ(uri, "bulletin_position");
        if (strLIZIZ4 != null && (numLJIIJJI6 = C2095008Iq.LJIIJJI(strLIZIZ4)) != null) {
            iIntValue3 = numLJIIJJI6.intValue();
        } else {
            iIntValue3 = 1;
        }
        String strLIZIZ5 = C1907940zkW.LIZIZ(uri, "enable_emoji");
        boolean z5 = false;
        if (strLIZIZ5 != null && (numLJIIJJI5 = C2095008Iq.LJIIJJI(strLIZIZ5)) != null && numLJIIJJI5.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z6 = !z;
        String strLIZIZ6 = C1907940zkW.LIZIZ(uri, "enable_avatar");
        if (strLIZIZ6 != null && (numLJIIJJI4 = C2095008Iq.LJIIJJI(strLIZIZ6)) != null && numLJIIJJI4.intValue() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z7 = !z2;
        String strLIZIZ7 = C1907940zkW.LIZIZ(uri, "enable_long_press_panel");
        if (strLIZIZ7 != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(strLIZIZ7)) != null && numLJIIJJI3.intValue() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z8 = !z3;
        String strLIZIZ8 = C1907940zkW.LIZIZ(uri, "enable_view_count");
        if (strLIZIZ8 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(strLIZIZ8)) != null && numLJIIJJI2.intValue() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z9 = !z4;
        String strLIZIZ9 = C1907940zkW.LIZIZ(uri, "enable_report");
        if (strLIZIZ9 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZIZ9)) != null && numLJIIJJI.intValue() == 0) {
            z5 = true;
        }
        return new C0OOW(str3, str, str2, singleBulletinItemCreateInfo, C618910OPh.LIZLLL(C618910OPh.LIZ, jLongValue, i, null, new BulletinCardInfo(j, "2", new BulletinCardUIInfo(null, null, str, str2, null, null, null, null, list, null, null), new BulletinHybridCardConfigStruct(str5, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), null, null), Integer.valueOf(iIntValue3), Boolean.valueOf(z6), Boolean.valueOf(z7), Boolean.valueOf(z8), Boolean.valueOf(z9), Boolean.valueOf(!z5), Boolean.TRUE, null, null), singleBulletinItemCreateInfo.extra, null, null, 460), 32);
    }
}
