package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C1415860mwq;
import X.C1418960n1q;
import X.C1459630o5R;
import X.C1460620o72;
import X.C1460640o74;
import X.C1464300oCy;
import X.C1464390oD7;
import X.C201955140j;
import X.C2188811AlT;
import X.EnumC543490LTf;
import X.InterfaceC1455610nyx;
import X.InterfaceC1631630sYr;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDraftAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes23.dex */
public class AkS30S0300000_22 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS30S0300000_22 akS30S0300000_22, View view) {
        boolean z;
        Integer numValueOf;
        C1418960n1q c1418960n1q;
        AutoCutThemeData autoCutThemeData;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doClick: pos=");
        sbLIZ.append(((C1418960n1q) akS30S0300000_22.l0).getAbsoluteAdapterPosition());
        sbLIZ.append(", selectedBorder=");
        View view2 = ((C1418960n1q) akS30S0300000_22.l0).LLILZIL;
        boolean z2 = true;
        if (view2 != null && view2.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", theme=");
        AutoCutThemeData autoCutThemeData2 = ((C1418960n1q) akS30S0300000_22.l0).LLJJJJLIIL;
        EnumC543490LTf enumC543490LTf = null;
        if (autoCutThemeData2 != null) {
            numValueOf = Integer.valueOf(autoCutThemeData2.indexFromSource);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", clickable=");
        sbLIZ.append(((View) akS30S0300000_22.l1).isClickable());
        sbLIZ.append(", downloadState=");
        AutoCutThemeData autoCutThemeData3 = ((C1418960n1q) akS30S0300000_22.l0).LLJJJJLIIL;
        if (autoCutThemeData3 != null) {
            enumC543490LTf = autoCutThemeData3.downloadState;
        }
        sbLIZ.append(enumC543490LTf);
        C201955140j.LIZIZ("EditAutoCutScene", C2188811AlT.LIZIZ(sbLIZ));
        if (((C1418960n1q) akS30S0300000_22.l0).getAbsoluteAdapterPosition() == -1) {
            return;
        }
        View view3 = ((C1418960n1q) akS30S0300000_22.l0).LLILZIL;
        if ((view3 == null || view3.getVisibility() != 0) && (autoCutThemeData = (c1418960n1q = (C1418960n1q) akS30S0300000_22.l0).LLJJJJLIIL) != null) {
            InterfaceC1631630sYr interfaceC1631630sYr = (InterfaceC1631630sYr) akS30S0300000_22.l2;
            View view4 = (View) akS30S0300000_22.l1;
            if (autoCutThemeData.downloadState == EnumC543490LTf.COMPLETED) {
                z2 = false;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("doClick: downloadState=");
            sbLIZ2.append(autoCutThemeData.downloadState);
            sbLIZ2.append(", needsDownload=");
            sbLIZ2.append(z2);
            C201955140j.LIZIZ("EditAutoCutScene", C2188811AlT.LIZIZ(sbLIZ2));
            interfaceC1631630sYr.invoke(view4, Integer.valueOf(c1418960n1q.getAbsoluteAdapterPosition()), autoCutThemeData, Boolean.valueOf(z2));
        }
    }

    public static final void LIZ$1(AkS30S0300000_22 akS30S0300000_22, View view) {
        C1418960n1q c1418960n1q;
        AutoCutThemeData autoCutThemeData;
        if (((C1418960n1q) akS30S0300000_22.l0).getAbsoluteAdapterPosition() != -1 && (autoCutThemeData = (c1418960n1q = (C1418960n1q) akS30S0300000_22.l0).LLJJJJLIIL) != null) {
            ((InterfaceC1631630sYr) akS30S0300000_22.l1).invoke((View) akS30S0300000_22.l2, Integer.valueOf(c1418960n1q.getAbsoluteAdapterPosition()), autoCutThemeData, Boolean.TRUE);
        }
    }

    public static final void LIZ$10(AkS30S0300000_22 akS30S0300000_22, View view) {
        ((C1460640o74) ((View) akS30S0300000_22.l0)).LIZ(1);
        ((C1464390oD7) akS30S0300000_22.l1).LLLII().Ws(((C1460620o72) akS30S0300000_22.l2).LIZ);
    }

