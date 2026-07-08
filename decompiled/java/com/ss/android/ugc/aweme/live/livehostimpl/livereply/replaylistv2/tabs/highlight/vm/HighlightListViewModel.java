package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.vm;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C1835580xro;
import X.C452501pT;
import X.C612690O1j;
import X.C623470Ocr;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.GuideVM;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.NotificationBarVM;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS588S0100000_9;
import tikcast.api.anchor.AiClipWidget;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: loaded from: classes28.dex */
public final class HighlightListViewModel extends AssemListViewModel<C612690O1j, C1835580xro, Long> {
    public NotificationBarVM LL;
    public GuideVM LLILLJJLI;
    public int LLILZ;
    public boolean LLILZIL;
    public String LLILLL = "";
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(139));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C612690O1j(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1835580xro> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 245));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return vQ2(0L, interfaceC1364105Vn);
    }

    public final C1835580xro wQ2(LiveFragmentDetail liveFragmentDetail) {
        long j;
        long j2;
        boolean z;
        long j3 = liveFragmentDetail.fragmentId;
        String str = liveFragmentDetail.downloadUrl;
        String str2 = liveFragmentDetail.coverUrl;
        long j4 = liveFragmentDetail.createTime;
        String str3 = liveFragmentDetail.longTitle;
        if (str3.length() == 0) {
            str3 = liveFragmentDetail.title;
        }
        AiClipWidget aiClipWidget = liveFragmentDetail.aiClipWidget;
        String str4 = liveFragmentDetail.roomIdStr;
        String str5 = liveFragmentDetail.ownerUserIdStr;
        int i = liveFragmentDetail.fragmentType;
        int i2 = liveFragmentDetail.videoStatus;
        VideoMetaInfo videoMetaInfo = liveFragmentDetail.mp4VideoMetaInfo;
        if (videoMetaInfo != null) {
            j = videoMetaInfo.width;
        } else {
            j = liveFragmentDetail.witdh;
        }
        int i3 = (int) j;
        if (videoMetaInfo != null) {
            j2 = videoMetaInfo.height;
        } else {
            j2 = liveFragmentDetail.height;
        }
        int i4 = (int) j2;
        boolean z2 = this.LLILZIL;
        int i5 = this.LLILZ;
        if (i5 == 5) {
            z = true;
        } else {
            z = false;
        }
        return new C1835580xro(j3, str, str2, j4, str3, aiClipWidget, str4, str5, i, i2, i3, i4, z2, z, String.valueOf(i5));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return vQ2(l.longValue(), interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8 A[Catch: Exception -> 0x013a, TryCatch #0 {Exception -> 0x013a, blocks: (B:32:0x00a0, B:33:0x00a3, B:35:0x00a8, B:38:0x00ae, B:42:0x00da, B:44:0x00de, B:46:0x00e2, B:48:0x00ee, B:50:0x00f2, B:51:0x00f7, B:52:0x0108, B:54:0x010e, B:55:0x011c, B:57:0x0120, B:59:0x012d), top: B:66:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae A[Catch: Exception -> 0x013a, TryCatch #0 {Exception -> 0x013a, blocks: (B:32:0x00a0, B:33:0x00a3, B:35:0x00a8, B:38:0x00ae, B:42:0x00da, B:44:0x00de, B:46:0x00e2, B:48:0x00ee, B:50:0x00f2, B:51:0x00f7, B:52:0x0108, B:54:0x010e, B:55:0x011c, B:57:0x0120, B:59:0x012d), top: B:66:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(long r12, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r14) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.vm.HighlightListViewModel.vQ2(long, X.05Vn):java.lang.Object");
    }
}
