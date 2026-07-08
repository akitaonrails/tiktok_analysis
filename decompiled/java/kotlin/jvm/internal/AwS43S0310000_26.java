package kotlin.jvm.internal;

import X.AnonymousClass0378;
import X.C04GX;
import X.C09AY;
import X.C0SZ4;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1697810uHb;
import X.C1714530uiZ;
import X.C1714540uia;
import X.C1720030urR;
import X.C1741890vQh;
import X.C1745310vWD;
import X.C1745340vWG;
import X.C1745680vWo;
import X.C1750540vee;
import X.C1750810vf5;
import X.C1753650vjf;
import X.C1753660vjg;
import X.C19719612Di;
import X.C2097608Jq;
import X.C23271099x;
import X.C2371409Qy;
import X.C428070GqT;
import X.C948503nH;
import X.C960203pA;
import X.EnumC1714520uiY;
import X.EnumC1714570uid;
import X.EnumC488160JCk;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.bytedance.pipo.stellar.base.resourceloader.StellarChunk;
import com.bytedance.pipo.stellar.base.resourceloader.StellarSection;
import com.bytedance.pipo.stellar.base.resourceloader.StellarStyle;
import com.bytedance.pipo.verify.base.model.StatusReason;
import com.bytedance.pipo.verify.base.model.response.AlertMsg;
import com.bytedance.pipo.verify.base.model.response.DoVerifyResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AddToFavoriteData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.TemplateEditFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.TemplateEditBottomAreaAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.verify.pin.PinVerifyViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS43S0310000_26 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS43S0310000_26 awS43S0310000_26, Object obj) {
        StellarStyle stellarStyle;
        CardDO cardDO;
        List arrayList;
        List<StellarSection> list;
        List arrayList2;
        List arrayList3;
        C1720030urR c1720030urR = (C1720030urR) obj;
        EnumC488160JCk enumC488160JCk = EnumC488160JCk.SUCCESS;
        boolean z = awS43S0310000_26.z3;
        StellarChunk stellarChunk = (StellarChunk) awS43S0310000_26.l0;
        StellarActionDO stellarActionDO = null;
        if (stellarChunk != null) {
            stellarStyle = stellarChunk.mainStyle;
            cardDO = stellarChunk.header;
        } else {
            stellarStyle = null;
            cardDO = null;
        }
        ArrayList arrayList4 = new ArrayList(C1697810uHb.LJIIL(cardDO));
        CardDO cardDO2 = (CardDO) awS43S0310000_26.l1;
        if (cardDO2 != null) {
            arrayList = C1697810uHb.LJIILJJIL(cardDO2);
        } else {
            StellarChunk stellarChunk2 = (StellarChunk) awS43S0310000_26.l0;
            if (stellarChunk2 != null && (list = stellarChunk2.sections) != null) {
                ArrayList arrayList5 = new ArrayList();
                Iterator<StellarSection> it2 = list.iterator();
                while (it2.hasNext()) {
                    Iterable iterable = it2.next().cardList;
                    if (iterable == null) {
                        iterable = C13BV.INSTANCE;
                    }
                    C19719612Di.LJJI(iterable, arrayList5);
                }
                arrayList = new ArrayList(arrayList5);
            } else {
                arrayList = new ArrayList();
            }
        }
        if (((CardDO) awS43S0310000_26.l1) != null) {
            arrayList2 = new ArrayList();
        } else {
            StellarChunk stellarChunk3 = (StellarChunk) awS43S0310000_26.l0;
            if (stellarChunk3 != null) {
                arrayList2 = stellarChunk3.footer;
            } else {
                arrayList2 = null;
            }
        }
        if (((CardDO) awS43S0310000_26.l1) != null) {
            arrayList3 = new ArrayList();
        } else {
            StellarChunk stellarChunk4 = (StellarChunk) awS43S0310000_26.l0;
            if (stellarChunk4 != null) {
                arrayList3 = stellarChunk4.background;
            } else {
                arrayList3 = null;
            }
        }
        StellarChunk stellarChunk5 = (StellarChunk) awS43S0310000_26.l2;
        if (stellarChunk5 != null) {
            stellarActionDO = stellarChunk5.stellarAction;
        }
        return C1720030urR.LIZ(c1720030urR, enumC488160JCk, null, z, stellarStyle, arrayList4, arrayList, arrayList2, arrayList3, stellarActionDO, 2);
    }

    public static final Object invoke$1(AwS43S0310000_26 awS43S0310000_26, Object obj) {
        Object obj2;
        Object obj3;
        String str;
        LaneParams laneParams = (LaneParams) obj;
        String str2 = ((C1745680vWo) awS43S0310000_26.l0).LIZ.key;
        if (str2 == null) {
            str2 = "";
        }
        laneParams.plusAssign("input_box_name", str2);
        laneParams.plusAssign("stay_time", String.valueOf(SystemClock.elapsedRealtime() - ((PhoneInputItemViewHolder) awS43S0310000_26.l1).LLJJIJI));
        if (!Intrinsics.LJFF(((C1745680vWo) awS43S0310000_26.l0).LIZ.key, "address_searchbar")) {
            laneParams.plusAssign("input_method", ((PhoneInputItemViewHolder) awS43S0310000_26.l1).LLJJIII.LJIIJ);
            String str3 = "1";
            if (((PhoneInputItemViewHolder) awS43S0310000_26.l1).LLJJIJIL) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams.plusAssign("has_normal_input", obj2);
            laneParams.plusAssign("has_auto_input", CardStruct.IStatusCode.DEFAULT);
            if (awS43S0310000_26.z3) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams.plusAssign("has_sug_input", obj3);
            if (!C1745310vWD.LIZ((C1745340vWG) awS43S0310000_26.l2)) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams.plusAssign("is_valid", str3);
            C1745340vWG c1745340vWG = (C1745340vWG) awS43S0310000_26.l2;
            if (c1745340vWG != null && (str = c1745340vWG.LIZLLL) != null) {
                laneParams.plusAssign("strong_fail_reason", str);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS43S0310000_26 awS43S0310000_26, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LLIZLLLIL = R.id.i1q;
        c0sz4.LL = C13LE.LIZ(TemplateEditBottomAreaAssem.class);
        ((Assembler) awS43S0310000_26.l0).DQ2((TemplateEditFragment) awS43S0310000_26.l1, new AwS112S0110000_26((TemplateItem) awS43S0310000_26.l2, awS43S0310000_26.z3, 5));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS43S0310000_26 awS43S0310000_26, Object obj) {
        boolean z;
        String string;
        n nVar;
        n nVarLJJIJ;
        Set<Map.Entry<String, k>> setEntrySet;
        n nVarLJJIJ2;
        AddToFavoriteData addToFavoriteData;
        View view;
        Type type;
        boolean z2;
        String str;
        boolean zCanScrollVertically;
        Integer numValueOf;
        View view2;
        ViewGroup viewGroupLIZIZ;
        ViewGroup viewGroupLIZIZ2;
        RecyclerView recyclerViewLIZLLL;
        List<String> urls;
        n nVarLJJIJ3;
        AddToFavoriteData addToFavoriteData2;
        View view3;
        Type type2;
        n nVar2;
        n nVar3;
        n nVarLJJIJ4;
        Set<Map.Entry<String, k>> setEntrySet2;
        C1750810vf5 c1750810vf5 = (C1750810vf5) awS43S0310000_26.l0;
        View view4 = (View) awS43S0310000_26.l1;
        Response response = (Response) awS43S0310000_26.l2;
        if (response != null && response.isCodeOK()) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = awS43S0310000_26.z3;
        Response response2 = (Response) awS43S0310000_26.l2;
        PdpViewModel pdpViewModel = c1750810vf5.LIZ;
        ExceptionUX exceptionUX = null;
        ExceptionUX exceptionUX2 = null;
        Function1<? super Boolean, Unit> function1 = null;
        if (z) {
            if (response2 != null && (nVar3 = (n) response2.data) != null && (nVarLJJIJ4 = nVar3.LJJIJ("data")) != null && (setEntrySet2 = nVarLJJIJ4.entrySet()) != null && (!setEntrySet2.isEmpty())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                AnonymousClass0378.LIZ().LIZ("pdp_save_product", C1741890vQh.LJIIIIZZ(C2097608Jq.LJIIIIZZ(new Pair("saved", Integer.valueOf(z3 ? 1 : 0)), new Pair("pid", c1750810vf5.LIZ.getProductId()))));
                if (response2 != null && (nVar2 = (n) response2.data) != null) {
                    nVarLJJIJ3 = nVar2.LJJIJ("data");
                } else {
                    nVarLJJIJ3 = null;
                }
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        type2 = C2371409Qy.LIZJ(C13LE.LJII(AddToFavoriteData.class));
                    } else {
                        type2 = new TypeToken<AddToFavoriteData>() { // from class: X.0veh
                        }.getType();
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, nVarLJJIJ3, type2);
                    if (!(objFromJson instanceof AddToFavoriteData)) {
                        objFromJson = null;
                    }
                    addToFavoriteData2 = (AddToFavoriteData) objFromJson;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    addToFavoriteData2 = null;
                }
                PdpViewModel pdpViewModel2 = c1750810vf5.LIZ;
                C04GX c04gx = pdpViewModel2.l;
                if (c04gx != null) {
                    view3 = c04gx.LIZ.LLJLL;
                } else {
                    view3 = null;
                }
                if (z3) {
                    C948503nH.LJFF(pdpViewModel2, C23271099x.INSTANCE, new C1750540vee(c1750810vf5, view4, addToFavoriteData2, null));
                } else if (view3 != null) {
                    if (addToFavoriteData2 != null) {
                        exceptionUX2 = addToFavoriteData2.exceptionUX;
                    }
                    c1750810vf5.LIZLLL(view3, exceptionUX2);
                }
            } else {
                AnonymousClass0378.LIZ().LIZ("pdp_save_product", C1741890vQh.LJIIIIZZ(C2097608Jq.LJIIIIZZ(new Pair("saved", Integer.valueOf(z3 ? 1 : 0)), new Pair("pid", pdpViewModel.getProductId()))));
                if (z3) {
                    view4.getContext().getString(2131832816);
                    Context context = view4.getContext();
                    Image imageCR2 = pdpViewModel.CR2();
                    if (imageCR2 != null && (urls = imageCR2.getUrls()) != null) {
                        str = (String) C13LP.LJJJLL(urls);
                    } else {
                        str = null;
                    }
                    C04GX c04gx2 = pdpViewModel.l;
                    if (c04gx2 != null && (recyclerViewLIZLLL = c04gx2.LIZLLL()) != null) {
                        zCanScrollVertically = recyclerViewLIZLLL.canScrollVertically(-1);
                    } else {
                        zCanScrollVertically = false;
                    }
                    C04GX c04gx3 = pdpViewModel.l;
                    if (c04gx3 != null) {
                        numValueOf = Integer.valueOf(c04gx3.LIZJ());
                    } else {
                        numValueOf = null;
                    }
                    C04GX c04gx4 = pdpViewModel.l;
                    if (c04gx4 != null) {
                        view2 = c04gx4.LIZ.LLJLL;
                        viewGroupLIZIZ = c04gx4.LIZIZ();
                    } else {
                        view2 = null;
                        viewGroupLIZIZ = null;
                    }
                    C04GX c04gx5 = pdpViewModel.l;
                    if (c04gx5 != null) {
                        viewGroupLIZIZ2 = c04gx5.LIZIZ();
                    } else {
                        viewGroupLIZIZ2 = null;
                    }
                    C04GX c04gx6 = pdpViewModel.l;
                    if (c04gx6 != null) {
                        function1 = c04gx6.LIZ.LLJLLL;
                    }
                    C428070GqT.LIZ(context, null, str, zCanScrollVertically, numValueOf, view2, viewGroupLIZIZ, viewGroupLIZIZ2, function1);
                } else {
                    String string2 = view4.getContext().getString(2131832819);
                    C1389880mGw c1389880mGw = new C1389880mGw(view4);
                    c1389880mGw.LJIIIZ(string2);
                    c1389880mGw.LJIIJ();
                }
            }
        } else if (response2 != null && (nVar = (n) response2.data) != null && (nVarLJJIJ = nVar.LJJIJ("data")) != null && (setEntrySet = nVarLJJIJ.entrySet()) != null && (!setEntrySet.isEmpty())) {
            n nVar4 = (n) response2.data;
            if (nVar4 != null) {
                nVarLJJIJ2 = nVar4.LJJIJ("data");
            } else {
                nVarLJJIJ2 = null;
            }
            try {
                Gson gsonLJFF2 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(AddToFavoriteData.class));
                } else {
                    type = new TypeToken<AddToFavoriteData>() { // from class: X.0veg
                    }.getType();
                }
                Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, nVarLJJIJ2, type);
                if (!(objFromJson2 instanceof AddToFavoriteData)) {
                    objFromJson2 = null;
                }
                addToFavoriteData = (AddToFavoriteData) objFromJson2;
            } catch (s e2) {
                TryCatchGuardChecker.doCheck(e2);
                addToFavoriteData = null;
            }
            pdpViewModel.getClass();
            C04GX c04gx7 = pdpViewModel.l;
            if (c04gx7 != null && (view = c04gx7.LIZ.LLJLL) != null) {
                if (addToFavoriteData != null) {
                    exceptionUX = addToFavoriteData.exceptionUX;
                }
                c1750810vf5.LIZLLL(view, exceptionUX);
            }
        } else {
            if (z3) {
                string = view4.getContext().getString(2131832815);
            } else {
                string = view4.getContext().getString(2131832818);
            }
            C1389880mGw c1389880mGw2 = new C1389880mGw(view4);
            c1389880mGw2.LJIIIZ(string);
            c1389880mGw2.LJIIJ();
        }
        Response response3 = (Response) awS43S0310000_26.l2;
        if (response3 != null && response3.isCodeOK()) {
            ((C1750810vf5) awS43S0310000_26.l0).LIZ.LLLILZJ = Boolean.valueOf(awS43S0310000_26.z3);
            C1750810vf5 c1750810vf52 = (C1750810vf5) awS43S0310000_26.l0;
            c1750810vf52.LIZ.setState(new AwS605S0100000_26(c1750810vf52, 529));
        } else {
            ((C1750810vf5) awS43S0310000_26.l0).LIZ.LLLILZJ = Boolean.valueOf(!awS43S0310000_26.z3);
            C1750810vf5 c1750810vf53 = (C1750810vf5) awS43S0310000_26.l0;
            c1750810vf53.LIZ.setState(new AwS605S0100000_26(c1750810vf53, 530));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS43S0310000_26 awS43S0310000_26, Object obj) {
        boolean z;
        String string;
        String string2;
        SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) awS43S0310000_26.l0;
        View view = (View) awS43S0310000_26.l1;
        Response response = (Response) awS43S0310000_26.l2;
        if (response != null && response.isCodeOK()) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = awS43S0310000_26.z3;
        seaPdpViewModel.getClass();
        if (z) {
            AnonymousClass0378.LIZ().LIZ("pdp_save_product", C1741890vQh.LJIIIIZZ(C2097608Jq.LJIIIIZZ(new Pair("saved", Integer.valueOf(z2 ? 1 : 0)), new Pair("pid", seaPdpViewModel.getProductId()))));
            if (z2) {
                string2 = view.getContext().getString(2131832816);
            } else {
                string2 = view.getContext().getString(2131832819);
            }
            C1389880mGw c1389880mGw = new C1389880mGw(view);
            c1389880mGw.LJIIIZ(string2);
            if (z2) {
                c1389880mGw.LJ(R.raw.icon_tick_fill);
                c1389880mGw.LJFF(C960203pA.LIZ(R.attr.a0i, view.getContext()));
            }
            c1389880mGw.LIZLLL(1000L);
            c1389880mGw.LJIIJ();
        } else {
            if (z2) {
                string = view.getContext().getString(2131832815);
            } else {
                string = view.getContext().getString(2131832818);
            }
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        }
        Response response2 = (Response) awS43S0310000_26.l2;
        if (response2 != null && response2.isCodeOK()) {
            ((SeaPdpViewModel) awS43S0310000_26.l0).LLLIZZ = Boolean.valueOf(awS43S0310000_26.z3);
            SeaPdpViewModel seaPdpViewModel2 = (SeaPdpViewModel) awS43S0310000_26.l0;
            seaPdpViewModel2.setState(new AwS605S0100000_26(seaPdpViewModel2, 652));
        } else {
            ((SeaPdpViewModel) awS43S0310000_26.l0).LLLIZZ = Boolean.valueOf(!awS43S0310000_26.z3);
            SeaPdpViewModel seaPdpViewModel3 = (SeaPdpViewModel) awS43S0310000_26.l0;
            seaPdpViewModel3.setState(new AwS605S0100000_26(seaPdpViewModel3, 653));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS43S0310000_26 awS43S0310000_26, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        ((C1753660vjg) awS43S0310000_26.l0).LIZIZ(laneParams, (BundleInfo) awS43S0310000_26.l1);
        C1753660vjg c1753660vjg = (C1753660vjg) awS43S0310000_26.l0;
        BundleInfo bundleInfo = (BundleInfo) awS43S0310000_26.l1;
        c1753660vjg.getClass();
        C1753660vjg.LIZ(laneParams, bundleInfo);
        laneParams.plusAssign("button_name", "bundle_add_to_cart");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        List<BundleProduct> list = ((BundleInfo) awS43S0310000_26.l1).productList;
        if (list != null) {
            for (BundleProduct bundleProduct : list) {
                sb.append(bundleProduct.productId);
                sb.append(",");
                sb2.append(bundleProduct.productSource);
                sb2.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        laneParams.plusAssign("product_id", sb.toString());
        laneParams.plusAssign("product_source", sb2.toString());
        if (awS43S0310000_26.z3) {
            str = "able_to_cart";
        } else {
            str = "unable_to_cart";
        }
        laneParams.plusAssign("button_type", str);
        laneParams.plusAssign("source_page_type", "bundle_deal");
        Map<String, ? extends Object> map = (Map) awS43S0310000_26.l2;
        if (map != null) {
            laneParams.withParamsGroup(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS43S0310000_26 awS43S0310000_26, Object obj) {
        Integer num;
        int i;
        C1714530uiZ c1714530uiZ = (C1714530uiZ) obj;
        DoVerifyResponse doVerifyResponse = (DoVerifyResponse) awS43S0310000_26.l0;
        StatusReason statusReason = doVerifyResponse.statusReason;
        AlertMsg alertMsg = doVerifyResponse.alertMsg;
        String str = doVerifyResponse.nextVerifyInfo;
        int i2 = ((PinVerifyViewModel) awS43S0310000_26.l1).LL;
        if (statusReason != null) {
            num = statusReason.reasonCode;
        } else {
            num = null;
        }
        C1714540uia c1714540uia = new C1714540uia((EnumC1714570uid) awS43S0310000_26.l2, statusReason, alertMsg, str, String.valueOf(num), i2);
        EnumC1714520uiY enumC1714520uiY = EnumC1714520uiY.SUCCESS;
        if (awS43S0310000_26.z3) {
            i = c1714530uiZ.LLILZIL + 1;
        } else {
            i = c1714530uiZ.LLILZIL;
        }
        return C1714530uiZ.LIZ(c1714530uiZ, c1714540uia, enumC1714520uiY, null, false, i, 44);
    }

    public static final Object invoke$7(AwS43S0310000_26 awS43S0310000_26, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        ((C1753650vjf) awS43S0310000_26.l0).LIZIZ(laneParams, (BundleInfo) awS43S0310000_26.l1);
        C1753650vjf c1753650vjf = (C1753650vjf) awS43S0310000_26.l0;
        BundleInfo bundleInfo = (BundleInfo) awS43S0310000_26.l1;
        c1753650vjf.getClass();
        C1753650vjf.LIZ(laneParams, bundleInfo);
        laneParams.plusAssign("button_name", "bundle_add_to_cart");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        List<BundleProduct> list = ((BundleInfo) awS43S0310000_26.l1).productList;
        if (list != null) {
            for (BundleProduct bundleProduct : list) {
                sb.append(bundleProduct.productId);
                sb.append(",");
                sb2.append(bundleProduct.productSource);
                sb2.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        laneParams.plusAssign("product_id", sb.toString());
        laneParams.plusAssign("product_source", sb2.toString());
        if (awS43S0310000_26.z3) {
            str = "able_to_cart";
        } else {
            str = "unable_to_cart";
        }
        laneParams.plusAssign("button_type", str);
        laneParams.plusAssign("source_page_type", "bundle_deal");
        laneParams.withParamsGroup((Map) awS43S0310000_26.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S0310000_26(C1745680vWo c1745680vWo, PhoneInputItemViewHolder phoneInputItemViewHolder, boolean z, C1745340vWG c1745340vWG, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1745680vWo;
        this.l1 = phoneInputItemViewHolder;
        this.z3 = z;
        this.l2 = c1745340vWG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S0310000_26(C1750810vf5 c1750810vf5, C1750810vf5 c1750810vf52, View view, Response<n> response, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = c1750810vf5;
        this.l1 = c1750810vf52;
        this.l2 = view;
        this.z3 = response;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S0310000_26(C1753650vjf c1753650vjf, C1753650vjf c1753650vjf2, BundleInfo bundleInfo, boolean z, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l0 = c1753650vjf;
        this.l1 = c1753650vjf2;
        this.z3 = bundleInfo;
        this.l2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S0310000_26(C1753660vjg c1753660vjg, C1753660vjg c1753660vjg2, BundleInfo bundleInfo, boolean z, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l0 = c1753660vjg;
        this.l1 = c1753660vjg2;
        this.z3 = bundleInfo;
        this.l2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S0310000_26(Assembler assembler, TemplateEditFragment templateEditFragment, TemplateItem templateItem, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = assembler;
        this.l1 = templateEditFragment;
        this.l2 = templateItem;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S0310000_26(DoVerifyResponse doVerifyResponse, PinVerifyViewModel pinVerifyViewModel, EnumC1714570uid enumC1714570uid, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = doVerifyResponse;
        this.l1 = pinVerifyViewModel;
        this.l2 = enumC1714570uid;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S0310000_26(SeaPdpViewModel seaPdpViewModel, SeaPdpViewModel seaPdpViewModel2, View view, Response<n> response, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = seaPdpViewModel;
        this.l1 = seaPdpViewModel2;
        this.l2 = view;
        this.z3 = response;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S0310000_26(boolean z, StellarChunk stellarChunk, CardDO cardDO, StellarChunk stellarChunk2, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.l0 = stellarChunk;
        this.l1 = cardDO;
        this.l2 = stellarChunk2;
    }
}
