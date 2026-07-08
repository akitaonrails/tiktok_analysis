package kotlin.jvm.internal;

import X.C049Y;
import X.C04CK;
import X.C04F1;
import X.C08HM;
import X.C08RN;
import X.C09AY;
import X.C0OM1;
import X.C10516049i;
import X.C123100dR;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1280004ze;
import X.C1388190mED;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C1390920mIc;
import X.C13LP;
import X.C1697810uHb;
import X.C1709570uaZ;
import X.C1709880ub4;
import X.C1710930ucl;
import X.C1710940ucm;
import X.C1744700vVE;
import X.C1744780vVM;
import X.C1748720vbi;
import X.C1759050vsN;
import X.C1759440vt0;
import X.C1909107dp;
import X.C1912007eI;
import X.C2188811AlT;
import X.C2414409d8;
import X.C2414809dC;
import X.C756302xN;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C806003Cw;
import X.C808003Dq;
import X.C963003pc;
import X.EnumC1742610vRr;
import X.InterfaceC1759080vsQ;
import X.InterfaceC1759090vsR;
import X.InterfaceC1759670vtN;
import X.InterfaceC2414709dB;
import X.InterfaceC921603iw;
import Y.AObjectS534S0100000_1;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpMessage;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SpecificationLink;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.desc.SeaProductSpecificationViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECTrendingListAssem;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class AwS303S0300000_26 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS303S0300000_26 awS303S0300000_26, Object obj, Object obj2) {
        BasicPopUp basicPopUp = (BasicPopUp) C1280004ze.LIZ(((InterfaceC1759080vsQ) awS303S0300000_26.l0).getBasicPopup(), BasicPopUp.class);
        C1759440vt0 c1759440vt0 = ((PdpViewModel) obj2).LLLLJ;
        final C1759050vsN c1759050vsN = (C1759050vsN) awS303S0300000_26.l2;
        c1759440vt0.LJIIIIZZ(basicPopUp, null, new InterfaceC1759670vtN() { // from class: X.0vsP
            @Override // X.InterfaceC1759670vtN
            public final void LIZ() {
            }

            @Override // X.InterfaceC1759670vtN
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1759670vtN
            public final void LIZLLL(View view) {
            }

            @Override // X.InterfaceC1759670vtN
            public final void LJ() {
            }

            @Override // X.InterfaceC1759670vtN
            public final void LJFF() {
            }

            @Override // X.InterfaceC1759670vtN
            public final void LIZJ() throws JSONException {
                InterfaceC634840OvC interfaceC634840OvC = c1759050vsN.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("state", "dismiss");
                    interfaceC634840OvC.sendEvent("ec_open_basic_bottom_sheet", jSONObject);
                }
            }
        });
        ((CompletionBlock) awS303S0300000_26.l1).onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1759090vsR.class, null), "");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS303S0300000_26 awS303S0300000_26, Object obj, Object obj2) {
        if (obj2 == EnumC1742610vRr.LOADING) {
            ((ECTrendingListAssem) awS303S0300000_26.l0).Go((GridLayoutManager) awS303S0300000_26.l1, true);
        }
        if (obj2 == EnumC1742610vRr.SUCCESS) {
            C1748720vbi.LIZLLL((View) awS303S0300000_26.l2, new C04CK() { // from class: X.0vaJ
                {
                    this.LJ = true;
                }

                @Override // X.AbstractC1748790vbp
                public final C1748850vbv LIZ() {
                    return new C1748850vbv(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]), new C1748840vbu("page_name", new C1747940vaS[0]));
                }
            }, new AwS605S0100000_26((ECTrendingListAssem) awS303S0300000_26.l0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
            ((ECTrendingListAssem) awS303S0300000_26.l0).Go((GridLayoutManager) awS303S0300000_26.l1, false);
        }
        if (obj2 == EnumC1742610vRr.NO_MORE_DATA) {
            ((ECTrendingListAssem) awS303S0300000_26.l0).Go((GridLayoutManager) awS303S0300000_26.l1, false);
            C1748720vbi.LIZLLL((View) awS303S0300000_26.l2, new C04CK() { // from class: X.0vaJ
                {
                    this.LJ = true;
                }

                @Override // X.AbstractC1748790vbp
                public final C1748850vbv LIZ() {
                    return new C1748850vbv(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]), new C1748840vbu("page_name", new C1747940vaS[0]));
                }
            }, new AwS605S0100000_26((ECTrendingListAssem) awS303S0300000_26.l0, 301));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [X.03Cw, android.view.View] */
    public static final Object invoke$2(AwS303S0300000_26 awS303S0300000_26, Object obj, Object obj2) throws Throwable {
        String str;
        Object obj3;
        PopUpMessage popUpMessage;
        List<ECRichText> list;
        SpecificationLink specificationLink = (SpecificationLink) obj;
        C1744780vVM c1744780vVM = (C1744780vVM) obj2;
        Integer num = specificationLink.specificationLinkType;
        Context applicationContext = null;
        if (num != null && num.intValue() != 1) {
            if (num.intValue() == 2 && (popUpMessage = specificationLink.popUpMsg) != null && (list = popUpMessage.contents) != null && C756302xN.LIZ(list)) {
                C1748720vbi.LIZLLL(((SeaProductSpecificationViewHolder) awS303S0300000_26.l1).itemView, new C049Y(), new AwS580S0100000_1((Specification) awS303S0300000_26.l2, 356));
                C04F1 c04f1 = ((SeaPdpViewModel) ((SeaProductSpecificationViewHolder) awS303S0300000_26.l1).LLJLILLLLZIIL.getValue()).LLLLLLL;
                final Context context = ((SeaProductSpecificationViewHolder) awS303S0300000_26.l1).itemView.getContext();
                SeaProductSpecificationViewHolder seaProductSpecificationViewHolder = (SeaProductSpecificationViewHolder) awS303S0300000_26.l1;
                ECBaseFragment eCBaseFragment = seaProductSpecificationViewHolder.LLJJIJIL;
                final PopUpMessage popUpMessage2 = specificationLink.popUpMsg;
                final boolean zLJ = C1744700vVE.LJ(seaProductSpecificationViewHolder.itemView.getContext(), null);
                c04f1.getClass();
                ?? r9 = new LinearLayout(context, zLJ, popUpMessage2) { // from class: X.03Cw
                    public final String LL = "ProductNoticeViewHolder";
                    public final PopUpMessage LLILLJJLI;

                    {
                        List<ECRichText> list2;
                        List<ECRichText> list3;
                        Icon icon;
                        Image icon2;
                        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
                        removeAllViews();
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                        setLayoutParams(layoutParams);
                        setOrientation(0);
                        C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 16);
                        this.LLILLJJLI = popUpMessage2;
                        if (popUpMessage2 != null && (icon = popUpMessage2.leadIcon) != null) {
                            SmartImageView smartImageView = new SmartImageView(getContext());
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                            C786410Ut5.G6(smartImageView, marginLayoutParams);
                            addView(smartImageView);
                            if (zLJ) {
                                icon2 = icon.getIconDark();
                            } else {
                                icon2 = icon.getIcon();
                            }
                            C1326790kdB.LIZ.getClass();
                            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(icon2);
                            c1331670kl3LIZLLL.LJJ(smartImageView);
                            C786410Ut5.h3(c1331670kl3LIZLLL);
                        }
                        LinearLayout linearLayout = new LinearLayout(getContext());
                        C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-1, -2));
                        linearLayout.setOrientation(1);
                        addView(linearLayout);
                        if (popUpMessage2 != null && (list2 = popUpMessage2.contents) != null) {
                            int i = 0;
                            for (ECRichText eCRichText : list2) {
                                int i2 = i + 1;
                                if (i >= 0) {
                                    TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
                                    C786410Ut5.R6(tuxTextView, new ViewGroup.LayoutParams(-1, -2));
                                    C0H9H.LIZJ(C0H9H.LIZIZ(4), tuxTextView);
                                    C03B0 c03b0 = new C03B0(tuxTextView, this.LL);
                                    C03B0.LIZ(c03b0, eCRichText, new AObjectS534S0100000_1(tuxTextView, 1), null, false, null, null, 124);
                                    tuxTextView.setText(c03b0.LIZJ);
                                    linearLayout.addView(tuxTextView);
                                    PopUpMessage popUpMessage3 = this.LLILLJJLI;
                                    if (popUpMessage3 != null && (list3 = popUpMessage3.contents) != null && i < list3.size() - 1) {
                                        View view = new View(getContext());
                                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, 2);
                                        C426750GoL.LJIIJ(marginLayoutParams2, view.getContext(), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 32);
                                        C786410Ut5.W5(view, marginLayoutParams2);
                                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ng, view.getContext());
                                        if (numLIZJ != null) {
                                            view.setBackgroundColor(numLIZJ.intValue());
                                        }
                                        linearLayout.addView(view);
                                    }
                                    i = i2;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        }
                    }
                };
                C0OM1 c0om1 = new C0OM1();
                C1250250idj c1250250idj = new C1250250idj();
                String str2 = popUpMessage2.title;
                if (str2 == null) {
                    str2 = "";
                }
                c1250250idj.LIZJ = str2;
                c0om1.LIZJ = c1250250idj;
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
                c1251150ifB.LIZLLL = true;
                c1251150ifB.LIZJ(new AwS545S0100000_1((C806003Cw) r9, 1824));
                c0om1.LIZIZ(c1251150ifB);
                c0om1.LIZLLL = true;
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJIL = c0om1;
                tuxSheet.LLJJJ = null;
                tuxSheet.LLJJIII = r9;
                c1390920mIc.LJIIIIZZ(0);
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJJIJIIJIL = true;
                tuxSheet2.LLJLILLLLZIIL = true;
                C808003Dq.LJFF(tuxSheet2, eCBaseFragment.getChildFragmentManager(), null, null, 12);
            }
        } else {
            C1748720vbi.LIZLLL((C1744780vVM) awS303S0300000_26.l0, new C10516049i(), AFwS268S0000000_26.get$arr$(495));
            if (c1744780vVM.LLILLL) {
                C1389890mGx c1389890mGx = new C1389890mGx(((SeaProductSpecificationViewHolder) awS303S0300000_26.l1).itemView);
                c1389890mGx.LJFF(R.raw.icon_exclamation_mark_circle_fill);
                c1389890mGx.LJII(R.attr.ee);
                c1389890mGx.LJIIIZ(2131839183);
                c1389890mGx.LIZLLL(500L);
                c1389890mGx.LJIIJJI();
            } else {
                List<String> list2 = specificationLink.urlList;
                if (list2 != null && (str = (String) C13LP.LJJJLL(list2)) != null) {
                    SeaProductSpecificationViewHolder seaProductSpecificationViewHolder2 = (SeaProductSpecificationViewHolder) awS303S0300000_26.l1;
                    if (seaProductSpecificationViewHolder2.itemView.getContext() != null && C786410Ut5.N3(seaProductSpecificationViewHolder2.itemView.getContext()) != null) {
                        C2414809dC c2414809dC = (C2414809dC) seaProductSpecificationViewHolder2.LLJLIL.getValue();
                        final Context context2 = seaProductSpecificationViewHolder2.itemView.getContext();
                        final View view = seaProductSpecificationViewHolder2.itemView;
                        final AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(c1744780vVM, 437);
                        c2414809dC.getClass();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(C08HM.LIZJ(str).substring(8, 24));
                        sbLIZ.append(".pdf");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        File file = C786450Ut9.LIZJ;
                        if (file == null || !C786450Ut9.LJ) {
                            try {
                                C786450Ut9.LIZJ = context2.getFilesDir();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                try {
                                    Class<?> cls = Class.forName("android.app.ActivityThread");
                                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                                    declaredField.setAccessible(true);
                                    obj3 = declaredField.get(objInvoke);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    PrintStream printStream = System.out;
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("Error: ");
                                    sbLIZ3.append(e.getMessage());
                                    printStream.println(C2188811AlT.LIZIZ(sbLIZ3));
                                }
                                if (obj3 instanceof Application) {
                                    applicationContext = ((Application) obj3).getApplicationContext();
                                    PrintStream printStream2 = System.out;
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("Application context obtained through ActivityThread: ");
                                    sbLIZ4.append(applicationContext);
                                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ4));
                                    if (applicationContext != null) {
                                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                                        C08RN.LIZ(applicationContext);
                                    }
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append(th.getMessage());
                                    sbLIZ5.append(":");
                                    sbLIZ5.append(C08RN.LIZJ());
                                    sbLIZ5.append(" applicationContext is null");
                                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ5));
                                }
                                System.out.println("Error: mInitialApplication is not an instance of Application");
                                StringBuilder sbLIZ52 = C2188811AlT.LIZ();
                                sbLIZ52.append(th.getMessage());
                                sbLIZ52.append(":");
                                sbLIZ52.append(C08RN.LIZJ());
                                sbLIZ52.append(" applicationContext is null");
                                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ52));
                            }
                            file = C786450Ut9.LIZJ;
                        }
                        sbLIZ2.append(file.getAbsolutePath());
                        sbLIZ2.append("/jsbdownload");
                        ((C2414409d8) c2414809dC.LIZ.getValue()).LIZ(context2, str, C2188811AlT.LIZIZ(sbLIZ2), strLIZIZ, new InterfaceC2414709dB() { // from class: X.09d4
                            @Override // X.InterfaceC2414709dB
                            public final void LIZ() {
                            }

                            @Override // X.InterfaceC2414709dB
                            public final void onFailed() {
                                C1DFH c1dfh = C0PEM.LIZ;
                                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C436301mr(awS605S0100000_26, view, null), 3);
                            }

                            @Override // X.InterfaceC2414709dB
                            public final void onStart() {
                                C1DFH c1dfh = C0PEM.LIZ;
                                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C436501mt(awS605S0100000_26, view, null), 3);
                            }

                            @Override // X.InterfaceC2414709dB
                            public final void onSuccess(String str3) {
                                C1DFH c1dfh = C0PEM.LIZ;
                                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C317001Ku(awS605S0100000_26, null), 3);
                                C0VSJ c0vsj = new C0VSJ(str3);
                                Context context3 = context2;
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append(context2.getPackageName());
                                sbLIZ6.append(".fileprovider");
                                Uri uriAndroidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context3, C2188811AlT.LIZIZ(sbLIZ6), c0vsj);
                                String type = context2.getContentResolver().getType(uriAndroidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile);
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.VIEW");
                                intent.setDataAndType(uriAndroidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile, type);
                                intent.addFlags(1);
                                Context context4 = context2;
                                Intent intentCreateChooser = Intent.createChooser(intent, "");
                                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context4, intentCreateChooser, "Context_startActivity_1");
                                C1701330uNH.LIZ(intentCreateChooser, context4);
                                C2204961BRm.LJJJJJL(context4, intentCreateChooser, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5LMck70v2KhsdVbRPMKjevaZ/mK3k+iCy7sf8JDxtTUnhaBqZetrQiJBhQ==", null));
                            }
                        });
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS303S0300000_26 awS303S0300000_26, Object obj, Object obj2) {
        InterfaceC921603iw interfaceC921603iw;
        String str = (String) obj2;
        if (C1697810uHb.LJIIJJI(0, 3).contains(Integer.valueOf(((Number) obj).intValue()))) {
            ((C1709570uaZ) awS303S0300000_26.l0).LJJJLL();
            ((Function0) awS303S0300000_26.l1).invoke();
        }
        if (str != null && C123100dR.LIZ(str)) {
            if (C1912007eI.LIZ(str)) {
                C1710930ucl c1710930ucl = C1710930ucl.LIZ;
                Context context = ((C1709880ub4) awS303S0300000_26.l2).getContext();
                c1710930ucl.getClass();
                C1710940ucm c1710940ucmLIZ = C1710930ucl.LIZ(c1710930ucl, context, null, 2);
                if (c1710940ucmLIZ != null && (interfaceC921603iw = C1710930ucl.LIZIZ) != null) {
                    interfaceC921603iw.LIZLLL(c1710940ucmLIZ, str, new C963003pc(null));
                }
            } else {
                Activity activityLIZ = C1388190mED.LIZ(((C1709880ub4) awS303S0300000_26.l2).getContext());
                if (activityLIZ != null) {
                    C1389880mGw c1389880mGw = new C1389880mGw(activityLIZ);
                    c1389880mGw.LJIIIZ(str);
                    c1389880mGw.LJIIJ();
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS303S0300000_26(C1709570uaZ c1709570uaZ, C1709570uaZ c1709570uaZ2, Function0<Unit> function0, C1709880ub4 c1709880ub4) {
        super(2);
        this.$t = c1709880ub4;
        this.l0 = c1709570uaZ;
        this.l1 = c1709570uaZ2;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS303S0300000_26(C1744780vVM c1744780vVM, SeaProductSpecificationViewHolder seaProductSpecificationViewHolder, Specification specification, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1744780vVM;
        this.l1 = seaProductSpecificationViewHolder;
        this.l2 = specification;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS303S0300000_26(InterfaceC1759080vsQ interfaceC1759080vsQ, InterfaceC1759080vsQ interfaceC1759080vsQ2, CompletionBlock<InterfaceC1759090vsR> completionBlock, C1759050vsN c1759050vsN) {
        super(2);
        this.$t = c1759050vsN;
        this.l0 = interfaceC1759080vsQ;
        this.l1 = interfaceC1759080vsQ2;
        this.l2 = completionBlock;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS303S0300000_26(ECTrendingListAssem eCTrendingListAssem, GridLayoutManager gridLayoutManager, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = eCTrendingListAssem;
        this.l1 = gridLayoutManager;
        this.l2 = view;
    }
}
