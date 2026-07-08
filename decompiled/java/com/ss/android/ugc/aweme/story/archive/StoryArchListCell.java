package com.ss.android.ugc.aweme.story.archive;

import X.C1220000hqw;
import X.C1308910kAL;
import X.C1322090kVb;
import X.C1322110kVd;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1618440sDa;
import X.C1620160sGM;
import X.C1843500y4a;
import X.C209800rQ;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C422830Gi1;
import X.C438710HIf;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1334290kpH;
import X.InterfaceC1891350zJl;
import Y.ACListenerS115S0200000_11;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryArchListCell extends PowerCell<C209800rQ> {
    public StoryArchListCell() {
        C13LE.LIZ(StoryArchListViewModel.class);
        AFwS243S0000000_11.get$arr$(313);
        new C452070Ho5();
        C724750Sbp.LJII(this);
        C1220000hqw.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        ((SmartImageView) this.itemView.findViewById(R.id.ld7)).setAttached(true);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        ((SmartImageView) this.itemView.findViewById(R.id.ld7)).setAttached(false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int iIntValue;
        long playCount;
        UrlModel cover;
        boolean zLJI = MethodIDManager.LJI(202415);
        C209800rQ c209800rQ = (C209800rQ) interfaceC1891350zJl;
        boolean zLJI2 = MethodIDManager.LJI(202415);
        Aweme aweme = c209800rQ.LL;
        if (AwemeExtKt.isSharedStoryVisible(aweme) && !AwemeExtKt.isCommentPostInvisible(aweme)) {
            ((C1322110kVd) this.itemView.findViewById(R.id.ld7)).setActualImageResource(0);
            Video video = aweme.getVideo();
            if (video != null && !C1620160sGM.LIZLLL((SmartImageView) this.itemView.findViewById(R.id.ld7), video, "StoryArchListCell", false, false, 248) && (cover = video.getCover()) != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
                int[] iArrLIZ = C422830Gi1.LIZ(200);
                if (iArrLIZ != null) {
                    c1331670kl3LJIIIIZZ.LJJIJ(iArrLIZ);
                }
                c1331670kl3LJIIIIZZ.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.ld7));
                c1331670kl3LJIIIIZZ.LIZLLL("StoryArchListCell");
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
        } else {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_video_slash;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.itemView.getContext());
            ((ImageView) this.itemView.findViewById(R.id.ld7)).setScaleType(ImageView.ScaleType.CENTER);
            ((C1322090kVb) this.itemView.findViewById(R.id.ld7)).setImageDrawable(tuxIconDrawableLIZ);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, this.itemView.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            this.itemView.findViewById(R.id.ld7).setBackgroundColor(iIntValue);
        }
        Aweme aweme2 = c209800rQ.LL;
        View view = this.itemView;
        C786410Ut5.LLLLLLZZ((TuxIconView) view.findViewById(R.id.jv7), 0);
        C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.zfl), 0);
        ((TuxIconView) view.findViewById(R.id.jv7)).setIconRes(R.raw.icon_play);
        TextView textView = (TextView) view.findViewById(R.id.zfl);
        AwemeStatistics statistics = aweme2.getStatistics();
        if (statistics != null) {
            playCount = statistics.getPlayCount();
        } else {
            playCount = 0;
        }
        textView.setText(C1843500y4a.LIZIZ(playCount));
        C786410Ut5.I7(new ACListenerS115S0200000_11(this, c209800rQ, 15), this.itemView);
        Aweme aweme3 = c209800rQ.LL;
        if (AwemeExtKt.isProhibited(aweme3)) {
            ((TextView) this.itemView.findViewById(R.id.s_8)).setText(AwemeExtKt.getCoverNotice(aweme3));
            C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.o0x));
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.s_8), 0);
            C786410Ut5.LJZL(8, (LinearLayout) this.itemView.findViewById(R.id.nb4));
        } else {
            C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.o0x));
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.s_8), 8);
            C786410Ut5.LJZL(0, (LinearLayout) this.itemView.findViewById(R.id.nb4));
        }
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1618440sDa.LIZIZ.LJJ().LIZLLL(viewGroup.getContext(), null, R.layout.fd9, viewGroup, false);
    }
}
