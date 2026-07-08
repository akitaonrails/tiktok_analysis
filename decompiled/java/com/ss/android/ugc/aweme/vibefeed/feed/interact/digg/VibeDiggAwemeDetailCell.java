package com.ss.android.ugc.aweme.vibefeed.feed.interact.digg;

import X.C12ES;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1388190mED;
import X.C14KQ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1575440r6E;
import X.C1575960r74;
import X.C1843500y4a;
import X.C2188811AlT;
import X.C339190DRl;
import X.C438710HIf;
import X.C628890Olb;
import X.C628920Ole;
import X.C786410Ut5;
import X.EnumC1334360kpO;
import X.InterfaceC1891350zJl;
import Y.ACListenerS113S0200000_9;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.detail.prefab.ability.InnerFlowAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedItem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes10.dex */
public final class VibeDiggAwemeDetailCell extends PowerCell<C628920Ole> {
    public InnerFlowAbility<C628920Ole> LL;
    public TuxTextView LLILLJJLI;
    public FrameLayout LLILLL;
    public SmartImageView LLILZ;
    public TuxIconView LLILZIL;
    public TuxTextView LLILZLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.i85;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        Fragment fragmentLIZJ = C1575440r6E.LIZJ(this);
        this.LL = fragmentLIZJ != null ? (InnerFlowAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZJ, null), InnerFlowAbility.class, null) : null;
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.mnm);
        this.LLILLL = (FrameLayout) this.itemView.findViewById(R.id.f4y);
        this.LLILZ = (SmartImageView) this.itemView.findViewById(R.id.cover);
        this.LLILZIL = (TuxIconView) this.itemView.findViewById(R.id.qcw);
        this.itemView.findViewById(R.id.qmu);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.qmp);
        this.itemView.setPadding(2, 2, 2, 2);
        SmartImageView smartImageView = this.LLILZ;
        if (smartImageView != null) {
            int iLJIILJJIL = C12ES.LJIILJJIL(C14KQ.LJIIIIZZ(C1388190mED.LIZ(smartImageView.getContext())), smartImageView.getContext());
            C1575960r74 c1575960r74 = C1575960r74.LL;
            Context context = this.itemView.getContext();
            c1575960r74.getClass();
            int iLIZIZ = C1575960r74.LIZIZ(context);
            smartImageView.getLayoutParams().width = (int) C339190DRl.LIZ((iLJIILJJIL - ((iLIZIZ + 1) * 2)) / iLIZIZ);
            smartImageView.getLayoutParams().height = (int) C339190DRl.LIZ((r4 * 4) / 3);
            smartImageView.requestLayout();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Aweme aweme;
        Video video;
        long playCount;
        Aweme aweme2;
        AwemeStatistics statistics;
        Aweme aweme3;
        C628920Ole c628920Ole = (C628920Ole) interfaceC1891350zJl;
        super.onBindItemView(c628920Ole);
        UrlModel cover = null;
        if (C628890Olb.LIZ[c628920Ole.LLIZLLLIL.ordinal()] == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" onBindItemView t = ");
            sbLIZ.append(c628920Ole.LLILZ);
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
            C339190DRl.LIZIZ(this.LLILLL);
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                C339190DRl.LIZLLL(tuxTextView);
                tuxTextView.setText(c628920Ole.LLILZ);
            }
            C786410Ut5.I7(null, this.itemView);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(" onBindItemView t = ");
        sbLIZ2.append(c628920Ole.LLILLJJLI.getDesc());
        sbLIZ2.append(' ');
        C2188811AlT.LIZIZ(sbLIZ2);
        C339190DRl.LIZIZ(this.LLILLJJLI);
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null) {
            C339190DRl.LIZLLL(frameLayout);
            TuxIconView tuxIconView = this.LLILZIL;
            if (tuxIconView != null) {
                VibeFeedItem vibeFeedItem = c628920Ole.LLILLL;
                int i = 0;
                if (vibeFeedItem == null || (aweme3 = vibeFeedItem.aweme) == null || !AwemeExtKt.isPhotoMode(aweme3)) {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, tuxIconView);
            }
            TuxTextView tuxTextView2 = this.LLILZLL;
            if (tuxTextView2 != null) {
                VibeFeedItem vibeFeedItem2 = c628920Ole.LLILLL;
                if (vibeFeedItem2 != null && (aweme2 = vibeFeedItem2.aweme) != null && (statistics = aweme2.getStatistics()) != null) {
                    playCount = statistics.getPlayCount();
                } else {
                    playCount = 0;
                }
                tuxTextView2.setText(C1843500y4a.LIZIZ(playCount));
            }
            VibeFeedItem vibeFeedItem3 = c628920Ole.LLILLL;
            if (vibeFeedItem3 != null && (aweme = vibeFeedItem3.aweme) != null && (video = aweme.getVideo()) != null) {
                cover = video.getCover();
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
            c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIIIZZ.LJJIII = EnumC1334360kpO.HIGH;
            c1331670kl3LJIIIIZZ.LJJ(this.LLILZ);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        C786410Ut5.I7(new ACListenerS113S0200000_9(this, c628920Ole, 1), this.itemView);
    }
}
