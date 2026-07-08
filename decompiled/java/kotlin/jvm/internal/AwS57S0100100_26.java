package kotlin.jvm.internal;

import X.C03IT;
import X.C09AY;
import X.C1018503yZ;
import X.C1177960gl8;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1699720uKg;
import X.C1728460v52;
import X.C1728990v5t;
import X.C1730290v7z;
import X.C1744320vUc;
import X.C1745290vWB;
import X.C1746690vYR;
import X.C20441214yg;
import X.C21651819oS;
import X.C2188811AlT;
import X.C2327809Ae;
import X.C384050F3z;
import X.C413120GHu;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC1699740uKi;
import X.InterfaceC1747020vYy;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressLocation;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.map2.AddressMapDetailFragment2;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.identity.AddressIdentityAssem;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS57S0100100_26 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS57S0100100_26 awS57S0100100_26, Object obj) {
        Integer numLIZJ;
        AddressLocation addressLocation;
        String str;
        String str2;
        String str3;
        Double dLJII;
        float fIntValue;
        AddressLocation addressLocation2;
        Integer num;
        Integer num2;
        Icon icon;
        Image imageRequireImage;
        C03IT thumbFirstImageUrlModel;
        int iIntValue;
        int iIntValue2;
        String string;
        InterfaceC1747020vYy interfaceC1747020vYy = (InterfaceC1747020vYy) obj;
        AddressMapDetailFragment addressMapDetailFragment = (AddressMapDetailFragment) awS57S0100100_26.l0;
        addressMapDetailFragment.LLILZLL = interfaceC1747020vYy;
        C21651819oS c21651819oS = addressMapDetailFragment.LLJJLIIIJLLLLLLLZ;
        if (c21651819oS != null) {
            c21651819oS.setMap(interfaceC1747020vYy);
        }
        AddressMapDetailFragment addressMapDetailFragment2 = (AddressMapDetailFragment) awS57S0100100_26.l0;
        Context context = addressMapDetailFragment2.getContext();
        Double dLJII2 = null;
        if (context != null) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a1d, context);
        } else {
            numLIZJ = null;
        }
        TuxTextView tuxTextView = addressMapDetailFragment2.LLJILJIL;
        if (tuxTextView != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
            if (numLIZJ != null) {
                gradientDrawable.setColor(numLIZJ.intValue());
            }
            tuxTextView.setBackground(gradientDrawable);
        }
        InputItemData inputItemData = addressMapDetailFragment2.ZR().LLIZLLLIL;
        if (inputItemData != null) {
            addressLocation = inputItemData.addressLocation;
        } else {
            addressLocation = null;
        }
        TuxTextView tuxTextView2 = addressMapDetailFragment2.LLJILJIL;
        if (tuxTextView2 != null) {
            if (addressLocation == null || (string = addressLocation.bubbleText) == null) {
                Context context2 = addressMapDetailFragment2.getContext();
                if (context2 != null) {
                    string = context2.getString(2131847068);
                } else {
                    string = null;
                }
            }
            tuxTextView2.setText(string);
        }
        Context context3 = addressMapDetailFragment2.getContext();
        if (context3 != null) {
            View view = addressMapDetailFragment2.LLJILLL;
            if (view != null) {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1d, context3);
                if (numLIZJ2 != null) {
                    iIntValue = numLIZJ2.intValue();
                } else {
                    iIntValue = -1;
                }
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1a, context3);
                if (numLIZJ3 != null) {
                    iIntValue2 = numLIZJ3.intValue();
                } else {
                    iIntValue2 = -7829368;
                }
                view.setBackground(new C413120GHu(iIntValue, iIntValue2, C960203pA.LIZIZ(context3)));
            }
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.g2, context3);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZ = R.raw.icon_location_north_east_fill;
            c419910GdJ.LIZLLL = numLIZJ4;
            c419910GdJ.LJ = Integer.valueOf(R.attr.g2);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context3);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context3));
            TuxIconView tuxIconView = addressMapDetailFragment2.LLJJI;
            if (tuxIconView != null) {
                tuxIconView.setImageDrawable(layerDrawableLJIILIIL);
            }
            if (addressLocation != null && (icon = addressLocation.pinPointIcon) != null && (imageRequireImage = icon.requireImage(context3)) != null && (thumbFirstImageUrlModel = imageRequireImage.toThumbFirstImageUrlModel()) != null) {
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(thumbFirstImageUrlModel);
                c1331670kl3LJIIJ.LJJI(addressMapDetailFragment2.LLJIJIL);
                C786410Ut5.h3(c1331670kl3LJIIJ);
            }
        }
        TuxIconView tuxIconView2 = addressMapDetailFragment2.LLJJI;
        if (tuxIconView2 != null) {
            C786410Ut5.I7(new AjS44S0200000_26(addressMapDetailFragment2, addressLocation, 39), tuxIconView2);
        }
        TuxIconView tuxIconView3 = addressMapDetailFragment2.LLJIJIL;
        if (tuxIconView3 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
        }
        ViewGroup viewGroup = addressMapDetailFragment2.LLJILJILJ;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
        TuxIconView tuxIconView4 = addressMapDetailFragment2.LLJJI;
        if (tuxIconView4 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
        }
        ViewGroup viewGroup2 = addressMapDetailFragment2.LLJJ;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
        AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams = addressMapDetailFragment2.ZR().LLILZIL;
        if (addressMapDetailEnterParams != null) {
            str = addressMapDetailEnterParams.previousPage;
        } else {
            str = null;
        }
        C1745290vWB.LIZJ(str, "select_current_location");
        AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams2 = ((AddressMapDetailFragment) awS57S0100100_26.l0).LLILZIL;
        if (addressMapDetailEnterParams2 != null && (num2 = addressMapDetailEnterParams2.pageType) != null && num2.intValue() == 1) {
            str2 = "address_map_page";
        } else {
            str2 = "order_submit_map_popup";
        }
        AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams3 = ((AddressMapDetailFragment) awS57S0100100_26.l0).LLILZIL;
        if (addressMapDetailEnterParams3 != null) {
            str3 = addressMapDetailEnterParams3.enterFrom;
        } else {
            str3 = null;
        }
        C1745290vWB.LIZLLL(System.currentTimeMillis() - awS57S0100100_26.j1, str2, str3);
        Address address = ((AddressMapDetailFragment) awS57S0100100_26.l0).ZR().LLIZ;
        if (address != null) {
            AddressMapDetailFragment addressMapDetailFragment3 = (AddressMapDetailFragment) awS57S0100100_26.l0;
            String str4 = address.latitude;
            if (str4 != null) {
                dLJII = C2327809Ae.LJII(str4);
            } else {
                dLJII = null;
            }
            String str5 = address.longitude;
            if (str5 != null) {
                dLJII2 = C2327809Ae.LJII(str5);
            }
            if (dLJII != null && dLJII2 != null) {
                C1177960gl8 c1177960gl8 = new C1177960gl8(dLJII.doubleValue(), dLJII2.doubleValue());
                addressMapDetailFragment3.LLIZ = c1177960gl8;
                InputItemData inputItemData2 = addressMapDetailFragment3.ZR().LLIZLLLIL;
                if (inputItemData2 != null && (addressLocation2 = inputItemData2.addressLocation) != null && (num = addressLocation2.defaultZoomLevel) != null) {
                    fIntValue = num.intValue();
                } else {
                    fIntValue = 19.0f;
                }
                AddressMapDetailFragment.dS(addressMapDetailFragment3, c1177960gl8, Float.valueOf(fIntValue));
            }
        }
        AddressMapDetailFragment addressMapDetailFragment4 = (AddressMapDetailFragment) awS57S0100100_26.l0;
        InterfaceC1747020vYy interfaceC1747020vYy2 = addressMapDetailFragment4.LLILZLL;
        if (interfaceC1747020vYy2 != null) {
            interfaceC1747020vYy2.LIZJ(new AwS605S0100000_26(addressMapDetailFragment4, 181));
        }
        AddressMapDetailFragment addressMapDetailFragment5 = (AddressMapDetailFragment) awS57S0100100_26.l0;
        InterfaceC1747020vYy interfaceC1747020vYy3 = addressMapDetailFragment5.LLILZLL;
        if (interfaceC1747020vYy3 != null) {
            interfaceC1747020vYy3.LIZLLL(new AwS605S0100000_26(addressMapDetailFragment5, 182));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS57S0100100_26 awS57S0100100_26, Object obj) {
        int size;
        District district;
        List<District> list;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("item_num", Integer.valueOf(laneParams.size()));
        laneParams.plusAssign("stay_time", Long.valueOf(awS57S0100100_26.j1));
        laneParams.plusAssign("drop_down_list_area", ((DistrictFragment) awS57S0100100_26.l0).mS().LLJJI);
        C1744320vUc<District> c1744320vUc = ((DistrictFragment) awS57S0100100_26.l0).LLLII;
        if (c1744320vUc != null && (district = c1744320vUc.LIZ) != null && (list = district.parRegions) != null) {
            size = list.size() + 1;
        } else {
            size = 0;
        }
        laneParams.plusAssign("max_region_level", Integer.valueOf(size));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS57S0100100_26 awS57S0100100_26, Object obj) {
        Throwable th = (Throwable) obj;
        RootData rootData = ((C1728990v5t) awS57S0100100_26.l0).LL;
        C1730290v7z.LIZ.getClass();
        String strLJIIIZ = C1730290v7z.LJIIIZ();
        if (strLJIIIZ == null) {
            strLJIIIZ = "";
        }
        C1728460v52.LIZ(rootData, "", strLJIIIZ, "template_msg_update", "display_total_fail", "display_total", false, Long.valueOf(System.currentTimeMillis() - awS57S0100100_26.j1), null, th.getMessage());
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS57S0100100_26 awS57S0100100_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        Map<String, ? extends Object> map = ((AddressIdentityAssem) awS57S0100100_26.l0).Ho().LLIZ;
        if (map != null) {
            laneParams.withNotCheckParams(map);
        }
        laneParams.putAll(((AddressIdentityAssem) awS57S0100100_26.l0).Go());
        laneParams.plusAssign("stay_time", String.valueOf(awS57S0100100_26.j1));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS57S0100100_26 awS57S0100100_26, Object obj) {
        InterfaceC1699740uKi interfaceC1699740uKi;
        long jLongValue = ((Number) obj).longValue();
        ((C1699720uKg) awS57S0100100_26.l0).getClass();
        long j = jLongValue / 1000;
        if (jLongValue - (1000 * j) > 600) {
            j++;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("highPrecisionTimer onTick: millisLeft ");
        sbLIZ.append(jLongValue);
        sbLIZ.append(", second ");
        sbLIZ.append(j);
        sbLIZ.append(", countInSecs ");
        sbLIZ.append(awS57S0100100_26.j1);
        C20441214yg.LJ("MultiMatchUtils", C2188811AlT.LIZIZ(sbLIZ));
        if (j != awS57S0100100_26.j1 && (interfaceC1699740uKi = ((C1699720uKg) awS57S0100100_26.l0).LIZ) != null) {
            interfaceC1699740uKi.LJJI(j);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS57S0100100_26 awS57S0100100_26, Object obj) {
        Throwable th = (Throwable) obj;
        RootData rootData = (RootData) awS57S0100100_26.l0;
        C1730290v7z.LIZ.getClass();
        String strLJIIIZ = C1730290v7z.LJIIIZ();
        if (strLJIIIZ == null) {
            strLJIIIZ = "";
        }
        C1728460v52.LIZ(rootData, "", strLJIIIZ, "template_msg_update", "display_total_fail", "display_total", false, Long.valueOf(System.currentTimeMillis() - awS57S0100100_26.j1), null, th.getMessage());
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS57S0100100_26 awS57S0100100_26, Object obj) {
        Integer numLIZJ;
        AddressLocation addressLocation;
        String str;
        String str2;
        Double dLJII;
        float fIntValue;
        AddressLocation addressLocation2;
        Integer num;
        Integer num2;
        Icon icon;
        Image imageRequireImage;
        C03IT thumbFirstImageUrlModel;
        int iIntValue;
        int iIntValue2;
        String string;
        AddressMapDetailFragment2 addressMapDetailFragment2 = (AddressMapDetailFragment2) awS57S0100100_26.l0;
        addressMapDetailFragment2.LLILZIL = (InterfaceC1747020vYy) obj;
        Context context = addressMapDetailFragment2.getContext();
        Double dLJII2 = null;
        if (context != null) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a1d, context);
        } else {
            numLIZJ = null;
        }
        TuxTextView tuxTextView = addressMapDetailFragment2.LLJIJIL;
        if (tuxTextView != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
            if (numLIZJ != null) {
                gradientDrawable.setColor(numLIZJ.intValue());
            }
            tuxTextView.setBackground(gradientDrawable);
        }
        InputItemData inputItemData = addressMapDetailFragment2.WR().LLILLL;
        if (inputItemData != null) {
            addressLocation = inputItemData.addressLocation;
        } else {
            addressLocation = null;
        }
        TuxTextView tuxTextView2 = addressMapDetailFragment2.LLJIJIL;
        if (tuxTextView2 != null) {
            if (addressLocation == null || (string = addressLocation.bubbleText) == null) {
                Context context2 = addressMapDetailFragment2.getContext();
                if (context2 != null) {
                    string = context2.getString(2131847068);
                } else {
                    string = null;
                }
            }
            tuxTextView2.setText(string);
        }
        Context context3 = addressMapDetailFragment2.getContext();
        if (context3 != null) {
            View view = addressMapDetailFragment2.LLJILJILJ;
            if (view != null) {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1d, context3);
                if (numLIZJ2 != null) {
                    iIntValue = numLIZJ2.intValue();
                } else {
                    iIntValue = -1;
                }
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1a, context3);
                if (numLIZJ3 != null) {
                    iIntValue2 = numLIZJ3.intValue();
                } else {
                    iIntValue2 = -7829368;
                }
                view.setBackground(new C413120GHu(iIntValue, iIntValue2, C960203pA.LIZIZ(context3)));
            }
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.g2, context3);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZ = R.raw.icon_scope;
            c419910GdJ.LIZLLL = numLIZJ4;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a00);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context3);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context3));
            TuxIconView tuxIconView = addressMapDetailFragment2.LLJJ;
            if (tuxIconView != null) {
                tuxIconView.setImageDrawable(layerDrawableLJIILIIL);
            }
            if (addressLocation != null && (icon = addressLocation.pinPointIcon) != null && (imageRequireImage = icon.requireImage(context3)) != null && (thumbFirstImageUrlModel = imageRequireImage.toThumbFirstImageUrlModel()) != null) {
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(thumbFirstImageUrlModel);
                c1331670kl3LJIIJ.LJJI(addressMapDetailFragment2.LLJI);
                C786410Ut5.h3(c1331670kl3LJIIJ);
            }
        }
        TuxIconView tuxIconView2 = addressMapDetailFragment2.LLJJ;
        if (tuxIconView2 != null) {
            C786410Ut5.I7(new AjS44S0200000_26(addressMapDetailFragment2, addressLocation, 47), tuxIconView2);
        }
        TuxIconView tuxIconView3 = addressMapDetailFragment2.LLJI;
        if (tuxIconView3 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
        }
        ViewGroup viewGroup = addressMapDetailFragment2.LLJILJIL;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
        TuxIconView tuxIconView4 = addressMapDetailFragment2.LLJJ;
        if (tuxIconView4 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
        }
        ViewGroup viewGroup2 = addressMapDetailFragment2.LLJILLL;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
        C1746690vYR.LIZIZ(C1746690vYR.LIZ, "select_current_location");
        AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams = ((AddressMapDetailFragment2) awS57S0100100_26.l0).LLILZ;
        if (addressMapDetailEnterParams != null && (num2 = addressMapDetailEnterParams.pageType) != null && num2.intValue() == 1) {
            str = "address_map_page";
        } else {
            str = "order_submit_map_popup";
        }
        AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams2 = ((AddressMapDetailFragment2) awS57S0100100_26.l0).LLILZ;
        if (addressMapDetailEnterParams2 != null) {
            str2 = addressMapDetailEnterParams2.enterFrom;
        } else {
            str2 = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - awS57S0100100_26.j1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Scene.SCENE_SERVICE, str);
        linkedHashMap.put("type", "googleMap");
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("enter_from", str2);
        linkedHashMap.put("duration", Long.valueOf(jCurrentTimeMillis));
        C1018503yZ.LIZIZ("tiktokec_address_map_render", linkedHashMap, false);
        Address address = ((AddressMapDetailFragment2) awS57S0100100_26.l0).WR().LLILLJJLI;
        if (address != null) {
            AddressMapDetailFragment2 addressMapDetailFragment22 = (AddressMapDetailFragment2) awS57S0100100_26.l0;
            String str3 = address.latitude;
            if (str3 != null) {
                dLJII = C2327809Ae.LJII(str3);
            } else {
                dLJII = null;
            }
            String str4 = address.longitude;
            if (str4 != null) {
                dLJII2 = C2327809Ae.LJII(str4);
            }
            if (dLJII != null && dLJII2 != null) {
                C1177960gl8 c1177960gl8 = new C1177960gl8(dLJII.doubleValue(), dLJII2.doubleValue());
                addressMapDetailFragment22.LLILZLL = c1177960gl8;
                InputItemData inputItemData2 = addressMapDetailFragment22.WR().LLILLL;
                if (inputItemData2 != null && (addressLocation2 = inputItemData2.addressLocation) != null && (num = addressLocation2.defaultZoomLevel) != null) {
                    fIntValue = num.intValue();
                } else {
                    fIntValue = 19.0f;
                }
                AddressMapDetailFragment2.ZR(addressMapDetailFragment22, c1177960gl8, Float.valueOf(fIntValue));
            }
        }
        AddressMapDetailFragment2 addressMapDetailFragment23 = (AddressMapDetailFragment2) awS57S0100100_26.l0;
        InterfaceC1747020vYy interfaceC1747020vYy = addressMapDetailFragment23.LLILZIL;
        if (interfaceC1747020vYy != null) {
            interfaceC1747020vYy.LIZJ(new AwS605S0100000_26(addressMapDetailFragment23, 798));
        }
        AddressMapDetailFragment2 addressMapDetailFragment24 = (AddressMapDetailFragment2) awS57S0100100_26.l0;
        InterfaceC1747020vYy interfaceC1747020vYy2 = addressMapDetailFragment24.LLILZIL;
        if (interfaceC1747020vYy2 != null) {
            interfaceC1747020vYy2.LIZLLL(new AwS605S0100000_26(addressMapDetailFragment24, 799));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0100100_26(long j, AddressMapDetailFragment addressMapDetailFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = addressMapDetailFragment;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0100100_26(long j, DistrictFragment districtFragment, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = districtFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0100100_26(C1699720uKg c1699720uKg, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1699720uKg;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0100100_26(C1728990v5t c1728990v5t, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1728990v5t;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0100100_26(AddressMapDetailFragment2 addressMapDetailFragment2, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = addressMapDetailFragment2;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0100100_26(AddressIdentityAssem addressIdentityAssem, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = addressIdentityAssem;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0100100_26(RootData rootData, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = rootData;
        this.j1 = j;
    }
}
