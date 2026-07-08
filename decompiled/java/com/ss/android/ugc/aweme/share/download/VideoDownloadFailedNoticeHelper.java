package com.ss.android.ugc.aweme.share.download;

import X.C0SU5;
import X.C1375730lu7;
import X.C1389910mGz;
import X.C1C7U;
import X.C707360Ros;
import X.C707370Rot;
import Y.ACListenerS155S0100000_21;
import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.share.download.VideoDownloadFailedNoticeHelper;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class VideoDownloadFailedNoticeHelper {
    public static final VideoDownloadFailedNoticeHelper LIZ = new VideoDownloadFailedNoticeHelper();
    public static C1389910mGz LIZIZ;
    public static final VideoDownloadFailedNoticeHelper$mHandler$1 LIZJ;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.share.download.VideoDownloadFailedNoticeHelper$mHandler$1] */
    static {
        final Looper mainLooper = Looper.getMainLooper();
        LIZJ = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.share.download.VideoDownloadFailedNoticeHelper$mHandler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("VideoDownloadFailedNoticeHelper@9cab.mHandler$1");
                VideoDownloadFailedNoticeHelper.LIZ.LIZIZ();
                C1C7U.LIZIZ("VideoDownloadFailedNoticeHelper@9cab.mHandler$1");
            }
        };
    }

    public final void LIZ() {
        Observer<C0SU5> observer = new Observer<C0SU5>() { // from class: X.0lv0
            public static final /* synthetic */ int LL = 0;

            @Override // androidx.lifecycle.Observer
            public final void onChanged(C0SU5 c0su5) {
                int i;
                C0SU5 c0su52 = c0su5;
                Activity activityLJFF = C2214201BlK.LJFF();
                if (activityLJFF != null) {
                    if (C1376270luz.LIZLLL() || C1376270luz.LIZJ() || C591970NJr.LIZIZ().LIZ() || C1EE2.LIZIZ.LJJJZ(activityLJFF)) {
                        c0su52.getClass();
                        int i2 = C0SU5.LIZIZ;
                        if (i2 != 4) {
                            if (i2 == 5) {
                                VideoDownloadFailedNoticeHelper.LIZ.getClass();
                                C1389910mGz c1389910mGz = VideoDownloadFailedNoticeHelper.LIZIZ;
                                if (c1389910mGz != null) {
                                    c1389910mGz.LIZJ();
                                    return;
                                }
                                return;
                            }
                        } else {
                            VideoDownloadFailedNoticeHelper.LIZ.getClass();
                            C1389910mGz c1389910mGz2 = VideoDownloadFailedNoticeHelper.LIZIZ;
                            if (c1389910mGz2 == null) {
                                return;
                            }
                            c1389910mGz2.LIZJ();
                            return;
                        }
                    }
                    c0su52.getClass();
                    Aweme aweme = C0SU5.LIZLLL;
                    int i3 = C0SU5.LIZIZ;
                    if (i3 != 1) {
                        if (i3 != 4) {
                            if (i3 != 5 || aweme == null) {
                                return;
                            }
                            VideoDownloadFailedNoticeHelper videoDownloadFailedNoticeHelper = VideoDownloadFailedNoticeHelper.LIZ;
                            boolean z = C0SU5.LJ;
                            videoDownloadFailedNoticeHelper.LIZIZ();
                            TuxTextView tuxTextView = new TuxTextView(activityLJFF, null, 6, 0);
                            tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a04, tuxTextView.getContext()));
                            tuxTextView.setText(2131834557);
                            tuxTextView.setTuxFont(41);
                            C786410Ut5.h9(tuxTextView, new ACListenerS155S0100000_21(aweme, 249));
                            C1389910mGz c1389910mGz3 = new C1389910mGz(activityLJFF);
                            c1389910mGz3.LJI(R.style.y0);
                            if (C621180OYa.LIZIZ.LJIILJJIL(aweme)) {
                                i = 2131858251;
                            } else {
                                i = 2131834554;
                            }
                            c1389910mGz3.LJIIIZ(i);
                            c1389910mGz3.LIZ.LIZLLL = 3;
                            c1389910mGz3.LIZ.LJ = new AwS595S0100000_16(tuxTextView, 373);
                            c1389910mGz3.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(143)));
                            c1389910mGz3.LJ(30000L);
                            VideoDownloadFailedNoticeHelper.LIZIZ = c1389910mGz3;
                            c1389910mGz3.LJIIJJI();
                            C786410Ut5.LJLJJI(1, 8000L, VideoDownloadFailedNoticeHelper.LIZJ);
                            if (z) {
                                return;
                            }
                            C1376270luz.LIZ.getClass();
                            Aweme aweme2 = C1376270luz.LJI;
                            if (aweme2 == null) {
                                return;
                            }
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("group_id", aweme2.getAid());
                            c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme2));
                            C20684815ws.LJIILLIIL("download_failure_window_show", c2344009Gk.LIZ);
                            return;
                        }
                        if (aweme == null) {
                            return;
                        }
                        C1376290lv1.LIZ(activityLJFF, c0su52);
                        return;
                    }
                    VideoDownloadFailedNoticeHelper.LIZ.getClass();
                    C1389910mGz c1389910mGz4 = VideoDownloadFailedNoticeHelper.LIZIZ;
                    if (c1389910mGz4 == null) {
                        return;
                    }
                    c1389910mGz4.LIZJ();
                }
            }
        };
        C707360Ros c707360Ros = C707370Rot.LIZ;
        c707360Ros.LIZ("video_download_status").observeForever(observer, true);
        c707360Ros.LIZ("video_click_retry").observeForever(new Observer<Aweme>() { // from class: X.0luw
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Aweme aweme) {
                String aid;
                Aweme aweme2 = aweme;
                Activity activityLJFF = C2214201BlK.LJFF();
                if (activityLJFF != null) {
                    String aid2 = aweme2.getAid();
                    C1376270luz.LIZ.getClass();
                    Aweme aweme3 = C1376270luz.LJI;
                    if (aweme3 != null) {
                        aid = aweme3.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(aid2, aid)) {
                        C1376270luz.LJIIIZ++;
                    } else {
                        C1376270luz.LJIIIZ = 0;
                    }
                    if (aweme2.getAwemeType() == 150) {
                        C1376300lv2.LIZ.getClass();
                        String str = C1376300lv2.LJFF;
                        if (str == null) {
                            str = "";
                        }
                        C1376300lv2.LIZJ(aweme2, str, AFwS259S0000000_21.get$arr$(17));
                        return;
                    }
                    C621180OYa.LIZIZ.LJIJ(activityLJFF, aweme2, C1376270luz.LJII, "retry", null).LJJIIZ(aweme2, activityLJFF, C1376270luz.LJIIL, C1376270luz.LJIIJJI, false, C1376270luz.LJIILIIL);
                }
            }
        });
        c707360Ros.LIZ("photo_click_try").observeForever(C1375730lu7.LIZIZ.LJIIIIZZ());
    }

    public final void LIZIZ() {
        C1389910mGz c1389910mGz = LIZIZ;
        if (c1389910mGz != null) {
            c1389910mGz.LIZJ();
        }
        LIZIZ = null;
        VideoDownloadFailedNoticeHelper$mHandler$1 videoDownloadFailedNoticeHelper$mHandler$1 = LIZJ;
        if (videoDownloadFailedNoticeHelper$mHandler$1.hasMessages(1)) {
            videoDownloadFailedNoticeHelper$mHandler$1.removeMessages(1);
        }
    }
}
