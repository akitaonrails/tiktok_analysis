package com.ss.android.ugc.aweme.tako.botpage.components.imagelist;

import X.C05UQ;
import X.C07QI;
import X.C0QSJ;
import X.C1331660kl2;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1561230qjJ;
import X.C1602160rnK;
import X.C1683130ttv;
import X.C1697810uHb;
import X.C1856230yP7;
import X.C1856620yPk;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC1856570yPf;
import X.InterfaceC1856630yPl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoMultiImagePreviewNavParam;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewCellProtocol;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS142S1200000_27;
import kotlin.jvm.internal.AwS304S0300000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoImageListNewAssem extends ReusedUISlotAssem<TakoImageListNewAssem> implements InterfaceC712990Rxx<InterfaceC1856630yPl>, TakoContentPreviewCellProtocol, InterfaceC1146704e9 {
    public static final C1856620yPk LLJZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public LinearLayout LLJJLIIIJLLLLLLLZ;
    public final List<C1856230yP7> LLJL = new ArrayList();
    public int LLJLIL;
    public InterfaceC1856630yPl LLJLILLLLZIIL;
    public volatile InterfaceC1856570yPf LLJLL;
    public InterfaceC665370Q7z LLJLLIL;
    public C0QSJ LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoImageListNewAssem.class, "contentPreviewAbility", "getContentPreviewAbility()Lcom/ss/android/ugc/aweme/tako/otherpage/image/detail/assem/TakoContentPreviewAbility;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJZ = new C1856620yPk();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fkr;
    }

    @Override // X.InterfaceC1361305Ul
    public final void W7(String str) {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final LinearLayout sp() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        return linearLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1856570yPf tp() {
        /*
            r4 = this;
            X.0yPf r0 = r4.LLJLL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0yPf r0 = r4.LLJLL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJLLL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJLLIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJLLIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope> r1 = com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJLLL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0yPf> r0 = X.InterfaceC1856570yPf.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0yPf r0 = (X.InterfaceC1856570yPf) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJLL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.imagelist.TakoImageListNewAssem.tp():X.0yPf");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), TakoContentPreviewCellProtocol.class, this);
    }

    public final Map<String, String> getCommonParams() {
        Map<String, String> commonParams;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        return (iTakoContextAbility == null || (commonParams = iTakoContextAbility.getCommonParams()) == null) ? C2097608Jq.LJ() : commonParams;
    }

    @Override // X.InterfaceC1361305Ul
    public final C05UQ Y8(String str) {
        Iterator it2 = ((ArrayList) this.LLJL).iterator();
        while (it2.hasNext()) {
            BaseImage image = ((C1856230yP7) it2.next()).getImage();
            if (image != null && Intrinsics.LJFF(image.imageUuid, str)) {
                if (this.LLJLIL > 1) {
                    return new C05UQ(12.0f, 12.0f, 12.0f, 12.0f);
                }
                return new C05UQ(12.0f, 12.0f, 12.0f, 12.0f);
            }
        }
        return null;
    }

    @Override // X.InterfaceC1361305Ul
    public final C1683130ttv aa(String str) {
        String str2;
        C1856230yP7 c1856230yP7;
        Iterator it2 = ((ArrayList) this.LLJL).iterator();
        do {
            str2 = null;
            if (!it2.hasNext()) {
                return null;
            }
            c1856230yP7 = (C1856230yP7) it2.next();
            BaseImage image = c1856230yP7.getImage();
            if (image != null) {
                str2 = image.imageUuid;
            }
        } while (!Intrinsics.LJFF(str2, str));
        int[] iArr = new int[2];
        c1856230yP7.getLocationOnScreen(iArr);
        return new C1683130ttv(iArr[0], iArr[1], r2 + c1856230yP7.getWidth(), iArr[1] + c1856230yP7.getHeight());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (LinearLayout) view.findViewById(R.id.x9z);
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), TakoContentPreviewCellProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC1856630yPl interfaceC1856630yPl) {
        int size;
        int size2;
        List<BaseImage> imageList;
        BaseImage baseImage;
        int i;
        BaseImage baseImage2;
        LinearLayout linearLayout;
        InterfaceC1856630yPl interfaceC1856630yPl2 = interfaceC1856630yPl;
        List<BaseImage> imageList2 = interfaceC1856630yPl2.getImageList();
        if (imageList2 != null) {
            size = imageList2.size();
        } else {
            size = 0;
        }
        List<ConvertStyleItem> listLIZLLL = interfaceC1856630yPl2.LIZLLL();
        if (listLIZLLL != null) {
            size2 = listLIZLLL.size();
        } else {
            size2 = 0;
        }
        int i2 = size + size2;
        if (this.LLJLIL != i2) {
            this.LLJLIL = i2;
            LinearLayout linearLayout2 = this.LLJJLIIIJLLLLLLLZ;
            if (linearLayout2 != null) {
                C786410Ut5.LJJJJJL(linearLayout2);
            }
            ((ArrayList) this.LLJL).clear();
            int i3 = this.LLJLIL;
            int i4 = 2;
            if (i3 == 4) {
                int i5 = 0;
                do {
                    LinearLayout linearLayout3 = this.LLJJLIIIJLLLLLLLZ;
                    if (linearLayout3 != null) {
                        LinearLayout linearLayoutSp = sp();
                        int i6 = 0;
                        do {
                            C1856230yP7 c1856230yP7 = new C1856230yP7(linearLayoutSp.getContext(), null, 6);
                            ((ArrayList) this.LLJL).add(c1856230yP7);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            if (i6 != 1) {
                                layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                            }
                            linearLayoutSp.addView(c1856230yP7, layoutParams);
                            i6++;
                        } while (i6 < 2);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                        if (i5 == 0) {
                            layoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                        }
                        linearLayout3.addView(linearLayoutSp, layoutParams2);
                    }
                    i5++;
                } while (i5 < 2);
            } else {
                int i7 = i3 / 3;
                int i8 = i3 % 3;
                int i9 = 0;
                while (i9 < i7) {
                    LinearLayout linearLayout4 = this.LLJJLIIIJLLLLLLLZ;
                    if (linearLayout4 != null) {
                        LinearLayout linearLayoutSp2 = sp();
                        int i10 = 0;
                        do {
                            C1856230yP7 c1856230yP72 = new C1856230yP7(linearLayoutSp2.getContext(), null, 6);
                            ((ArrayList) this.LLJL).add(c1856230yP72);
                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                            if (i10 != i4) {
                                layoutParams3.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                            }
                            linearLayoutSp2.addView(c1856230yP72, layoutParams3);
                            i10++;
                            i4 = 2;
                        } while (i10 < 3);
                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                        if (i8 > 0 || i9 != i7 - 1) {
                            layoutParams4.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                        }
                        linearLayout4.addView(linearLayoutSp2, layoutParams4);
                    }
                    i9++;
                    i4 = 2;
                }
                if (i8 > 0 && (linearLayout = this.LLJJLIIIJLLLLLLLZ) != null) {
                    LinearLayout linearLayoutSp3 = sp();
                    int i11 = 0;
                    do {
                        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                        if (i11 != i8 - 1) {
                            layoutParams5.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                        }
                        C1856230yP7 c1856230yP73 = new C1856230yP7(linearLayoutSp3.getContext(), null, 6);
                        ((ArrayList) this.LLJL).add(c1856230yP73);
                        linearLayoutSp3.addView(c1856230yP73, layoutParams5);
                        i11++;
                    } while (i11 < i8);
                    linearLayout.addView(linearLayoutSp3);
                }
            }
        }
        this.LLJLILLLLZIIL = interfaceC1856630yPl2;
        int i12 = this.LLJLIL;
        if (i12 != 0) {
            if (i12 != 1) {
                List<ConvertStyleItem> listLIZLLL2 = interfaceC1856630yPl2.LIZLLL();
                if (listLIZLLL2 != null) {
                    i = 0;
                    for (ConvertStyleItem convertStyleItem : listLIZLLL2) {
                        if (i < ((ArrayList) this.LLJL).size()) {
                            C1856230yP7 c1856230yP74 = (C1856230yP7) ListProtector.get(this.LLJL, i);
                            String str = convertStyleItem.picUrl;
                            List<BaseImage> imageList3 = interfaceC1856630yPl2.getImageList();
                            if (imageList3 != null && (baseImage2 = (BaseImage) C13LP.LJJJLL(imageList3)) != null) {
                                C1856620yPk c1856620yPk = LLJZ;
                                int i13 = this.LLJLIL;
                                c1856620yPk.getClass();
                                c1856230yP74.LJ(C1856620yPk.LIZ(i13, baseImage2));
                                Map<String, String> commonParams = getCommonParams();
                                c1856230yP74.LLJ = null;
                                C1856230yP7.LIZIZ(c1856230yP74, null, null, Collections.singletonList(str), commonParams, 3);
                                c1856230yP74.setOnClickListener(new AwS142S1200000_27(str, this, baseImage2, 1));
                            }
                            i++;
                        }
                    }
                } else {
                    i = 0;
                }
                List<BaseImage> imageList4 = interfaceC1856630yPl2.getImageList();
                if (imageList4 != null) {
                    for (BaseImage baseImage3 : imageList4) {
                        if (i < ((ArrayList) this.LLJL).size()) {
                            op((C1856230yP7) ListProtector.get(this.LLJL, i), baseImage3);
                            i++;
                        }
                    }
                    return;
                }
                return;
            }
            C1856230yP7 c1856230yP75 = (C1856230yP7) C13LP.LJJJLL(this.LLJL);
            if (c1856230yP75 != null && (imageList = interfaceC1856630yPl2.getImageList()) != null && (baseImage = (BaseImage) C13LP.LJJJLL(imageList)) != null) {
                op(c1856230yP75, baseImage);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1856630yPl interfaceC1856630yPl) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1856630yPl interfaceC1856630yPl) {
    }

    @Override // X.InterfaceC1361305Ul
    public final void Of(String str, boolean z) {
        String str2;
        int i;
        for (C1856230yP7 c1856230yP7 : (ArrayList) this.LLJL) {
            BaseImage image = c1856230yP7.getImage();
            if (image != null) {
                str2 = image.imageUuid;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, str)) {
                if (z) {
                    i = 0;
                } else {
                    i = 4;
                }
                int visibility = c1856230yP7.getVisibility();
                c1856230yP7.setVisibility(i);
                C1602160rnK.LIZIZ(visibility, i, c1856230yP7);
            }
        }
    }

    public final void op(C1856230yP7 c1856230yP7, BaseImage baseImage) {
        Integer num = baseImage.uploadStatus;
        if (num != null) {
            if (num.intValue() == 0) {
                C1856620yPk c1856620yPk = LLJZ;
                int i = this.LLJLIL;
                c1856620yPk.getClass();
                c1856230yP7.LJ(C1856620yPk.LIZ(i, baseImage));
                c1856230yP7.LIZ(baseImage, getCommonParams());
                c1856230yP7.LIZJ(baseImage);
                c1856230yP7.setOnClickListener(new AwS428S0200000_27(baseImage, this, 90));
                c1856230yP7.setOnLongClickListener(new AwS304S0300000_27(baseImage, this, c1856230yP7, 10));
                return;
            }
            if (num.intValue() == 1) {
                C1856620yPk c1856620yPk2 = LLJZ;
                int i2 = this.LLJLIL;
                c1856620yPk2.getClass();
                c1856230yP7.LJ(C1856620yPk.LIZ(i2, baseImage));
                c1856230yP7.LIZ(baseImage, getCommonParams());
                c1856230yP7.LIZJ(baseImage);
                return;
            }
            if (num.intValue() == 3) {
                c1856230yP7.getClass();
                String str = (String) C13LP.LJJJLL(baseImage.urlList);
                if (str == null) {
                    str = "";
                }
                C1331660kl2.LJIIIZ(str).LJJIII();
                c1856230yP7.LIZJ(baseImage);
                return;
            }
            if (num.intValue() == 4) {
                c1856230yP7.LIZJ(baseImage);
            } else {
                if (num.intValue() != 2) {
                    return;
                }
                c1856230yP7.LIZJ(baseImage);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.ArrayList] */
    public final void up(String str, String str2, BaseImage baseImage) {
        String messageId;
        ?? arrayList;
        ?? arrayList2;
        String messageId2;
        List<BaseImage> imageList;
        List<ConvertStyleItem> listLIZLLL;
        String messageId3;
        HashMap map = new HashMap();
        map.putAll(getCommonParams());
        map.put("url", str);
        map.put("source", "full_screen");
        InterfaceC1856630yPl interfaceC1856630yPl = this.LLJLILLLLZIIL;
        if (interfaceC1856630yPl != null) {
            messageId = interfaceC1856630yPl.getMessageId();
        } else {
            messageId = null;
        }
        map.put("message_id", messageId);
        C07QI.LIZ.getClass();
        if (C07QI.LIZ()) {
            C1561230qjJ.LIZ.getClass();
            if (!C1561230qjJ.LIZ()) {
                TakoContentPreviewItem.Image image = new TakoContentPreviewItem.Image(baseImage.width, baseImage.height, Collections.singletonList(str), 8);
                InterfaceC1856630yPl interfaceC1856630yPl2 = this.LLJLILLLLZIIL;
                if (interfaceC1856630yPl2 != null) {
                    messageId3 = interfaceC1856630yPl2.getMessageId();
                } else {
                    messageId3 = null;
                }
                new TakoMultiImagePreviewNavParam(image, messageId3, false, null, map, true, false).open(this);
                return;
            }
            InterfaceC1856630yPl interfaceC1856630yPl3 = this.LLJLILLLLZIIL;
            if (interfaceC1856630yPl3 != null && (listLIZLLL = interfaceC1856630yPl3.LIZLLL()) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(listLIZLLL, 10));
                Iterator<ConvertStyleItem> it2 = listLIZLLL.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new TakoContentPreviewItem.Image(baseImage.width, baseImage.height, str2, Collections.singletonList(it2.next().picUrl)));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            InterfaceC1856630yPl interfaceC1856630yPl4 = this.LLJLILLLLZIIL;
            if (interfaceC1856630yPl4 != null && (imageList = interfaceC1856630yPl4.getImageList()) != null) {
                arrayList2 = new ArrayList(C15438062q.LJIJJ(imageList, 10));
                for (BaseImage baseImage2 : imageList) {
                    arrayList2.add(new TakoContentPreviewItem.Image(baseImage2.width, baseImage2.height, baseImage2.imageUuid, baseImage2.urlList));
                }
            } else {
                arrayList2 = C13BV.INSTANCE;
            }
            List<? extends TakoContentPreviewItem> listLJLIL = C13LP.LJLIL(arrayList2, arrayList);
            Iterator it3 = ((ArrayList) listLJLIL).iterator();
            int i = 0;
            while (true) {
                if (it3.hasNext()) {
                    if (((TakoContentPreviewItem.Image) it3.next()).imageUrls.contains(str)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            if (tp() != null) {
                InterfaceC1856570yPf interfaceC1856570yPfTp = tp();
                if (interfaceC1856570yPfTp == null) {
                    return;
                }
                InterfaceC1856630yPl interfaceC1856630yPl5 = this.LLJLILLLLZIIL;
                if (interfaceC1856630yPl5 != null) {
                    messageId2 = interfaceC1856630yPl5.getMessageId();
                } else {
                    messageId2 = null;
                }
                interfaceC1856570yPfTp.Lk0(listLJLIL, i, messageId2, false, null, map, "ai_drawing", false, false);
                return;
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "//tako/detal/image");
            smartRouteBuildRoute.withParam("image_url", new String[]{str});
            smartRouteBuildRoute.withParam("image_mob_params", map);
            smartRouteBuildRoute.open();
            return;
        }
        SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(getContext(), "//tako/detal/image");
        smartRouteBuildRoute2.withParam("image_url", new String[]{str});
        smartRouteBuildRoute2.withParam("image_mob_params", map);
        smartRouteBuildRoute2.open();
    }
}
