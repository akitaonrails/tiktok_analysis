package com.ss.android.ugc.aweme.series.feed.seriescenter;

import X.C01GW;
import X.C1320310kSj;
import X.C1320340kSm;
import X.C1324840ka2;
import X.C1331090kk7;
import X.C1331100kk8;
import X.C13LP;
import X.C1573110r2T;
import X.C19350310n7;
import X.C452501pT;
import X.C786410Ut5;
import X.C800330VaR;
import X.EnumC1578890rBn;
import X.InterfaceC1320380kSq;
import Y.ACListenerS158S0100000_24;
import Y.ARunnableS28S1200000_24;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import com.ss.android.ugc.aweme.model.BadgeType;
import com.ss.android.ugc.aweme.series.vip.cell.SeriesVipSubscriptionTrendingDramaListCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public abstract class MiniDramaCenterOverViewBaseCell<T extends C1573110r2T> extends PowerCell<T> {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxIconView LLILZIL;
    public TuxTextView LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24((MiniDramaCenterOverViewBaseCell) this, 951));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS568S0100000_24((MiniDramaCenterOverViewBaseCell) this, 950));

    public boolean L5() {
        return !(this instanceof SeriesVipSubscriptionTrendingDramaListCell);
    }

    public abstract void onItemClick();

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (TuxTextView) this.itemView.findViewById(R.id.e7m);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.e7k);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.f750m4p);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.yko);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.fy7);
        this.LLILZIL = (TuxIconView) this.itemView.findViewById(R.id.qmu);
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 37), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: I5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t) {
        float dimension;
        Drawable drawableLIZIZ;
        TuxTextView tuxTextView;
        String str;
        List<String> urlList;
        String str2;
        int i;
        if (t == null) {
            return;
        }
        ShortDramaOverview shortDramaOverview = t.LL;
        RemoteImageView remoteImageView = (RemoteImageView) this.itemView.findViewById(R.id.e7c);
        try {
            dimension = remoteImageView.getResources().getDimension(R.dimen.b5);
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            dimension = 8.0f;
        }
        Resources resources = remoteImageView.getContext().getResources();
        C1331090kk7 c1331090kk7 = new C1331090kk7(resources);
        c1331090kk7.LJIIZILJ = C1331100kk8.LIZLLL(dimension);
        C1320310kSj c1320310kSj = InterfaceC1320380kSq.LIZJ;
        c1331090kk7.LJ = resources.getDrawable(R.drawable.arq);
        c1331090kk7.LJFF = c1320310kSj;
        C1320340kSm c1320340kSm = InterfaceC1320380kSq.LJI;
        c1331090kk7.LJIIIIZZ = resources.getDrawable(R.drawable.arq);
        c1331090kk7.LJIIIZ = c1320340kSm;
        remoteImageView.setHierarchy(c1331090kk7.LIZ());
        UrlModel urlModel = shortDramaOverview.cover;
        int i2 = 0;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (str2 = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
            int i3 = this.LLIZ;
            if (i3 != 0 && (i = this.LLIZLLLIL) != 0) {
                C1324840ka2.LJIIJ(remoteImageView, str2, i3, i);
            } else {
                HandlerHook.viewPost(remoteImageView, new ARunnableS28S1200000_24(remoteImageView, str2, this, 2));
            }
        }
        TuxTextView tuxTextView2 = this.LL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(shortDramaOverview.title);
        }
        TuxTextView tuxTextView3 = this.LLILLJJLI;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(shortDramaOverview.categories);
        }
        Drawable drawable = null;
        if (!(this instanceof SeriesVipSubscriptionTrendingDramaListCell)) {
            TuxTextView tuxTextView4 = this.LLILLL;
            if (tuxTextView4 != null) {
                C786410Ut5.LLLLZLL(tuxTextView4, 0);
            }
            TuxTextView tuxTextView5 = this.LLILLL;
            if (tuxTextView5 != null) {
                Boolean bool = shortDramaOverview.labelHot;
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.LJFF(bool, bool2)) {
                    TuxTextView tuxTextView6 = this.LLILLL;
                    if (tuxTextView6 != null) {
                        Context context = getContext();
                        if (context != null) {
                            drawable = context.getDrawable(R.drawable.ary);
                        }
                        tuxTextView6.setBackground(drawable);
                    }
                    str = (String) this.LLJI.getValue();
                } else if (Intrinsics.LJFF(shortDramaOverview.labelNew, bool2)) {
                    TuxTextView tuxTextView7 = this.LLILLL;
                    if (tuxTextView7 != null) {
                        Context context2 = getContext();
                        if (context2 != null) {
                            drawable = context2.getDrawable(R.drawable.arw);
                        }
                        tuxTextView7.setBackground(drawable);
                    }
                    str = (String) this.LLJ.getValue();
                } else {
                    TuxTextView tuxTextView8 = this.LLILLL;
                    if (tuxTextView8 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView8, 8);
                    }
                    str = "";
                }
                tuxTextView5.setText(str);
            }
        } else {
            TuxTextView tuxTextView9 = this.LLILLL;
            if (tuxTextView9 != null) {
                C786410Ut5.LLLLZLL(tuxTextView9, 8);
            }
        }
        if (L5()) {
            TuxTextView tuxTextView10 = this.LLILZ;
            if (tuxTextView10 != null) {
                if (!Intrinsics.LJFF(shortDramaOverview.showRankBadge, Boolean.TRUE)) {
                    i2 = 8;
                }
                C786410Ut5.LJLLLLLL(i2, tuxTextView10);
            }
            int absoluteAdapterPosition = getAbsoluteAdapterPosition() + 1;
            if (Intrinsics.LJFF(shortDramaOverview.showRankBadge, Boolean.TRUE)) {
                Context context3 = getContext();
                if (context3 != null) {
                    if (absoluteAdapterPosition == 1) {
                        drawableLIZIZ = C800330VaR.LIZIZ(context3, R.drawable.ars);
                    } else if (absoluteAdapterPosition == 2) {
                        drawableLIZIZ = C800330VaR.LIZIZ(context3, R.drawable.arv);
                    } else if (absoluteAdapterPosition == 3) {
                        drawableLIZIZ = C800330VaR.LIZIZ(context3, R.drawable.aru);
                    } else if (absoluteAdapterPosition > 3) {
                        drawableLIZIZ = C800330VaR.LIZIZ(context3, R.drawable.art);
                    }
                    if (drawableLIZIZ != null && (tuxTextView = this.LLILZ) != null) {
                        tuxTextView.setBackground(drawableLIZIZ);
                    }
                }
                TuxTextView tuxTextView11 = this.LLILZ;
                if (tuxTextView11 != null) {
                    tuxTextView11.setText(String.valueOf(absoluteAdapterPosition));
                }
            }
        } else {
            TuxTextView tuxTextView12 = this.LLILZ;
            if (tuxTextView12 != null) {
                C786410Ut5.LLLLZLL(tuxTextView12, 8);
            }
        }
        long jLongValue = 0;
        if (shortDramaOverview.badgeType == BadgeType.HEAT_SCORE) {
            TuxIconView tuxIconView = this.LLILZIL;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(EnumC1578890rBn.ICON_FIRE_3_FILL.id());
            }
            TuxTextView tuxTextView13 = this.LLILZLL;
            if (tuxTextView13 != null) {
                Long l = shortDramaOverview.heatScore;
                if (l != null) {
                    jLongValue = l.longValue();
                }
                tuxTextView13.setText(C19350310n7.LIZ(jLongValue));
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LLILZIL;
        if (tuxIconView2 != null) {
            tuxIconView2.setIconRes(EnumC1578890rBn.ICON_PLAY_FILL.id());
        }
        TuxTextView tuxTextView14 = this.LLILZLL;
        if (tuxTextView14 == null) {
            return;
        }
        Long l2 = shortDramaOverview.numWatched;
        if (l2 != null) {
            jLongValue = l2.longValue();
        }
        tuxTextView14.setText(C19350310n7.LIZ(jLongValue));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f5_, viewGroup, false);
    }
}
