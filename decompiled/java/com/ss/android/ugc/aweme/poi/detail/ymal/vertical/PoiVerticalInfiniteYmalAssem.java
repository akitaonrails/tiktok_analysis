package com.ss.android.ugc.aweme.poi.detail.ymal.vertical;

import X.AbstractC1186480gys;
import X.AbstractC329610Cw3;
import X.C01GW;
import X.C1174140gey;
import X.C1175090ggV;
import X.C1175120ggY;
import X.C1175130ggZ;
import X.C1175140gga;
import X.C1175490gh9;
import X.C1175980ghw;
import X.C1185410gx9;
import X.C1185600gxS;
import X.C1186840gzS;
import X.C1195630hDd;
import X.C123100dR;
import X.C13BV;
import X.C15438062q;
import X.C1697810uHb;
import X.C20603715jn;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2211631BhB;
import X.C339190DRl;
import X.C418440Gaw;
import X.C452501pT;
import X.C814420VxA;
import X.EnumC1177990glB;
import X.EnumC1184730gw3;
import X.InterfaceC1180270gor;
import X.InterfaceC1181010gq3;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS116S0100000_16;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailLoadingFooterCell;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.slash.cell.arc.Padding;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashClickConfig;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashTrackConfig;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiVerticalInfiniteYmalAssem extends PoiDetailBaseAssem<PoiDetailYmalModule> implements InterfaceC1180270gor {
    public ViewOnAttachStateChangeListenerC20604515jv LLJJL;
    public C1175130ggZ LLJJLIIIJLLLLLLLZ;
    public final C1175090ggV<PoiGeneralCard> LLJL = new C1175090ggV<>();
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1345));
    public C1175490gh9 LLJLILLLLZIIL;
    public String LLJLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e3n;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C1186840gzS c1186840gzSLw1;
        super.onDestroy();
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = BK2();
        if (interfaceC1181010gq3BK2 == null || (c1186840gzSLw1 = interfaceC1181010gq3BK2.lw1()) == null) {
            return;
        }
        c1186840gzSLw1.LIZJ("SlashQuickNavigationClick", this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Cw3, X.0gh9] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        C1175130ggZ c1175130ggZ;
        final PoiDetailYmalModule poiDetailYmalModule = (PoiDetailYmalModule) baseComponentData;
        super.CG1(poiDetailYmalModule);
        if (C123100dR.LIZ(poiDetailYmalModule.getTitle()) && (c1175130ggZ = this.LLJJLIIIJLLLLLLLZ) != null) {
            c1175130ggZ.LIZIZ(new C1175140gga(poiDetailYmalModule.getTitle(), null));
        }
        if (this.LLJLILLLLZIIL == null) {
            final C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LIZLLL = PoiDetailLoadingFooterCell.class;
            c20603715jn.LIZJ = true;
            c20603715jn.LIZ = 3;
            ?? r1 = new AbstractC329610Cw3<Integer>(c20603715jn) { // from class: X.0gh9
                @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
                public final void onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
                    int iIntValue = 0;
                    List<C1175980ghw> listEp = this.Ep(poiDetailYmalModule, 0);
                    if (Intrinsics.LJFF(poiDetailYmalModule.getHasMore(), Boolean.TRUE)) {
                        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                        Integer cursor = poiDetailYmalModule.getCursor();
                        if (cursor != null) {
                            iIntValue = cursor.intValue();
                        }
                        C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(c317290CcB, null, Integer.valueOf(iIntValue), listEp, 1);
                        C189200o6.m2constructorimpl(c323380Cm0LJ);
                        interfaceC1364105Vn.resumeWith(c323380Cm0LJ);
                        return;
                    }
                    AbstractC316870CbV.LIZ.getClass();
                    C316640Cb8 c316640Cb8 = new C316640Cb8(listEp);
                    C189200o6.m2constructorimpl(c316640Cb8);
                    interfaceC1364105Vn.resumeWith(c316640Cb8);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0195  */
                /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
                @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onLoadMore(final X.InterfaceC1364105Vn r17, java.lang.Object r18) {
                    /*
                        Method dump skipped, instruction units count: 467
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1175490gh9.onLoadMore(X.05Vn, java.lang.Object):void");
                }
            };
            this.LLJLILLLLZIIL = r1;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJL;
            if (viewOnAttachStateChangeListenerC20604515jv != 0) {
                viewOnAttachStateChangeListenerC20604515jv.LJIIL(r1);
            }
        }
    }

    @Override // X.InterfaceC1180270gor
    public void onEvent(AbstractC1186480gys abstractC1186480gys) {
        if (abstractC1186480gys instanceof C1174140gey) {
            HandlerHook.viewPost(LJJIJL(), new ARunnableS116S0100000_16(this, 68));
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1186840gzS c1186840gzSLw1;
        super.onViewCreated(view);
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = BK2();
        if (interfaceC1181010gq3BK2 != null && (c1186840gzSLw1 = interfaceC1181010gq3BK2.lw1()) != null) {
            c1186840gzSLw1.LIZIZ("SlashQuickNavigationClick", this);
        }
        C2211631BhB.LJ(view, new AwS384S0200000_18(view, this, 23));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.ymal_poi_list);
        this.LLJJL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            InterfaceC1181010gq3 interfaceC1181010gq3BK22 = BK2();
            if (interfaceC1181010gq3BK22 != null) {
                interfaceC1181010gq3BK22.iY0(viewOnAttachStateChangeListenerC20604515jv);
            }
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
            this.LLJL.getClass();
            C1175090ggV.LIZIZ(viewOnAttachStateChangeListenerC20604515jv);
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext()));
            C1175130ggZ c1175130ggZ = new C1175130ggZ(viewOnAttachStateChangeListenerC20604515jv.getContext(), null, 6);
            c1175130ggZ.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            C1195630hDd c1195630hDd = c1175130ggZ.LLILZ;
            if (c1195630hDd != null) {
                C339190DRl.LIZIZ(c1195630hDd);
            }
            c1175130ggZ.LIZIZ(new C1175140gga(c1175130ggZ.getContext().getString(2131858570), null));
            this.LLJJLIIIJLLLLLLLZ = c1175130ggZ;
            viewOnAttachStateChangeListenerC20604515jv.LJ(0, c1175130ggZ);
        }
    }

    public final List<C1175980ghw> Ep(PoiDetailYmalModule poiDetailYmalModule, int i) {
        List<PoiDiscoveryCard> poiList;
        String str;
        Long lLJIILIIL;
        C1185410gx9 c1185410gx9;
        if (poiDetailYmalModule != null) {
            List<PoiGeneralCard> poiListV2 = poiDetailYmalModule.getPoiListV2();
            if (poiListV2 != null && !poiListV2.isEmpty()) {
                C1175090ggV<PoiGeneralCard> c1175090ggV = this.LLJL;
                AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(poiDetailYmalModule, 46);
                AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(24);
                AFwS256S0000000_18 aFwS256S0000000_182 = AFwS256S0000000_18.get$arr$(25);
                c1175090ggV.getClass();
                return C1175090ggV.LIZ(poiListV2, awS597S0100000_18, i, aFwS256S0000000_18, aFwS256S0000000_182);
            }
            if (poiDetailYmalModule != null && (poiList = poiDetailYmalModule.getPoiList()) != null) {
                C1185600gxS c1185600gxS = (C1185600gxS) this.LLJLIL.getValue();
                if (c1185600gxS != null && (c1185410gx9 = c1185600gxS.LJFF) != null) {
                    c1185410gx9.getFromPoiId();
                }
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(poiList, 10));
                int i2 = 0;
                for (PoiDiscoveryCard poiDiscoveryCard : poiList) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        PoiDiscoveryCard poiDiscoveryCard2 = poiDiscoveryCard;
                        if (Intrinsics.LJFF(poiDiscoveryCard2.typeLevel, EnumC1184730gw3.REGIONAL.getTypeCode$poi_release())) {
                            str = "poi_regional_card";
                        } else if (Intrinsics.LJFF(poiDiscoveryCard2.keyCategory, EnumC1177990glB.HOTEL.getCategory())) {
                            str = "poi_hotel_card";
                        } else {
                            str = "poi_common_card";
                        }
                        String str2 = poiDiscoveryCard2.poiId;
                        String str3 = poiDiscoveryCard2.coverImg;
                        String str4 = poiDiscoveryCard2.poiName;
                        String str5 = poiDiscoveryCard2.reviewScore;
                        String str6 = poiDiscoveryCard2.reviewMaxScore;
                        String str7 = poiDiscoveryCard2.reviewCount;
                        if (str7 != null) {
                            lLJIILIIL = C2095008Iq.LJIILIIL(str7);
                        } else {
                            lLJIILIIL = null;
                        }
                        arrayList.add(new C1175980ghw(new SlashCellModel("cell", str, null, null, null, C1697810uHb.LJIIJJI(new SlashTrackConfig("ymal_item_show", null, "cell_show"), new SlashTrackConfig("ymal_item_click", null, "cell_click")), new SlashClickConfig(null, C2097608Jq.LJ()), null, i2 + i, new PoiCardCellData(str2, str3, str4, str5, str6, C1175120ggY.LIZLLL(lLJIILIIL), poiDiscoveryCard2.upperTag, poiDiscoveryCard2.categoryName, poiDiscoveryCard2.addressInfo, null, poiDiscoveryCard2.poiTags, poiDiscoveryCard2.productInfo, poiDiscoveryCard2.poiDetailTagStyleMap, poiDiscoveryCard2.cityCode, poiDiscoveryCard2.typeLevel, poiDiscoveryCard2.regionCode, poiDiscoveryCard2.collectInfo, poiDiscoveryCard2.formattedAddress, poiDiscoveryCard2.isCollected(), poiDiscoveryCard2.isClaimed(), poiDiscoveryCard2.poiDisplay, poiDiscoveryCard2.keyCategory, 0, null, poiDiscoveryCard2.noRating, "poi_infinite_ymal_cover", "poi_detail", new Padding(12, 12, 16, 16)), AFwS256S0000000_18.get$arr$(749)), null, null, 14));
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                return arrayList;
            }
        }
        return C13BV.INSTANCE;
    }
}
