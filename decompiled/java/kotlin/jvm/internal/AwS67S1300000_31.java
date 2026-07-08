package kotlin.jvm.internal;

import X.C09AY;
import X.C118300cf;
import X.C13LP;
import X.C1400640mYI;
import X.C1697810uHb;
import X.C20511415Nw;
import X.C20519815Rc;
import X.C20600815jK;
import X.C259800zU;
import X.C747202vu;
import X.C936903lP;
import X.C993640bxq;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.text.SeaSkuTextSpecCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.text.SeaSkuThreeRowExpandableFlowLayoutManager;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes32.dex */
public class AwS67S1300000_31 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS67S1300000_31 awS67S1300000_31, Object obj) {
        RecyclerView.LayoutManager layoutManager;
        C20600815jK<InterfaceC1891350zJl> state;
        String str;
        SeaSkuThreeRowExpandableFlowLayoutManager seaSkuThreeRowExpandableFlowLayoutManager;
        List<String> list = ((C936903lP) obj).LL;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(((C747202vu) awS67S1300000_31.l1).LLILZLL, list);
        boolean zLJFF = Intrinsics.LJFF(((HashMap) ((SeaSkuTextSpecCell) awS67S1300000_31.l2).T5().LLIZ).get(awS67S1300000_31.s0), Boolean.TRUE);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((SeaSkuTextSpecCell) awS67S1300000_31.l2).LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
        } else {
            layoutManager = null;
        }
        if ((layoutManager instanceof SeaSkuThreeRowExpandableFlowLayoutManager) && (seaSkuThreeRowExpandableFlowLayoutManager = (SeaSkuThreeRowExpandableFlowLayoutManager) layoutManager) != null) {
            seaSkuThreeRowExpandableFlowLayoutManager.LLILLL = zLJFF;
        }
        List list2 = (List) awS67S1300000_31.l3;
        C747202vu c747202vu = (C747202vu) awS67S1300000_31.l1;
        SeaSkuTextSpecCell seaSkuTextSpecCell = (SeaSkuTextSpecCell) awS67S1300000_31.l2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i >= 0) {
                SalePropValue salePropValue = (SalePropValue) obj2;
                String str2 = salePropValue.propValueId;
                if (str2 != null && (str = salePropValue.propValue) != null) {
                    arrayList.add(new C20511415Nw(c747202vu.LLILZLL, i, seaSkuTextSpecCell.T5().LL, str2, str, salePropValue.salePropTag, seaSkuTextSpecCell.T5().BQ2(c747202vu.LLILZLL, str2, list), Intrinsics.LJFF(objLJJJLZIJ, str2), seaSkuTextSpecCell.LLJJI));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = ((SeaSkuTextSpecCell) awS67S1300000_31.l2).LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
            state.LJIILL(C13LP.LJLILLLLZI(new C993640bxq(awS67S1300000_31.s0, zLJFF, ((SeaSkuTextSpecCell) awS67S1300000_31.l2).T5().LL), arrayList), null);
            return Unit.LIZ;
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS67S1300000_31 awS67S1300000_31, Object obj) {
        Runnable runnable = (Runnable) ((C259800zU) awS67S1300000_31.l1).element;
        if (runnable != null) {
            runnable.run();
        }
        ((NetworkStandardUIServiceImpl) awS67S1300000_31.l3).onEvent(((C118300cf) awS67S1300000_31.l2).element, awS67S1300000_31.s0, "accept");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS67S1300000_31 awS67S1300000_31, Object obj) throws JSONException {
        ((C20519815Rc) awS67S1300000_31.l1).LJJIJIIJIL((AVMusic) awS67S1300000_31.l2, awS67S1300000_31.s0, (String) obj, (Boolean) awS67S1300000_31.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063 A[PHI: r0
      0x0063: PHI (r0v10 int) = (r0v9 int), (r0v11 int) binds: [B:17:0x0072, B:11:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS67S1300000_31 r14, java.lang.Object r15) {
        /*
            com.ss.android.ugc.aweme.services.AsyncAVService r15 = (com.ss.android.ugc.aweme.services.AsyncAVService) r15
            java.lang.Object r0 = r14.l1
            X.0mYI r0 = (X.C1400640mYI) r0
            android.app.Activity r9 = r0.LL
            if (r9 == 0) goto L6d
            com.ss.android.ugc.aweme.services.external.IUIService r4 = r15.uiService()
            com.ss.android.ugc.aweme.composer.CreationComposerDsl r3 = new com.ss.android.ugc.aweme.composer.CreationComposerDsl
            r3.<init>()
            java.lang.String r2 = r14.s0
            java.lang.Object r7 = r14.l2
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r7 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r7
            java.lang.Object r8 = r14.l1
            X.0mYI r8 = (X.C1400640mYI) r8
            java.lang.Object r6 = r14.l3
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = (com.ss.android.ugc.aweme.base.model.UrlModel) r6
            kotlin.jvm.internal.AwS610S0100000_31 r1 = new kotlin.jvm.internal.AwS610S0100000_31
            r0 = 571(0x23b, float:8.0E-43)
            r1.<init>(r8, r0)
            r3.basic(r1)
            kotlin.jvm.internal.AwS117S0400000_21 r5 = new kotlin.jvm.internal.AwS117S0400000_21
            r10 = 19
            r5.<init>(r6, r7, r8, r9, r10)
            r3.musicShareStory(r5)
            kotlin.jvm.internal.AwS387S0200000_21 r1 = new kotlin.jvm.internal.AwS387S0200000_21
            r0 = 111(0x6f, float:1.56E-43)
            r1.<init>(r8, r9, r0)
            r3.callback(r1)
            com.ss.android.ugc.aweme.composer.model.MusicComposerModel r6 = new com.ss.android.ugc.aweme.composer.model.MusicComposerModel
            java.lang.Class<com.ss.android.ugc.aweme.services.music.IMusicBridgeService> r10 = com.ss.android.ugc.aweme.services.music.IMusicBridgeService.class
            r11 = 0
            r5 = 0
            r14 = 14
            r15 = 0
            r12 = r11
            r13 = r11
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r10, r11, r12, r13, r14, r15)
            com.ss.android.ugc.aweme.services.music.IMusicBridgeService r0 = (com.ss.android.ugc.aweme.services.music.IMusicBridgeService) r0
            if (r0 == 0) goto L75
            boolean r1 = r0.enableMusicEndTimeOnShoot()
            r0 = 1
            if (r1 != r0) goto L75
        L59:
            int r1 = r7.getDuration()
            if (r0 == 0) goto L70
            r0 = 30000(0x7530, float:4.2039E-41)
            if (r1 <= r0) goto L64
        L63:
            r1 = r0
        L64:
            r6.<init>(r2, r5, r1, r7)
            r3.setMusic(r6)
            r4.startCreation(r9, r3)
        L6d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L70:
            r0 = 3000(0xbb8, float:4.204E-42)
            if (r1 <= r0) goto L64
            goto L63
        L75:
            r0 = 0
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS67S1300000_31.invoke$3(kotlin.jvm.internal.AwS67S1300000_31, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS67S1300000_31(C259800zU c259800zU, C259800zU<Runnable> c259800zU2, NetworkStandardUIServiceImpl networkStandardUIServiceImpl, C118300cf c118300cf, String str) {
        super(1);
        this.$t = str;
        this.l1 = c259800zU;
        this.l3 = c259800zU2;
        this.l2 = networkStandardUIServiceImpl;
        this.s0 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS67S1300000_31(C747202vu c747202vu, C747202vu c747202vu2, SeaSkuTextSpecCell seaSkuTextSpecCell, String str, List<SalePropValue> list) {
        super(1);
        this.$t = list;
        this.l1 = c747202vu;
        this.l2 = c747202vu2;
        this.s0 = seaSkuTextSpecCell;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS67S1300000_31(C1400640mYI c1400640mYI, String str, MusicModel musicModel, UrlModel urlModel, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1400640mYI;
        this.s0 = str;
        this.l2 = musicModel;
        this.l3 = urlModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS67S1300000_31(C20519815Rc c20519815Rc, AVMusic aVMusic, String str, Boolean bool, int i) {
        super(1);
        this.$t = i;
        this.l1 = c20519815Rc;
        this.l2 = aVMusic;
        this.s0 = str;
        this.l3 = bool;
    }
}
