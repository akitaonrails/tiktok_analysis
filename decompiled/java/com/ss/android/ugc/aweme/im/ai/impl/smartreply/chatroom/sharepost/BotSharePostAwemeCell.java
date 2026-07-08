package com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost;

import X.C0HIA;
import X.C0HIC;
import X.C0HZQ;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1361400lX0;
import X.C1385040m98;
import X.C1843500y4a;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C438710HIf;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import java.util.List;
import wh6.AbS688S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class BotSharePostAwemeCell extends PowerCell<C0HIA> {
    public final void I5(C0HIA c0hia) {
        int i;
        C0HZQ c0hzq = (C0HZQ) this.itemView.findViewById(R.id.c_t);
        if (c0hzq != null) {
            c0hzq.setChecked(c0hia.LLILLJJLI);
            c0hzq.setInnerMaskVisibility(!c0hia.LLILLJJLI);
        }
        View viewFindViewById = this.itemView.findViewById(R.id.ca0);
        if (viewFindViewById != null) {
            if (c0hia.LLILLL) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: L5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C0HIA c0hia) {
        long playCount;
        UrlModel cover;
        int iIntValue;
        Aweme aweme = c0hia.LL;
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.c_v);
        if (smartImageView != null) {
            if (AwemeExtKt.isCommentPostInvisible(aweme)) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_video_slash;
                c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.itemView.getContext());
                smartImageView.setScaleType(ImageView.ScaleType.CENTER);
                smartImageView.setImageDrawable(tuxIconDrawableLIZ);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, this.itemView.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                smartImageView.setBackgroundColor(iIntValue);
            } else {
                smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                Video video = aweme.getVideo();
                if (video != null) {
                    cover = video.getCover();
                } else {
                    cover = null;
                }
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
                c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
        }
        TextView textView = (TextView) this.itemView.findViewById(R.id.ca1);
        if (textView != null) {
            AwemeStatistics statistics = c0hia.LL.getStatistics();
            if (statistics != null) {
                playCount = statistics.getPlayCount();
            } else {
                playCount = 0;
            }
            textView.setText(C1843500y4a.LIZIZ(playCount));
        }
        I5(c0hia);
        C786410Ut5.I7(new AbS688S0100000_6(c0hia, 6), this.itemView);
        this.itemView.setOnLongClickListener(C0HIC.LL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewInflateItemView$default = PowerCell.inflateItemView$default(this, viewGroup, R.layout.ckc, false, 4, null);
        C0HZQ c0hzq = (C0HZQ) viewInflateItemView$default.findViewById(R.id.c_t);
        int iIntValue = 0;
        if (c0hzq != null) {
            C1361400lX0 c1361400lX0LIZ = C1385040m98.LIZ(viewInflateItemView$default.getContext(), false);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, c1361400lX0LIZ);
            if (numLIZJ != null) {
                c0hzq.setCheckBoxMaskColor(numLIZJ.intValue());
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0w, c1361400lX0LIZ);
            if (numLIZJ2 != null) {
                c0hzq.setCheckBoxUncheckedColor(numLIZJ2.intValue());
            }
        }
        View viewFindViewById = viewInflateItemView$default.findViewById(R.id.ca0);
        if (viewFindViewById != null) {
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a01, C1385040m98.LIZ(viewInflateItemView$default.getContext(), true));
            if (numLIZJ3 != null) {
                iIntValue = numLIZJ3.intValue();
            }
            viewFindViewById.setBackgroundColor(iIntValue);
        }
        return viewInflateItemView$default;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C0HIA c0hia = (C0HIA) interfaceC1891350zJl;
        if (list.contains("payload_selection")) {
            I5(c0hia);
            C786410Ut5.I7(new AbS688S0100000_6(c0hia, 6), this.itemView);
            this.itemView.setOnLongClickListener(C0HIC.LL);
            return;
        }
        onBindItemView(c0hia);
    }
}
