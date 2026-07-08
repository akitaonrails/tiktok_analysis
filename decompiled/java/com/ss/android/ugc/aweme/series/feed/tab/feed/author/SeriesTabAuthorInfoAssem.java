package com.ss.android.ugc.aweme.series.feed.tab.feed.author;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C098200Yq;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1578770rBb;
import X.C1697810uHb;
import X.C189200o6;
import X.C2188811AlT;
import X.C292600BdS;
import X.C337180DJs;
import X.C418440Gaw;
import X.C438710HIf;
import X.C708910RrN;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes12.dex */
public class SeriesTabAuthorInfoAssem extends BaseCellSlotComponent<SeriesTabAuthorInfoAssem> {
    public VideoItemParams LLJLLIL;
    public SmartImageView LLJLLL;
    public TuxTextView LLJZ;
    public TuxTextView LLJZIJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        String str = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType;
        if (!Intrinsics.LJFF(str, "homepage_hot") && !Intrinsics.LJFF(str, "homepage_series")) {
            str = "others";
        }
        return ((List) C292600BdS.LIZ.getValue()).contains(str) ? R.layout.f5e : R.layout.f5d;
    }

    public static CharSequence Bp(List list) {
        if (list == null) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                String strLIZIZ = (String) obj;
                if (i != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(", ");
                    sbLIZ.append(strLIZIZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                spannableStringBuilder.append((CharSequence) strLIZIZ);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return spannableStringBuilder;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ep, reason: merged with bridge method [inline-methods] */
    public void up(VideoItemParams videoItemParams) {
        UrlModel coverUrl;
        try {
            this.LLJLLIL = videoItemParams;
            PaidContentInfo paidContentInfo = videoItemParams.getAweme().mPaidContentInfo;
            if (paidContentInfo == null) {
                return;
            }
            SmartImageView smartImageView = this.LLJLLL;
            if (smartImageView != null && (coverUrl = paidContentInfo.getCoverUrl()) != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(coverUrl));
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZIZ;
                c1331670kl3LJIIIIZZ.LJIIIZ = iLIZIZ2;
                c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
            TuxTextView tuxTextView = this.LLJZ;
            if (tuxTextView != null) {
                tuxTextView.setText(paidContentInfo.getCollectionName());
            }
            TuxTextView tuxTextView2 = this.LLJZIJLIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColor(C1578770rBb.LIZIZ(tuxTextView2.getContext(), R.attr.a0w));
                CharSequence charSequenceBp = Bp(paidContentInfo.getCollectionCategoryTags());
                tuxTextView2.setText(charSequenceBp);
                if (a0.LJJJIL(charSequenceBp)) {
                    C337180DJs.LIZ(tuxTextView2);
                } else {
                    C337180DJs.LIZJ(tuxTextView2);
                }
            } else {
                tuxTextView2 = null;
            }
            C189200o6.m2constructorimpl(tuxTextView2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(final View view) {
        super.onViewCreated(view);
        this.LLJLLL = (SmartImageView) view.findViewById(R.id.kgf);
        this.LLJZ = (TuxTextView) view.findViewById(R.id.zwv);
        this.LLJZIJLIL = (TuxTextView) view.findViewById(R.id.tv_sub_title);
        final C708910RrN c708910RrN = (C708910RrN) view.findViewById(R.id.usn);
        if (c708910RrN != null) {
            c708910RrN.setGroupClickable(false);
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV(view, c708910RrN) { // from class: X.0SGY
                public final /* synthetic */ View LLILZIL;

                /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
                @Override // X.AbstractViewOnClickListenerC1637610siV
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(android.view.View r30) throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 952
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0SGY.LIZ(android.view.View):void");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(300L);
                }
            }, c708910RrN);
        }
    }
}
