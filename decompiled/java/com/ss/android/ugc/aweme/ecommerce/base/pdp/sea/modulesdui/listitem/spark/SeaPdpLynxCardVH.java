package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.spark;

import X.C01GW;
import X.C04AG;
import X.C099G;
import X.C10515049h;
import X.C1054104Ah;
import X.C13BV;
import X.C13LE;
import X.C1537480q70;
import X.C1537710q7N;
import X.C15438062q;
import X.C1548750qPB;
import X.C1741890vQh;
import X.C1743750vTh;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C1751660vgS;
import X.C1752610vhz;
import X.C1752620vi0;
import X.C1752640vi2;
import X.C1752650vi3;
import X.C19719912Dl;
import X.C23250099c;
import X.C324990Cob;
import X.C384101eR;
import X.C452501pT;
import X.C786410Ut5;
import X.C824830WXh;
import X.C948503nH;
import X.EnumC1752690vi7;
import X.InterfaceC1531560pxS;
import X.InterfaceC1541990qEH;
import X.InterfaceC1748810vbr;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSupply;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpLynxCardVH extends AbsBrickFullSpanVH<C1752610vhz> {
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public final C01GW LLJJJJ;
    public boolean LLJJJJJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void I5() {
        C1752640vi2 c1752640vi2 = new C1752640vi2(d6().getProductId());
        c1752640vi2.LIZ.put("brick_name", Integer.valueOf(this.LLJJJ));
        c1752640vi2.LIZIZ();
        d6().LLZIL.LIZIZ(this.LLJJJ);
        super.I5();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void P5() {
        C1752650vi3 c1752650vi3 = new C1752650vi3(d6().getProductId());
        c1752650vi3.LIZ.put("brick_name", Integer.valueOf(this.LLJJJ));
        c1752650vi3.LIZIZ();
        super.P5();
    }

    public final SeaPdpViewModel d6() {
        return (SeaPdpViewModel) this.LLJJJJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJIJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        this.LLJJIJIL = null;
        d6().LLZIL.LLJI = null;
        C1743750vTh.LIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.ArrayList] */
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
    /* JADX INFO: renamed from: e6, reason: merged with bridge method [inline-methods] */
    public final void rr(C1752610vhz c1752610vhz) throws JSONException {
        int i;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2;
        ViewGroup.LayoutParams layoutParams;
        C1752620vi0 c1752620vi0;
        InterfaceC1541990qEH kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3;
        C1537710q7N c1537710q7N;
        C1537480q70 hybridContext;
        InterfaceC1531560pxS interfaceC1531560pxS;
        Map<String, Object> mapLJFF;
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
        Uri uriBuild;
        String string3;
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
        super.rr(c1752610vhz);
        TemplateData templateDataLJIIIIZZ2 = null;
        obj = null;
        obj = null;
        obj = null;
        obj = null;
        Object obj11 = null;
        if (c1752610vhz.LL == EnumC1752690vi7.GUESS_U_LIKE.getValue()) {
            C04AG c04ag = d6().LLLLLL;
            View view = this.itemView;
            ProductPackStruct productPackStruct = c04ag.LIZ.LLJIJIL;
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
                    C1054104Ah c1054104Ah = c04ag.LIZ.LLJLIL;
                    if (c1054104Ah == null || (concurrentHashMap4 = c1054104Ah.LIZIZ) == null || (obj10 = concurrentHashMap4.get("author_id")) == null || (string = obj10.toString()) == null) {
                        string = "";
                    }
                    Uri.Builder builderAppendQueryParameter5 = builderBuildUpon.appendQueryParameter("author_id", string);
                    if (builderAppendQueryParameter5 != null && (builderAppendQueryParameter = builderAppendQueryParameter5.appendQueryParameter("product_id", c04ag.LIZ.getProductId())) != null) {
                        ProductPackStruct productPackStruct2 = c04ag.LIZ.LLJIJIL;
                        if (productPackStruct2 == null || (sellerInfo = productPackStruct2.sellerInfo) == null || (str2 = sellerInfo.sellerId) == null) {
                            str2 = "";
                        }
                        Uri.Builder builderAppendQueryParameter6 = builderAppendQueryParameter.appendQueryParameter("shop_id", str2);
                        if (builderAppendQueryParameter6 != null) {
                            ProductPackStruct productPackStruct3 = c04ag.LIZ.LLJIJIL;
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
                                    C1054104Ah c1054104Ah2 = c04ag.LIZ.LLJLIL;
                                    if (c1054104Ah2 == null || (concurrentHashMap3 = c1054104Ah2.LIZIZ) == null || (obj2 = concurrentHashMap3.get("enter_from")) == null) {
                                        C1054104Ah c1054104Ah3 = c04ag.LIZ.LLJLIL;
                                        if (c1054104Ah3 != null && (concurrentHashMap = c1054104Ah3.LIZIZ) != null) {
                                            obj2 = concurrentHashMap.get("enter_from_info");
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    Uri.Builder builderAppendQueryParameter9 = builderAppendQueryParameter8.appendQueryParameter("enter_from", String.valueOf(obj2));
                                    if (builderAppendQueryParameter9 != null) {
                                        C1054104Ah c1054104Ah4 = c04ag.LIZ.LLJLIL;
                                        if (c1054104Ah4 != null && (concurrentHashMap2 = c1054104Ah4.LIZIZ) != null) {
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
                                                if (builderAppendQueryParameter12 != null && (builderAppendQueryParameter2 = builderAppendQueryParameter12.appendQueryParameter("is_add_cart", String.valueOf(c04ag.LIZ.LLLJL ? 1 : 0))) != null) {
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
                                                                if (builderAppendQueryParameter16 != null && (builderAppendQueryParameter3 = builderAppendQueryParameter16.appendQueryParameter("context_video_id", c04ag.LIZ.YR2("video_id"))) != null && (builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("context_room_id", c04ag.LIZ.YR2("room_id"))) != null) {
                                                                    c04ag.LIZ.getClass();
                                                                    Uri.Builder builderAppendQueryParameter17 = builderAppendQueryParameter4.appendQueryParameter("bottom_bar_height", null);
                                                                    if (builderAppendQueryParameter17 != null && (uriBuild = builderAppendQueryParameter17.build()) != null && (string3 = uriBuild.toString()) != null) {
                                                                        str = string3;
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
            if (Intrinsics.LJFF(c1752610vhz.LLILZLL, "2.0.0") && str != null) {
                c1752610vhz.LLILZ = str;
            }
        }
        int i2 = c1752610vhz.LLILZIL;
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
        this.LLJJJ = c1752610vhz.LL;
        if (this.LLJJIJIL == null) {
            View view2 = this.itemView;
            if ((view2 instanceof C1752620vi0) && (c1752620vi0 = (C1752620vi0) view2) != null) {
                int i3 = this.LLJJJIL;
                String str4 = d6().LLZIL.LLIZLLLIL;
                c1752620vi0.LLILZ = c1752610vhz.LLILLL;
                c1752620vi0.LLILLL = c1752610vhz.LL;
                c1752620vi0.LLILZIL = c1752610vhz.LLILZ;
                c1752620vi0.LLILZLL = str4;
                if (c1752620vi0.LLILLJJLI == null) {
                    Context context = c1752620vi0.getContext();
                    C099G c099gLIZIZ = C23250099c.LIZIZ(LifecycleOwnerKt.getLifecycleScope(C948503nH.LIZIZ(c1752620vi0.LL)), null, null, new C384101eR(c1752620vi0, null), 3);
                    C1548750qPB c1548750qPB = C1548750qPB.LIZ;
                    String str5 = c1752620vi0.LLILZLL;
                    String str6 = c1752610vhz.LLILZ;
                    String str7 = c1752620vi0.LLILZ;
                    if (str7 == null) {
                        templateDataLJIIIIZZ = null;
                    } else {
                        templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str7);
                    }
                    c1752620vi0.LLILLJJLI = C1548750qPB.LIZ(c1548750qPB, context, str5, str6, templateDataLJIIIIZZ, c099gLIZIZ, null, null, null, 224);
                }
                if (c1752620vi0.getChildCount() == 0) {
                    c1752620vi0.addView(c1752620vi0.LLILLJJLI, new FrameLayout.LayoutParams(-1, i3));
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = c1752620vi0.LLILLJJLI;
                this.LLJJIJIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 != null) {
                    kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.getKitView();
                } else {
                    kitView = null;
                }
                if ((kitView instanceof C1537710q7N) && (c1537710q7N = (C1537710q7N) kitView) != null && (hybridContext = c1537710q7N.getHybridContext()) != null && (interfaceC1531560pxS = hybridContext.hybridParams) != null && (mapLJFF = interfaceC1531560pxS.LJFF()) != null) {
                    obj11 = mapLJFF.get("usePreload");
                }
                if (!Intrinsics.LJFF(obj11, "1") && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = c1752620vi0.LLILLJJLI) != null) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.LJIIIIZZ();
                }
            }
        } else {
            C1752620vi0 c1752620vi02 = (C1752620vi0) this.itemView;
            int i4 = this.LLJJJIL;
            String str8 = c1752610vhz.LLILLL;
            c1752620vi02.getClass();
            if (str8 != null) {
                templateDataLJIIIIZZ2 = TemplateData.LJIIIIZZ(str8);
            }
            if (!Intrinsics.LJFF(c1752610vhz.LLILLL, c1752620vi02.LLILZ) && Intrinsics.LJFF(c1752610vhz.LLILZ, c1752620vi02.LLILZIL)) {
                if (c1752620vi02.LLILLL == EnumC1752690vi7.GUESS_U_LIKE.getValue() && templateDataLJIIIIZZ2 != null) {
                    C324990Cob.LIZ(templateDataLJIIIIZZ2, c1752620vi02.LLIZ);
                }
            } else if (!Intrinsics.LJFF(c1752610vhz.LLILZ, c1752620vi02.LLILZIL) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1752620vi02.LLILLJJLI) != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJLIJ(templateDataLJIIIIZZ2, c1752610vhz.LLILZ, false);
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 = c1752620vi02.LLILLJJLI;
            if ((sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 == null || (layoutParams = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.getLayoutParams()) == null || i4 != layoutParams.height) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c1752620vi02.LLILLJJLI) != null) {
                C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, new FrameLayout.LayoutParams(-1, i4));
            }
            c1752620vi02.LLILZ = c1752610vhz.LLILLL;
            c1752620vi02.LLILLL = c1752610vhz.LL;
            c1752620vi02.LLILZIL = c1752610vhz.LLILZ;
        }
        d6().LLZIL.LLJI = this.LLJJIJIL;
        if (!this.LLJJJJJIL) {
            C1748720vbi.LIZLLL(this.itemView, new C10515049h(), AFwS268S0000000_26.get$arr$(216));
            this.LLJJJJJIL = true;
        }
    }

    public SeaPdpLynxCardVH(ViewGroup viewGroup, ECBaseFragment eCBaseFragment) {
        Context context;
        if (C1751660vgS.LIZ()) {
            C824830WXh c824830WXh = new C824830WXh(viewGroup.getContext());
            c824830WXh.LL = new WeakReference<>(eCBaseFragment);
            context = c824830WXh;
        } else {
            context = viewGroup.getContext();
        }
        super(new C1752620vi0(context, eCBaseFragment));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 110));
    }
}
