package com.ss.android.ugc.aweme.tako.multipletemplate.templatelist;

import X.C01D1;
import X.C01GW;
import X.C0DSB;
import X.C13IQ;
import X.C13LE;
import X.C15438062q;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1853010yJv;
import X.C1853460yKe;
import X.C1853610yKt;
import X.C1853650yKx;
import X.C19719912Dl;
import X.C20635115or;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426300Gnc;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplateAsset;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel;
import com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoAITemplates;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes28.dex */
public final class HorizontalTemplateListAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public static final C1853650yKx LLLI;
    public static final C1853650yKx LLLII;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJJIL;
    public int LLJJJJ;
    public C426300Gnc LLJJJJJIL;
    public View LLJJJJLIIL;
    public LinearLayout LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public LinearLayout LLJLIL;
    public final AssemVMLazy LLJLL;
    public final AssemVMLazy LLJLLIL;
    public final C20635115or LLJLLL;
    public final C1559260qg8 LLJZ;
    public final C01GW LLJZIJLIL;
    public int LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public C1853610yKt LLLFFI;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1325));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1329));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1328));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1327));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1330));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1326));
    public int LLJLILLLLZIIL = -1;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HorizontalTemplateListAssem.class, "templateListViewModel", "getTemplateListViewModel()Lcom/ss/android/ugc/aweme/tako/multipletemplate/templatelist/TemplateListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(HorizontalTemplateListAssem.class, "takoPhotoChooseViewModel", "getTakoPhotoChooseViewModel()Lcom/ss/android/ugc/aweme/tako/multipletemplate/gallery/TakoPhotoChooseViewModel;", 0)};
        LLLI = new C1853650yKx(0, 0, 0, 0, 31);
        LLLII = new C1853650yKx(18, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), 6, 16, 2);
    }

    public HorizontalTemplateListAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TemplateListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 586), AFwS269S0000000_27.get$arr$(265), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoPhotoChooseViewModel.class);
        this.LLJLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 587), AFwS269S0000000_27.get$arr$(266), null, true);
        this.LLJLLL = new C20635115or();
        this.LLJZ = new C1559260qg8(new C723580SZw(this, C1853010yJv.class, null), checkSupervisorPrepared());
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1331));
        this.LLLF = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(187));
        this.LLLFF = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(188));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fom;
    }

    public final C1853010yJv hp() {
        return (C1853010yJv) this.LLJZ.getValue();
    }

    public final TemplateListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFZ;
        return (TemplateListViewModel) assemVMLazy.getValue();
    }

    public final boolean kp() {
        return ((Boolean) this.LLJZIJLIL.getValue()).booleanValue();
    }

    public final void lp(C1853460yKe c1853460yKe) {
        String title = c1853460yKe.getTitle();
        String subtitle = c1853460yKe.getSubtitle();
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            tuxTextView.setText(title);
        }
        TuxTextView tuxTextView2 = this.LLJL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(subtitle);
        }
        if (kp()) {
            if (subtitle.length() == 0) {
                C0DSB.LIZIZ(this.LLJL);
            } else {
                C0DSB.LIZJ(this.LLJL);
            }
        }
    }

    public final void mp(int i) {
        TakoAITemplates takoAITemplates;
        List<CreativeTemplateAsset> list;
        List list2 = (List) this.LLJJI.getValue();
        if (list2 != null && (takoAITemplates = (TakoAITemplates) ListProtector.get(list2, i)) != null && (list = takoAITemplates.assets) != null && (!list.isEmpty())) {
            C0DSB.LIZJ(this.LLJJJJJIL);
            C0DSB.LIZJ(this.LLJJJJLIIL);
            C426300Gnc c426300Gnc = this.LLJJJJJIL;
            if (c426300Gnc != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<CreativeTemplateAsset> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().url);
                }
                c426300Gnc.setImageUrls(arrayList);
                return;
            }
            return;
        }
        C0DSB.LIZIZ(this.LLJJJJJIL);
        C0DSB.LIZIZ(this.LLJJJJLIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0327 A[PHI: r11 r13 r14 r19
      0x0327: PHI (r11v8 java.lang.String) = (r11v7 java.lang.String), (r11v10 java.lang.String) binds: [B:124:0x0323, B:82:0x020b] A[DONT_GENERATE, DONT_INLINE]
      0x0327: PHI (r13v5 java.lang.String) = (r13v4 java.lang.String), (r13v7 java.lang.String) binds: [B:124:0x0323, B:82:0x020b] A[DONT_GENERATE, DONT_INLINE]
      0x0327: PHI (r14v2 java.lang.String) = (r14v1 java.lang.String), (r14v4 java.lang.String) binds: [B:124:0x0323, B:82:0x020b] A[DONT_GENERATE, DONT_INLINE]
      0x0327: PHI (r19v1 int) = (r19v0 int), (r19v3 int) binds: [B:124:0x0323, B:82:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03ae A[PHI: r2
      0x03ae: PHI (r2v3 int) = (r2v2 int), (r2v2 int), (r2v12 int), (r2v12 int) binds: [B:36:0x0145, B:38:0x014b, B:169:0x0440, B:171:0x045e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0271  */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0wBP] */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.0wBP] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r55) {
        /*
            Method dump skipped, instruction units count: 1740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.multipletemplate.templatelist.HorizontalTemplateListAssem.onViewCreated(android.view.View):void");
    }
}
