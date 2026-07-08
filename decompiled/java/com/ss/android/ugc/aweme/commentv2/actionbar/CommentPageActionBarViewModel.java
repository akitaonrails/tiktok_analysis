package com.ss.android.ugc.aweme.commentv2.actionbar;

import X.C01GW;
import X.C13IQ;
import X.C13LE;
import X.C1697810uHb;
import X.C452501pT;
import X.InterfaceC1344590l5t;
import X.InterfaceC1349750lED;
import X.InterfaceC665370Q7z;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commentv2.panel.CommentListPanelV2Provider;
import com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol;
import com.ss.android.ugc.aweme.commentv2.panel.LikePanelProviderV2;
import com.ss.android.ugc.aweme.commentv2.panel.MixViewerPanelProviderV2;
import com.ss.android.ugc.aweme.commentv2.panel.ViewerPanelProviderV2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPageActionBarViewModel implements ICommentPageActionBarVMAbility {
    public InterfaceC665370Q7z LL;
    public int LLILLJJLI;
    public final List<C13IQ<? extends IPanelProviderProtocol>> LLILLL = C1697810uHb.LJIIJJI(C13LE.LIZ(CommentListPanelV2Provider.class), C13LE.LIZ(LikePanelProviderV2.class), C13LE.LIZ(ViewerPanelProviderV2.class), C13LE.LIZ(MixViewerPanelProviderV2.class));
    public final int LLILZ = 4;
    public final List<InterfaceC1349750lED> LLILZIL = new ArrayList();
    public final List<InterfaceC1344590l5t> LLILZLL = new ArrayList();
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 271));

    @Override // com.ss.android.ugc.aweme.commentv2.actionbar.ICommentPageActionBarVMAbility
    public final int lj1() {
        return this.LLILLJJLI;
    }

    public static void LIZ(int i, List list) {
        Integer numDJ;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ListProtector.get(arrayList, i2);
            if (obj instanceof InterfaceC1349750lED) {
                if (((InterfaceC1349750lED) obj).Rc() == i) {
                    ListProtector.remove(arrayList, i2);
                    return;
                }
            } else if ((obj instanceof InterfaceC1344590l5t) && (numDJ = ((InterfaceC1344590l5t) obj).DJ()) != null && numDJ.intValue() == i) {
                ListProtector.remove(arrayList, i2);
                return;
            }
        }
    }
}
