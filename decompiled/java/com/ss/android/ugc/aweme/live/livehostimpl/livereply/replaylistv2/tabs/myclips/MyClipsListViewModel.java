package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.myclips;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C0HXF;
import X.C1782840wUk;
import X.C452501pT;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.GuideVM;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.NotificationBarVM;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS585S0100000_6;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: loaded from: classes28.dex */
public final class MyClipsListViewModel extends AssemListViewModel<C0HXF, C1782840wUk, Long> {
    public NotificationBarVM LL;
    public GuideVM LLILLJJLI;
    public int LLILZ;
    public boolean LLILZIL;
    public String LLILLL = "";
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(141));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0HXF(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1782840wUk> c627660Ojc) {
        setState(new AwS585S0100000_6(c627660Ojc, (C627660Ojc<C1782840wUk>) 122));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return wQ2(0L, interfaceC1364105Vn);
    }

    public final C1782840wUk vQ2(LiveFragmentDetail liveFragmentDetail) {
        long j;
        long j2;
        boolean z;
        long j3 = liveFragmentDetail.fragmentId;
        String str = liveFragmentDetail.coverUrl;
        long j4 = liveFragmentDetail.createTime;
        float f = liveFragmentDetail.videoDuration;
        String str2 = liveFragmentDetail.roomIdStr;
        String str3 = liveFragmentDetail.ownerUserIdStr;
        int i = liveFragmentDetail.videoStatus;
        VideoMetaInfo videoMetaInfo = liveFragmentDetail.mp4VideoMetaInfo;
        if (videoMetaInfo != null) {
            j = videoMetaInfo.width;
        } else {
            j = liveFragmentDetail.witdh;
        }
        int i2 = (int) j;
        if (videoMetaInfo != null) {
            j2 = videoMetaInfo.height;
        } else {
            j2 = liveFragmentDetail.height;
        }
        int i3 = (int) j2;
        boolean z2 = this.LLILZIL;
        int i4 = this.LLILZ;
        if (i4 == 5) {
            z = true;
        } else {
            z = false;
        }
        return new C1782840wUk(j3, str, j4, f, str2, str3, i, i2, i3, z2, z, String.valueOf(i4));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return wQ2(l.longValue(), interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9 A[Catch: Exception -> 0x013b, TryCatch #0 {Exception -> 0x013b, blocks: (B:32:0x00a1, B:33:0x00a4, B:35:0x00a9, B:38:0x00af, B:42:0x00db, B:44:0x00df, B:46:0x00e3, B:48:0x00ef, B:50:0x00f3, B:51:0x00f8, B:52:0x0109, B:54:0x010f, B:55:0x011d, B:57:0x0121, B:59:0x012e), top: B:66:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[Catch: Exception -> 0x013b, TryCatch #0 {Exception -> 0x013b, blocks: (B:32:0x00a1, B:33:0x00a4, B:35:0x00a9, B:38:0x00af, B:42:0x00db, B:44:0x00df, B:46:0x00e3, B:48:0x00ef, B:50:0x00f3, B:51:0x00f8, B:52:0x0109, B:54:0x010f, B:55:0x011d, B:57:0x0121, B:59:0x012e), top: B:66:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(long r12, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r14) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.myclips.MyClipsListViewModel.wQ2(long, X.05Vn):java.lang.Object");
    }
}
