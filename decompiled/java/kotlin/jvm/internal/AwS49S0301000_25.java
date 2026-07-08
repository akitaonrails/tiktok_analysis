package kotlin.jvm.internal;

import X.AbstractC1335900krs;
import X.AbstractC1683310tuD;
import X.AbstractC1686530tzP;
import X.AbstractC1688180u24;
import X.AbstractC1689250u3n;
import X.C03IT;
import X.C05UN;
import X.C09AY;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1338340kvo;
import X.C13LP;
import X.C1684220tvg;
import X.C1684290tvn;
import X.C1684300tvo;
import X.C1684310tvp;
import X.C1688050u1r;
import X.C1688120u1y;
import X.C1689240u3m;
import X.C1689430u45;
import X.C1689480u4A;
import X.C1691980u8C;
import X.C1692150u8T;
import X.C2097608Jq;
import X.C259800zU;
import X.EnumC1338240kve;
import X.EnumC1671200tag;
import X.EnumC1684030tvN;
import X.InterfaceC1689940u4u;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.ImNotificationViewModel;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS49S0301000_25 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS49S0301000_25 awS49S0301000_25, Object obj) {
        ImNotificationViewModel imNotificationViewModel = (ImNotificationViewModel) awS49S0301000_25.l0;
        PushItem pushItem = (PushItem) awS49S0301000_25.l1;
        C259800zU c259800zU = (C259800zU) awS49S0301000_25.l2;
        int i = awS49S0301000_25.i3;
        List<AbstractC1689250u3n> list = ((C1689240u3m) obj).LL;
        ArrayList arrayList = new ArrayList();
        for (AbstractC1689250u3n abstractC1689250u3n : list) {
            if (abstractC1689250u3n instanceof C1689430u45) {
                C1689430u45 c1689430u45 = (C1689430u45) abstractC1689250u3n;
                if (Intrinsics.LJFF(c1689430u45.LIZJ, pushItem.itemId)) {
                    arrayList.add(C1689480u4A.LIZ(pushItem, c1689430u45.LJFF, new AwS426S0200000_25((List) arrayList, (List<AbstractC1689250u3n>) pushItem, (PushItem) 37), i, (Integer) c259800zU.element));
                }
            }
            imNotificationViewModel.getClass();
            arrayList.add(ImNotificationViewModel.zQ2(arrayList, abstractC1689250u3n));
        }
        return new C1689240u3m(arrayList);
    }

    public static final Object invoke$1(AwS49S0301000_25 awS49S0301000_25, Object obj) {
        SmartImageView smartImageView = (SmartImageView) obj;
        List<String> list = ((TakoContentPreviewItem.Image) ((TakoContentPreviewItem) awS49S0301000_25.l0)).imageUrls;
        if (!Intrinsics.LJFF(smartImageView.getTag(), list)) {
            smartImageView.setTag(list);
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(list));
            c1331670kl3LJIIJ.LJJIJL(smartImageView.getContext());
            c1331670kl3LJIIJ.LJJ = EnumC1338240kve.FIT_CENTER;
            Map mapLJ = C2097608Jq.LJ();
            String str = (String) C13LP.LJJJLL(list);
            if (str == null) {
                str = "";
            }
            c1331670kl3LJIIJ.LJJJIL = new C1338340kvo(smartImageView, "tako_content_preview_image", str, mapLJ);
            c1331670kl3LJIIJ.LJJ(smartImageView);
            final Map map = (Map) awS49S0301000_25.l1;
            final TakoContentPreviewItem takoContentPreviewItem = (TakoContentPreviewItem) awS49S0301000_25.l0;
            final C05UN c05un = (C05UN) awS49S0301000_25.l2;
            final int i = awS49S0301000_25.i3;
            c1331670kl3LJIIJ.LJIIJ(new AbstractC1335900krs() { // from class: X.0tod
                @Override // X.InterfaceC427850Gq7
                public final void cm(Uri uri, View view, Throwable th) {
                    if (view != null) {
                        view.setTag(null);
                    }
                }

                @Override // X.InterfaceC427850Gq7
                public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                    if (c428600GrK != null) {
                        int i2 = c428600GrK.LIZ;
                        int i3 = c428600GrK.LIZIZ;
                        if (i2 > 0 && i3 > 0) {
                            map.put(((TakoContentPreviewItem.Image) takoContentPreviewItem).itemUUID, new C1680770tq7((((long) Float.floatToRawIntBits(i3)) & 4294967295L) | (Float.floatToRawIntBits(i2) << 32)));
                            TakoContentPreviewItem.Image image = (TakoContentPreviewItem.Image) takoContentPreviewItem;
                            if (image.imageWidth != i2 || image.imageHeight != i3) {
                                ArrayList arrayList = new ArrayList(c05un.LIZLLL().LL);
                                TakoContentPreviewItem takoContentPreviewItem2 = (TakoContentPreviewItem) C13LP.LJJJLZIJ(i, arrayList);
                                if (takoContentPreviewItem2 instanceof TakoContentPreviewItem.Image) {
                                    TakoContentPreviewItem.Image image2 = (TakoContentPreviewItem.Image) takoContentPreviewItem2;
                                    ListProtector.set(arrayList, i, new TakoContentPreviewItem.Image(i2, i3, image2.itemUUID, image2.imageUrls));
                                    C05UN c05un2 = c05un;
                                    C1679860toe c1679860toeLIZLLL = c05un2.LIZLLL();
                                    ((C13FE) c05un2.LIZIZ).setValue(new C1679860toe(arrayList, c1679860toeLIZLLL.LLILLJJLI, c1679860toeLIZLLL.LLILLL, c1679860toeLIZLLL.LLILZ, c1679860toeLIZLLL.LLILZIL, c1679860toeLIZLLL.LLILZLL, c1679860toeLIZLLL.LLIZ, c1679860toeLIZLLL.LLIZLLLIL, c1679860toeLIZLLL.LLJ));
                                }
                            }
                            C05UN c05un3 = c05un;
                            ((C13FG) c05un3.LJIIIIZZ).LJIIJ(((C13FG) c05un3.LJIIIIZZ).LIZLLL() + 1);
                        }
                    }
                }
            });
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS49S0301000_25 awS49S0301000_25, Object obj) {
        C1688050u1r c1688050u1r;
        int iLIZ;
        AbstractC1688180u24 abstractC1688180u24;
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        AbstractC1686530tzP[] abstractC1686530tzPArr = (AbstractC1686530tzP[]) awS49S0301000_25.l0;
        C1688120u1y c1688120u1y = (C1688120u1y) awS49S0301000_25.l1;
        int i = awS49S0301000_25.i3;
        int[] iArr = (int[]) awS49S0301000_25.l2;
        int length = abstractC1686530tzPArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            AbstractC1686530tzP abstractC1686530tzP = abstractC1686530tzPArr[i2];
            int i4 = i3 + 1;
            Object objLJJJ = abstractC1686530tzP.LJJJ();
            if (objLJJJ instanceof C1688050u1r) {
                c1688050u1r = (C1688050u1r) objLJJJ;
            } else {
                c1688050u1r = null;
            }
            c1688120u1y.getClass();
            if (c1688050u1r != null && (abstractC1688180u24 = c1688050u1r.LIZJ) != null) {
                iLIZ = abstractC1688180u24.LIZ(i - abstractC1686530tzP.LLILLJJLI, EnumC1671200tag.Ltr);
            } else {
                iLIZ = c1688120u1y.LIZIZ.LIZ(0, i - abstractC1686530tzP.LLILLJJLI);
            }
            abstractC1683310tuD.LIZLLL(abstractC1686530tzP, iArr[i3], iLIZ, 0.0f);
            i2++;
            i3 = i4;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS49S0301000_25 awS49S0301000_25, Object obj) {
        C1692150u8T c1692150u8T;
        boolean z;
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        InterfaceC1689940u4u interfaceC1689940u4u = (InterfaceC1689940u4u) awS49S0301000_25.l0;
        C1684290tvn c1684290tvn = (C1684290tvn) awS49S0301000_25.l1;
        int i = c1684290tvn.LIZJ;
        C1684310tvp c1684310tvp = c1684290tvn.LIZLLL;
        C1691980u8C c1691980u8CInvoke = c1684290tvn.LJ.invoke();
        if (c1691980u8CInvoke != null) {
            c1692150u8T = c1691980u8CInvoke.LIZ;
        } else {
            c1692150u8T = null;
        }
        if (((InterfaceC1689940u4u) awS49S0301000_25.l0).getLayoutDirection() == EnumC1671200tag.Rtl) {
            z = true;
        } else {
            z = false;
        }
        ((C1684290tvn) awS49S0301000_25.l1).LIZIZ.LIZIZ(EnumC1684030tvN.Horizontal, C1684220tvg.LIZ(interfaceC1689940u4u, i, c1684310tvp, c1692150u8T, z, ((AbstractC1686530tzP) awS49S0301000_25.l2).LL), awS49S0301000_25.i3, ((AbstractC1686530tzP) awS49S0301000_25.l2).LL);
        AbstractC1683310tuD.LJFF(abstractC1683310tuD, (AbstractC1686530tzP) awS49S0301000_25.l2, Math.round(-((C1684290tvn) awS49S0301000_25.l1).LIZIZ.LIZ()), 0);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS49S0301000_25 awS49S0301000_25, Object obj) {
        C1692150u8T c1692150u8T;
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        InterfaceC1689940u4u interfaceC1689940u4u = (InterfaceC1689940u4u) awS49S0301000_25.l0;
        C1684300tvo c1684300tvo = (C1684300tvo) awS49S0301000_25.l1;
        int i = c1684300tvo.LIZJ;
        C1684310tvp c1684310tvp = c1684300tvo.LIZLLL;
        C1691980u8C c1691980u8CInvoke = c1684300tvo.LJ.invoke();
        if (c1691980u8CInvoke != null) {
            c1692150u8T = c1691980u8CInvoke.LIZ;
        } else {
            c1692150u8T = null;
        }
        ((C1684300tvo) awS49S0301000_25.l1).LIZIZ.LIZIZ(EnumC1684030tvN.Vertical, C1684220tvg.LIZ(interfaceC1689940u4u, i, c1684310tvp, c1692150u8T, false, ((AbstractC1686530tzP) awS49S0301000_25.l2).LL), awS49S0301000_25.i3, ((AbstractC1686530tzP) awS49S0301000_25.l2).LLILLJJLI);
        AbstractC1683310tuD.LJFF(abstractC1683310tuD, (AbstractC1686530tzP) awS49S0301000_25.l2, 0, Math.round(-((C1684300tvo) awS49S0301000_25.l1).LIZIZ.LIZ()));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S0301000_25(int i, TakoContentPreviewItem takoContentPreviewItem, C05UN c05un, Map map, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = takoContentPreviewItem;
        this.l1 = map;
        this.l2 = c05un;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S0301000_25(InterfaceC1689940u4u interfaceC1689940u4u, C1684290tvn c1684290tvn, AbstractC1686530tzP abstractC1686530tzP, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = interfaceC1689940u4u;
        this.l1 = c1684290tvn;
        this.l2 = abstractC1686530tzP;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S0301000_25(InterfaceC1689940u4u interfaceC1689940u4u, C1684300tvo c1684300tvo, AbstractC1686530tzP abstractC1686530tzP, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = interfaceC1689940u4u;
        this.l1 = c1684300tvo;
        this.l2 = abstractC1686530tzP;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS49S0301000_25(ImNotificationViewModel imNotificationViewModel, ImNotificationViewModel imNotificationViewModel2, PushItem pushItem, C259800zU<Integer> c259800zU, int i) {
        super(1);
        this.$t = i;
        this.l0 = imNotificationViewModel;
        this.l1 = imNotificationViewModel2;
        this.l2 = pushItem;
        this.i3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S0301000_25(AbstractC1686530tzP[] abstractC1686530tzPArr, C1688120u1y c1688120u1y, int i, int[] iArr, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = abstractC1686530tzPArr;
        this.l1 = c1688120u1y;
        this.i3 = i;
        this.l2 = iArr;
    }
}
