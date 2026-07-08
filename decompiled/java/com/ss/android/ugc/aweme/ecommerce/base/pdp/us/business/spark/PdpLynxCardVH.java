package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark;

import X.AnonymousClass0405;
import X.C01GW;
import X.C04HR;
import X.C099G;
import X.C1054004Ag;
import X.C13BV;
import X.C1537480q70;
import X.C1537710q7N;
import X.C15438062q;
import X.C1548750qPB;
import X.C1741890vQh;
import X.C1743750vTh;
import X.C1748730vbj;
import X.C1751660vgS;
import X.C1752600vhy;
import X.C1752630vi1;
import X.C1752640vi2;
import X.C1752650vi3;
import X.C1755690vmx;
import X.C2097908Jt;
import X.C23250099c;
import X.C324990Cob;
import X.C384601eW;
import X.C452501pT;
import X.C786410Ut5;
import X.C824830WXh;
import X.C948503nH;
import X.EnumC1752690vi7;
import X.InterfaceC1531560pxS;
import X.InterfaceC1541990qEH;
import X.InterfaceC1748810vbr;
import X.InterfaceC1752680vi6;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS126S0100000_26;
import Y.AsS52S0100000_26;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSupply;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpLynxCardVH extends AbsBrickFullSpanVH<C1752600vhy> {
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public final C01GW LLJJJJ;
    public AsS52S0100000_26 LLJJJJJIL;
    public RecyclerView LLJJJJLIIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void I5() {
        C1752640vi2 c1752640vi2 = new C1752640vi2(e6().getProductId());
        c1752640vi2.LIZ.put("brick_name", Integer.valueOf(this.LLJJJ));
        c1752640vi2.LIZIZ();
        e6().a.LIZIZ(this.LLJJJ);
        super.I5();
        ViewParent parent = this.itemView.getParent();
        while (parent != null && !(parent instanceof RecyclerView)) {
            parent = parent.getParent();
        }
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        this.LLJJJJLIIL = recyclerView;
        if (recyclerView == null || this.LLJJJJJIL != null) {
            return;
        }
        AsS52S0100000_26 asS52S0100000_26 = new AsS52S0100000_26(this, 3);
        this.LLJJJJJIL = asS52S0100000_26;
        recyclerView.addOnScrollListener(asS52S0100000_26);
        HandlerHook.viewPost(this.itemView, new ARunnableS126S0100000_26(this, 34));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void P5() {
        RecyclerView recyclerView;
        C1752650vi3 c1752650vi3 = new C1752650vi3(e6().getProductId());
        c1752650vi3.LIZ.put("brick_name", Integer.valueOf(this.LLJJJ));
        c1752650vi3.LIZIZ();
        AsS52S0100000_26 asS52S0100000_26 = this.LLJJJJJIL;
        if (asS52S0100000_26 != null && (recyclerView = this.LLJJJJLIIL) != null) {
            recyclerView.removeOnScrollListener(asS52S0100000_26);
        }
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        d6(0.0f);
        super.P5();
    }

    public final PdpViewModel e6() {
        return (PdpViewModel) this.LLJJJJ.getValue();
    }

    public final void h6() {
        InterfaceC1752680vi6 interfaceC1752680vi6;
        C1755690vmx currentState;
        C1755690vmx currentState2;
        if (this.LLJJJ != EnumC1752690vi7.GUESS_U_LIKE.getValue() || (interfaceC1752680vi6 = this.LLJILLL) == null || (currentState = interfaceC1752680vi6.getCurrentState()) == null || currentState.LLILZ <= 0) {
            d6(0.0f);
            return;
        }
        InterfaceC1752680vi6 interfaceC1752680vi62 = this.LLJILLL;
        d6(((interfaceC1752680vi62 == null || (currentState2 = interfaceC1752680vi62.getCurrentState()) == null) ? 0 : currentState2.LLILZ) - Math.max(this.itemView.getTop(), 0) >= 0 ? r1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJIJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        this.LLJJIJIL = null;
        e6().a.LLJI = null;
        C1743750vTh.LIZ(this);
    }

    public final void d6(float f) {
        if (this.itemView.getTranslationY() != f) {
            C786410Ut5.ed(this.itemView, f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
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
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* JADX INFO: renamed from: f6, reason: merged with bridge method [inline-methods] */
    public final void rr(C1752600vhy c1752600vhy) throws JSONException {
        int i;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2;
        ViewGroup.LayoutParams layoutParams;
        C1752630vi1 c1752630vi1;
        InterfaceC1541990qEH kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3;
        C1537710q7N c1537710q7N;
        C1537480q70 hybridContext;
        InterfaceC1531560pxS interfaceC1531560pxS;
        Map<String, Object> mapLJFF;
        Map mapLIZJ;
        TemplateData templateDataLJIIIIZZ;
        BrickInfo brickInfo;
        LaneParams laneParamsLIZIZ;
        String str;
        String string;
        Uri.Builder builderAppendQueryParameter;
        String str2;
        Object arrayList;
        Object obj;
        Object obj2;
        ConcurrentHashMap<String, Object> concurrentHashMap;
        Object obj3;
        Object obj4;
        Object obj5;
        String strLJIIIIZZ;
        Uri.Builder builderAppendQueryParameter2;
        Object obj6;
        Object obj7;
        Object obj8;
        String string2;
        Uri.Builder builderAppendQueryParameter3;
        Uri.Builder builderAppendQueryParameter4;
        String string3;
        Uri uriBuild;
        String string4;
        Object obj9;
        ConcurrentHashMap<String, Object> concurrentHashMap2;
        ConcurrentHashMap<String, Object> concurrentHashMap3;
        List<SkuItem> list;
        String str3;
        SellerInfo sellerInfo;
        ConcurrentHashMap<String, Object> concurrentHashMap4;
        Object obj10;
        List<BrickInfo> list2;
        BrickInfo next;
        super.rr(c1752600vhy);
        TemplateData templateDataLJIIIIZZ2 = null;
        obj = null;
        obj = null;
        obj = null;
        obj = null;
        Object obj11 = null;
        if (c1752600vhy.LL == EnumC1752690vi7.GUESS_U_LIKE.getValue()) {
            C04HR c04hr = e6().LLLLLJIL;
            View view = this.itemView;
            ProductPackStruct productPackStruct = c04hr.LIZ.LLJILLL;
            if (productPackStruct != null && (list2 = productPackStruct.bricks) != null) {
                Iterator<BrickInfo> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.brickName == EnumC1752690vi7.GUESS_U_LIKE.getValue()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                brickInfo = next;
            } else {
                brickInfo = null;
            }
            InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view);
            if (interfaceC1748810vbrLIZ != null) {
                laneParamsLIZIZ = C1748730vbj.LIZIZ(interfaceC1748810vbrLIZ, "lib_track_builtin_lane_business");
            } else {
                laneParamsLIZIZ = null;
            }
            if (brickInfo == null) {
                str = null;
            } else {
                Uri.Builder builderBuildUpon = UriProtector.parse(brickInfo.brickLynxSchema).buildUpon();
                str = "";
                if (builderBuildUpon != null) {
                    C1054004Ag c1054004Ag = c04hr.LIZ.LLJLILLLLZIIL;
                    if (c1054004Ag == null || (concurrentHashMap4 = c1054004Ag.LIZIZ) == null || (obj10 = concurrentHashMap4.get("author_id")) == null || (string = obj10.toString()) == null) {
                        string = "";
                    }
                    Uri.Builder builderAppendQueryParameter5 = builderBuildUpon.appendQueryParameter("author_id", string);
                    if (builderAppendQueryParameter5 != null && (builderAppendQueryParameter = builderAppendQueryParameter5.appendQueryParameter("product_id", c04hr.LIZ.getProductId())) != null) {
                        ProductPackStruct productPackStruct2 = c04hr.LIZ.LLJILLL;
                        if (productPackStruct2 == null || (sellerInfo = productPackStruct2.sellerInfo) == null || (str2 = sellerInfo.sellerId) == null) {
                            str2 = "";
                        }
                        Uri.Builder builderAppendQueryParameter6 = builderAppendQueryParameter.appendQueryParameter("shop_id", str2);
                        if (builderAppendQueryParameter6 != null) {
                            ProductPackStruct productPackStruct3 = c04hr.LIZ.LLJILLL;
                            if (productPackStruct3 != null && (list = productPackStruct3.skus) != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (SkuItem skuItem : list) {
                                    SkuSupply skuSupply = skuItem.skuSupply;
                                    if (skuSupply != null && skuSupply.productId != null) {
                                        arrayList2.add(skuItem);
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                                Iterator it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    SkuSupply skuSupply2 = ((SkuItem) it3.next()).skuSupply;
                                    if (skuSupply2 != null) {
                                        str3 = skuSupply2.productId;
                                    } else {
                                        str3 = null;
                                    }
                                    arrayList3.add(new Feed(str3, 1, null, null, null, null, null, null));
                                }
                                HashSet hashSet = new HashSet();
                                arrayList = new ArrayList();
                                for (Object obj12 : arrayList3) {
                                    if (hashSet.add(((Feed) obj12).id)) {
                                        arrayList.add(obj12);
                                    }
                                }
                            } else {
                                arrayList = C13BV.INSTANCE;
                            }
                            Uri.Builder builderAppendQueryParameter7 = builderAppendQueryParameter6.appendQueryParameter("winner_item_list", C1741890vQh.LJIIIIZZ(arrayList));
                            if (builderAppendQueryParameter7 != null) {
                                if (laneParamsLIZIZ != null) {
                                    obj = laneParamsLIZIZ.get((Object) "enter_from_info");
                                } else {
                                    obj = null;
                                }
                                Uri.Builder builderAppendQueryParameter8 = builderAppendQueryParameter7.appendQueryParameter("enter_from_info", String.valueOf(obj));
                                if (builderAppendQueryParameter8 != null) {
                                    C1054004Ag c1054004Ag2 = c04hr.LIZ.LLJLILLLLZIIL;
                                    if (c1054004Ag2 == null || (concurrentHashMap3 = c1054004Ag2.LIZIZ) == null || (obj2 = concurrentHashMap3.get("enter_from")) == null) {
                                        C1054004Ag c1054004Ag3 = c04hr.LIZ.LLJLILLLLZIIL;
                                        if (c1054004Ag3 != null && (concurrentHashMap = c1054004Ag3.LIZIZ) != null) {
                                            obj2 = concurrentHashMap.get("enter_from_info");
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    Uri.Builder builderAppendQueryParameter9 = builderAppendQueryParameter8.appendQueryParameter("enter_from", String.valueOf(obj2));
                                    if (builderAppendQueryParameter9 != null) {
                                        C1054004Ag c1054004Ag4 = c04hr.LIZ.LLJLILLLLZIIL;
                                        if (c1054004Ag4 != null && (concurrentHashMap2 = c1054004Ag4.LIZIZ) != null) {
                                            obj3 = concurrentHashMap2.get("previous_page");
                                        } else {
                                            obj3 = null;
                                        }
                                        Uri.Builder builderAppendQueryParameter10 = builderAppendQueryParameter9.appendQueryParameter("previous_page", String.valueOf(obj3));
                                        if (builderAppendQueryParameter10 != null) {
                                            if (laneParamsLIZIZ != null) {
                                                obj4 = laneParamsLIZIZ.get((Object) "traffic_source");
                                            } else {
                                                obj4 = null;
                                            }
                                            if (!(obj4 instanceof Integer)) {
                                                obj4 = null;
                                            }
                                            Uri.Builder builderAppendQueryParameter11 = builderAppendQueryParameter10.appendQueryParameter("traffic_source", String.valueOf(obj4));
                                            if (builderAppendQueryParameter11 != null) {
                                                if (laneParamsLIZIZ != null) {
                                                    obj5 = laneParamsLIZIZ.get((Object) "traffic_source_list");
                                                } else {
                                                    obj5 = null;
                                                }
                                                if ((obj5 instanceof List) && obj5 != null) {
                                                    strLJIIIIZZ = C1741890vQh.LJIIIIZZ(obj5);
                                                } else {
                                                    strLJIIIIZZ = null;
                                                }
                                                Uri.Builder builderAppendQueryParameter12 = builderAppendQueryParameter11.appendQueryParameter("traffic_source_list", strLJIIIIZZ);
                                                if (builderAppendQueryParameter12 != null && (builderAppendQueryParameter2 = builderAppendQueryParameter12.appendQueryParameter("is_add_cart", String.valueOf(c04hr.LIZ.LLLJL ? 1 : 0))) != null) {
                                                    if (laneParamsLIZIZ != null) {
                                                        obj6 = laneParamsLIZIZ.get((Object) "first_source_page");
                                                    } else {
                                                        obj6 = null;
                                                    }
                                                    Uri.Builder builderAppendQueryParameter13 = builderAppendQueryParameter2.appendQueryParameter("first_source_page", String.valueOf(obj6));
                                                    if (builderAppendQueryParameter13 != null) {
                                                        if (laneParamsLIZIZ != null) {
                                                            obj7 = laneParamsLIZIZ.get((Object) "track_id");
                                                        } else {
                                                            obj7 = null;
                                                        }
                                                        Uri.Builder builderAppendQueryParameter14 = builderAppendQueryParameter13.appendQueryParameter("track_id", String.valueOf(obj7));
                                                        if (builderAppendQueryParameter14 != null) {
                                                            if (laneParamsLIZIZ != null) {
                                                                obj8 = laneParamsLIZIZ.get((Object) "first_track_id");
                                                            } else {
                                                                obj8 = null;
                                                            }
                                                            Uri.Builder builderAppendQueryParameter15 = builderAppendQueryParameter14.appendQueryParameter("first_track_id", String.valueOf(obj8));
                                                            if (builderAppendQueryParameter15 != null) {
                                                                if (laneParamsLIZIZ == null || (obj9 = laneParamsLIZIZ.get((Object) "request_id")) == null || (string2 = obj9.toString()) == null) {
                                                                    string2 = "";
                                                                }
                                                                Uri.Builder builderAppendQueryParameter16 = builderAppendQueryParameter15.appendQueryParameter("request_id", string2);
                                                                if (builderAppendQueryParameter16 != null && (builderAppendQueryParameter3 = builderAppendQueryParameter16.appendQueryParameter("context_video_id", c04hr.LIZ.UR2("video_id"))) != null && (builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("context_room_id", c04hr.LIZ.UR2("room_id"))) != null) {
                                                                    Integer num = c04hr.LIZ.LLZLLLL;
                                                                    if (num != null) {
                                                                        string3 = num.toString();
                                                                    } else {
                                                                        string3 = null;
                                                                    }
                                                                    Uri.Builder builderAppendQueryParameter17 = builderAppendQueryParameter4.appendQueryParameter("bottom_bar_height", string3);
                                                                    if (builderAppendQueryParameter17 != null && (uriBuild = builderAppendQueryParameter17.build()) != null && (string4 = uriBuild.toString()) != null) {
                                                                        str = string4;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (Intrinsics.LJFF(c1752600vhy.LLILZLL, "2.0.0") && str != null) {
                c1752600vhy.LLILZ = str;
            }
        }
        int i2 = c1752600vhy.LLILZIL;
        if (i2 != 2) {
            if (i2 != 3) {
                i = 0;
            } else {
                i = -1;
            }
        } else {
            i = -2;
        }
        this.LLJJJIL = i;
        C786410Ut5.W5(this.itemView, new FrameLayout.LayoutParams(-1, this.LLJJJIL));
        this.LLJJJ = c1752600vhy.LL;
        if (this.LLJJIJIL == null) {
            View view2 = this.itemView;
            if ((view2 instanceof C1752630vi1) && (c1752630vi1 = (C1752630vi1) view2) != null) {
                int i3 = this.LLJJJIL;
                String str4 = e6().a.LLIZLLLIL;
                c1752630vi1.LLILZ = c1752600vhy.LLILLL;
                c1752630vi1.LLILLL = c1752600vhy.LL;
                c1752630vi1.LLILZIL = c1752600vhy.LLILZ;
                c1752630vi1.LLILZLL = str4;
                if (c1752630vi1.LLILLJJLI == null) {
                    Context context = c1752630vi1.getContext();
                    C099G c099gLIZIZ = C23250099c.LIZIZ(LifecycleOwnerKt.getLifecycleScope(C948503nH.LIZIZ(c1752630vi1.LL)), null, null, new C384601eW(c1752630vi1, null), 3);
                    if (AnonymousClass0405.LIZIZ) {
                        mapLIZJ = C2097908Jt.LIZJ(new Pair("pdp_container", "us"));
                    } else {
                        mapLIZJ = null;
                    }
                    C1548750qPB c1548750qPB = C1548750qPB.LIZ;
                    String str5 = c1752630vi1.LLILZLL;
                    String str6 = c1752600vhy.LLILZ;
                    String str7 = c1752630vi1.LLILZ;
                    if (str7 == null) {
                        templateDataLJIIIIZZ = null;
                    } else {
                        templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str7);
                    }
                    c1752630vi1.LLILLJJLI = C1548750qPB.LIZ(c1548750qPB, context, str5, str6, templateDataLJIIIIZZ, c099gLIZIZ, mapLIZJ, null, null, 192);
                }
                if (c1752630vi1.getChildCount() == 0) {
                    c1752630vi1.addView(c1752630vi1.LLILLJJLI, new FrameLayout.LayoutParams(-1, i3));
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = c1752630vi1.LLILLJJLI;
                this.LLJJIJIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 != null) {
                    kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.getKitView();
                } else {
                    kitView = null;
                }
                if ((kitView instanceof C1537710q7N) && (c1537710q7N = (C1537710q7N) kitView) != null && (hybridContext = c1537710q7N.getHybridContext()) != null && (interfaceC1531560pxS = hybridContext.hybridParams) != null && (mapLJFF = interfaceC1531560pxS.LJFF()) != null) {
                    obj11 = mapLJFF.get("usePreload");
                }
                if (!Intrinsics.LJFF(obj11, "1") && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = c1752630vi1.LLILLJJLI) != null) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.LJIIIIZZ();
                }
            }
        } else {
            C1752630vi1 c1752630vi12 = (C1752630vi1) this.itemView;
            int i4 = this.LLJJJIL;
            String str8 = c1752600vhy.LLILLL;
            c1752630vi12.getClass();
            if (str8 != null) {
                templateDataLJIIIIZZ2 = TemplateData.LJIIIIZZ(str8);
            }
            if (!Intrinsics.LJFF(c1752600vhy.LLILLL, c1752630vi12.LLILZ) && Intrinsics.LJFF(c1752600vhy.LLILZ, c1752630vi12.LLILZIL)) {
                if (c1752630vi12.LLILLL == EnumC1752690vi7.GUESS_U_LIKE.getValue() && templateDataLJIIIIZZ2 != null) {
                    C324990Cob.LIZ(templateDataLJIIIIZZ2, c1752630vi12.LLIZ);
                }
            } else if (!Intrinsics.LJFF(c1752600vhy.LLILZ, c1752630vi12.LLILZIL) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1752630vi12.LLILLJJLI) != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJLIJ(templateDataLJIIIIZZ2, c1752600vhy.LLILZ, false);
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 = c1752630vi12.LLILLJJLI;
            if ((sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 == null || (layoutParams = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.getLayoutParams()) == null || i4 != layoutParams.height) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c1752630vi12.LLILLJJLI) != null) {
                C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, new FrameLayout.LayoutParams(-1, i4));
            }
            c1752630vi12.LLILZ = c1752600vhy.LLILLL;
            c1752630vi12.LLILLL = c1752600vhy.LL;
            c1752630vi12.LLILZIL = c1752600vhy.LLILZ;
        }
        e6().a.LLJI = this.LLJJIJIL;
    }

    public PdpLynxCardVH(ViewGroup viewGroup, Fragment fragment, View view) {
        Context context;
        if (view == null) {
            if (C1751660vgS.LIZ()) {
                C824830WXh c824830WXh = new C824830WXh(viewGroup.getContext());
                c824830WXh.LL = new WeakReference<>(fragment);
                context = c824830WXh;
            } else {
                context = viewGroup.getContext();
            }
            view = new C1752630vi1(context, fragment);
        }
        super(view);
        this.LLJJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 462));
    }
}
