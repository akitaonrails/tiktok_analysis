package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.replay;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C1835460xrc;
import X.C452501pT;
import X.C612730O1n;
import X.C623470Ocr;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.RoomReplay;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.GuideVM;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.NotificationBarVM;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes28.dex */
public final class ReplayListViewModel extends AssemListViewModel<C612730O1n, C1835460xrc, Long> {
    public NotificationBarVM LL;
    public GuideVM LLILLJJLI;
    public int LLILZ;
    public String LLILLL = "";
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(142));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C612730O1n(0);
    }

    public static C1835460xrc vQ2(RoomReplay roomReplay) {
        Float fValueOf;
        String str;
        int i;
        String str2 = roomReplay.id;
        ImageModel imageModel = roomReplay.cover;
        VideoMetaInfo videoMetaInfo = roomReplay.hlsVideoMetaInfo;
        if (videoMetaInfo != null) {
            fValueOf = Float.valueOf(videoMetaInfo.duration);
        } else {
            fValueOf = null;
        }
        Long lValueOf = Long.valueOf(roomReplay.createTime);
        String str3 = roomReplay.replayStats;
        VideoMetaInfo videoMetaInfo2 = roomReplay.mp4VideoMetaInfo;
        if (videoMetaInfo2 == null || (str = videoMetaInfo2.fileId) == null) {
            str = "";
        }
        Integer numValueOf = Integer.valueOf(roomReplay.status);
        String str4 = roomReplay.m3u8Url;
        String str5 = roomReplay.downloadUrl;
        VideoMetaInfo videoMetaInfo3 = roomReplay.hlsVideoMetaInfo;
        int i2 = 0;
        if (videoMetaInfo3 != null) {
            i = (int) videoMetaInfo3.width;
        } else {
            i = 0;
        }
        Integer numValueOf2 = Integer.valueOf(i);
        VideoMetaInfo videoMetaInfo4 = roomReplay.hlsVideoMetaInfo;
        if (videoMetaInfo4 != null) {
            i2 = (int) videoMetaInfo4.height;
        }
        return new C1835460xrc(str2, imageModel, fValueOf, lValueOf, str3, str, numValueOf, str4, str5, numValueOf2, Integer.valueOf(i2), roomReplay.watchStatus, roomReplay.available, roomReplay.punishType);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1835460xrc> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 246));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return wQ2(0L, interfaceC1364105Vn);
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.replay.ReplayListViewModel.wQ2(long, X.05Vn):java.lang.Object");
    }
}
