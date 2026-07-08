package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.C09RD;
import X.C09RE;
import X.C1261640iw6;
import X.C1261650iw7;
import X.C1261860iwS;
import X.C1262090iwp;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LP;
import X.C2188811AlT;
import X.C338480DOs;
import X.C418440Gaw;
import X.C426500Gnw;
import X.C426750GoL;
import X.C438710HIf;
import X.C447550Hgn;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1262370ixH;
import X.EnumC714850S2h;
import Y.ACListenerS73S0300000_6;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS116S0400000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class RectRecUserVideoCell extends RectRecUserCell<C1261650iw7> {
    public final int LLJJIII = R.layout.elg;
    public C426500Gnw LLJJIJI;

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRecUserCell, X.InterfaceC1508640pMU
    public final String T() {
        return "RectRecUserVideoCell";
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRecUserCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLJJIJI = (C426500Gnw) this.itemView.findViewById(R.id.video_cover_list);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRecUserCell, com.ss.android.ugc.aweme.relation.usercard.impl.cell.BaseRectRecUserCell, com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final int a6() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    /* JADX INFO: renamed from: d6 */
    public final void onBindItemView(C1261650iw7 c1261650iw7) {
        List<? extends Aweme> list;
        Video video;
        UrlModel cover;
        super.onBindItemView(c1261650iw7);
        LifecycleOwner lifecycleOwner = getLifecycleOwner();
        if (lifecycleOwner != null) {
            C1261860iwS c1261860iwS = c1261650iw7.LLILZIL;
            MatchedFriendStruct matchedFriendStruct = c1261860iwS.getMatchedFriendStruct();
            if (matchedFriendStruct != null && (list = matchedFriendStruct.awemeList) != null && !list.isEmpty()) {
                C426500Gnw c426500Gnw = this.LLJJIJI;
                if (c426500Gnw == null) {
                    c426500Gnw = null;
                }
                C786410Ut5.LJLLLLLL(0, c426500Gnw);
                C1261860iwS c1261860iwS2 = c1261650iw7.LLILZIL;
                c426500Gnw.setAllLoadCompleteListener(new AwS563S0100000_19(c1261650iw7, 3190));
                C1261640iw6 c1261640iw6 = new C1261640iw6(c1261650iw7.LLILZIL, list, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(112)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C418440Gaw.LIZIZ(2));
                int childCount = c426500Gnw.getChildCount();
                ((LinkedHashMap) c426500Gnw.LLILLL).clear();
                int i = 0;
                do {
                    SmartImageView smartImageView = (SmartImageView) c426500Gnw.getChildAt(i);
                    Aweme aweme = (Aweme) C13LP.LJJJLZIJ(i, list);
                    if (aweme != null && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null) {
                        c426500Gnw.LLILLL.put(smartImageView, Boolean.FALSE);
                        float f = c1261640iw6.LIZLLL;
                        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
                        c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                        c1331670kl3LJIIIIZZ.LIZLLL("user_video_cover");
                        C1331750klB c1331750klB = new C1331750klB();
                        c1331750klB.LJ = f;
                        c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
                        c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.SMALL;
                        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                        C786410Ut5.LJLLLLLL(0, smartImageView);
                        C786410Ut5.Q8(smartImageView, new ACListenerS73S0300000_6(c426500Gnw, smartImageView, aweme, 5));
                    } else {
                        C786410Ut5.LJLLLLLL(4, smartImageView);
                        C786410Ut5.I7(null, smartImageView);
                    }
                    if (i != 0) {
                        C426750GoL.LJIIIZ(smartImageView, Integer.valueOf(c1261640iw6.LIZJ), null, null, null, false, 30);
                    }
                    C447550Hgn.LJFF(smartImageView, Integer.valueOf(c1261640iw6.LIZIZ), Integer.valueOf(c1261640iw6.LIZIZ));
                    i++;
                } while (i < 3);
                if (childCount > list.size()) {
                    for (int size = list.size(); size < childCount; size++) {
                        View childAt = c426500Gnw.getChildAt(size);
                        C786410Ut5.LJLLLLLL(4, childAt);
                        C786410Ut5.I7(null, childAt);
                    }
                }
                Iterator<View> it2 = new C09RD(c426500Gnw).iterator();
                while (true) {
                    C09RE c09re = (C09RE) it2;
                    if (c09re.hasNext()) {
                        if (((View) c09re.next()).getVisibility() == 0) {
                            C426750GoL.LJIIL(c426500Gnw, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 21);
                            break;
                        }
                    } else {
                        C426750GoL.LJIIL(c426500Gnw, 0, 0, 0, 0, 16);
                        Iterator<View> it3 = new C09RD(c426500Gnw).iterator();
                        while (true) {
                            C09RE c09re2 = (C09RE) it3;
                            if (!c09re2.hasNext()) {
                                break;
                            } else {
                                C786410Ut5.LJLLLLLL(8, (View) c09re2.next());
                            }
                        }
                    }
                }
                c426500Gnw.setOnItemClickListener(new AwS116S0400000_19(this, c426500Gnw, c1261860iwS2, c1261650iw7, 6));
                C338480DOs.LIZIZ(lifecycleOwner, c1261860iwS, EnumC1262370ixH.FIND_FRIENDS).EQ2(list);
                return;
            }
            C426500Gnw c426500Gnw2 = null;
            C426500Gnw c426500Gnw3 = this.LLJJIJI;
            if (c426500Gnw3 != null) {
                c426500Gnw2 = c426500Gnw3;
            }
            C786410Ut5.LJLLLLLL(8, c426500Gnw2);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRecUserCell, com.ss.android.ugc.aweme.relation.usercard.impl.cell.BaseRectRecUserCell, com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void S6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        C1262090iwp c1262090iwp2;
        int i;
        if (c1262090iwp.LIZ == 102) {
            if (V6(c1261860iwS, c1262090iwp)) {
                c1262090iwp2 = c1262090iwp;
            } else {
                c1262090iwp2 = null;
            }
            if (c1262090iwp2 != null) {
                i = 12;
            } else {
                i = 16;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
            C447550Hgn.LJFF(this.itemView.findViewById(R.id.vzi), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null);
            C447550Hgn.LJFF(this.itemView.findViewById(R.id.h52), Integer.valueOf(iLIZIZ), null);
            View viewFindViewById = this.itemView.findViewById(R.id.pbw);
            int i2 = c1262090iwp.LJIILIIL;
            C426750GoL.LJIIIZ(viewFindViewById, 0, Integer.valueOf(i2), 0, Integer.valueOf(i2), false, 16);
            C426750GoL.LJIIIZ(this.itemView.findViewById(R.id.obu), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, false, 26);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("not supported current variant: ");
        sbLIZ.append(c1262090iwp.LIZ);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