    public static final void LIZ$2(AkS30S0300000_22 akS30S0300000_22, View view) {
        ((C1460640o74) akS30S0300000_22.l0).LIZ(1);
        C1459630o5R c1459630o5R = (C1459630o5R) akS30S0300000_22.l1;
        ((InterfaceC1455610nyx) c1459630o5R.LLJJJIL.getValue(c1459630o5R, C1459630o5R.LLJJJJJIL[3])).Ws(((C1460620o72) akS30S0300000_22.l2).LIZ);
    }

    public static final void LIZ$3(AkS30S0300000_22 akS30S0300000_22, View view) {
        MusicDraftAssem musicDraftAssem = (MusicDraftAssem) akS30S0300000_22.l0;
        int i = ((C1415860mwq) akS30S0300000_22.l1).LIZ;
        musicDraftAssem.getClass();
        MusicDraftAssem.up(i, "body", "draft_box");
        ((MusicDraftAssem) akS30S0300000_22.l0).op(((View) akS30S0300000_22.l2).getContext());
    }

    public static final void LIZ$4(AkS30S0300000_22 akS30S0300000_22, View view) {
        MusicDraftAssem musicDraftAssem = (MusicDraftAssem) akS30S0300000_22.l0;
        int i = ((C1415860mwq) akS30S0300000_22.l1).LIZ;
        musicDraftAssem.getClass();
        MusicDraftAssem.up(i, "edit", "video_edit_page");
        ((MusicDraftAssem) akS30S0300000_22.l0).sp((AwemeDraft) akS30S0300000_22.l2);
    }

    public static final void LIZ$5(AkS30S0300000_22 akS30S0300000_22, View view) {
        MusicDraftAssem musicDraftAssem = (MusicDraftAssem) akS30S0300000_22.l0;
        int i = ((C1415860mwq) akS30S0300000_22.l1).LIZ;
        musicDraftAssem.getClass();
        MusicDraftAssem.up(i, "body", "video_edit_page");
        ((MusicDraftAssem) akS30S0300000_22.l0).sp((AwemeDraft) akS30S0300000_22.l2);
    }

    public static final void LIZ$6(AkS30S0300000_22 akS30S0300000_22, View view) {
        MusicDraftAssem musicDraftAssem = (MusicDraftAssem) akS30S0300000_22.l0;
        int i = ((C1415860mwq) akS30S0300000_22.l1).LIZ;
        musicDraftAssem.getClass();
        MusicDraftAssem.up(i, "edit", "video_edit_page");
        ((MusicDraftAssem) akS30S0300000_22.l0).sp((AwemeDraft) akS30S0300000_22.l2);
    }

    public static final void LIZ$7(AkS30S0300000_22 akS30S0300000_22, View view) {
        MusicDraftAssem musicDraftAssem = (MusicDraftAssem) akS30S0300000_22.l0;
        int i = ((C1415860mwq) akS30S0300000_22.l1).LIZ;
        musicDraftAssem.getClass();
        MusicDraftAssem.up(i, "body", "draft_box");
        ((MusicDraftAssem) akS30S0300000_22.l0).op(((View) akS30S0300000_22.l2).getContext());
    }

    public static final void LIZ$8(AkS30S0300000_22 akS30S0300000_22, View view) {
        MusicDraftAssem musicDraftAssem = (MusicDraftAssem) akS30S0300000_22.l0;
        int i = ((C1415860mwq) akS30S0300000_22.l1).LIZ;
        musicDraftAssem.getClass();
        MusicDraftAssem.up(i, "edit", "video_edit_page");
        ((MusicDraftAssem) akS30S0300000_22.l0).op(((FrameLayout) akS30S0300000_22.l2).getContext());
    }

    public static final void LIZ$9(AkS30S0300000_22 akS30S0300000_22, View view) {
        ((C1460640o74) ((View) akS30S0300000_22.l0)).LIZ(1);
        ((C1464300oCy) akS30S0300000_22.l1).LLLII().Ws(((C1460620o72) akS30S0300000_22.l2).LIZ);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AkS30S0300000_22(android.view.View r2, X.C1418960n1q r3, X.InterfaceC1631630sYr r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS30S0300000_22.<init>(android.view.View, X.0n1q, X.0sYr, int):void");
    }

    public AkS30S0300000_22(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
