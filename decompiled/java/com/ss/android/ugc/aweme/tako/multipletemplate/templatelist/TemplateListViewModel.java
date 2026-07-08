package com.ss.android.ugc.aweme.tako.multipletemplate.templatelist;

import X.C07EK;
import X.C0L9F;
import X.C13BV;
import X.C15438062q;
import X.C1852730yJT;
import X.C1853010yJv;
import X.C1853320yKQ;
import X.C20188913z5;
import X.EnumC1154120g8g;
import X.InterfaceC0148002o;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS133S0101000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TemplateListViewModel extends AssemViewModel<C1853320yKQ> {
    public String LLILLJJLI;
    public C1853010yJv LLILLL;
    public boolean LLILZIL;
    public final List<TikTokMediaModel> LL = new ArrayList();
    public List<String> LLILZ = C13BV.INSTANCE;
    public EnumC1154120g8g LLILZLL = EnumC1154120g8g.OTHERS;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1853320yKQ(9, 1535);
    }

    public final boolean xQ2() {
        return this.LLILZLL == EnumC1154120g8g.TAKO_TEMPLATE_ACTIVITY;
    }

    public final void vQ2(int i) {
        if (!C07EK.LIZ()) {
            return;
        }
        withState(new AwS133S0101000_27(i, this, 2));
    }

    public static List wQ2(Context context, List list) {
        String str;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (TikTokMediaModel tikTokMediaModel : (ArrayList) list) {
                String strLJFF = tikTokMediaModel.LJFF();
                C1852730yJT c1852730yJTLIZIZ = C20188913z5.LIZIZ(context, strLJFF);
                int i = (int) c1852730yJTLIZIZ.LIZLLL;
                int i2 = (int) c1852730yJTLIZIZ.LIZJ;
                if (tikTokMediaModel.loadSource == C0L9F.CAMERA) {
                    str = "shoot";
                } else {
                    str = "album";
                }
                arrayList.add(new BaseImage(null, null, null, null, i, i2, strLJFF, null, null, null, null, str, null, null, null, 0, 0, null, 259983, null));
            }
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2(java.lang.String r23, X.C1853460yKe r24) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.multipletemplate.templatelist.TemplateListViewModel.yQ2(java.lang.String, X.0yKe):void");
    }
}
