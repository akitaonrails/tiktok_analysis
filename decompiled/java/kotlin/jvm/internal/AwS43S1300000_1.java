package kotlin.jvm.internal;

import X.C00H3;
import X.C013C;
import X.C03JV;
import X.C03LU;
import X.C03LY;
import X.C03M4;
import X.C03N8;
import X.C03O0;
import X.C03O6;
import X.C03QL;
import X.C044Z;
import X.C04AS;
import X.C062P;
import X.C09AY;
import X.C1010603xI;
import X.C10321041v;
import X.C10517049j;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C1323720kYE;
import X.C1397620mTQ;
import X.C13LP;
import X.C13LQ;
import X.C1533950q1J;
import X.C15438062q;
import X.C1548730qP9;
import X.C1548750qPB;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C2252611DEt;
import X.C2262851Dhb;
import X.C2262861Dhc;
import X.C2262991Dhp;
import X.C2341109Fh;
import X.C259800zU;
import X.C5182020e;
import X.C722302rt;
import X.C755702xH;
import X.C765002ym;
import X.C7806033c;
import X.C800903Ax;
import X.C833003Ng;
import X.C833803No;
import X.C846703Sn;
import X.C847703Sx;
import X.C872803b4;
import X.C873003b6;
import X.C876903bj;
import X.C897703f5;
import X.C912503hT;
import X.C919503ib;
import X.C957403oi;
import X.EnumC1005903wX;
import X.EnumC1012703xd;
import X.InterfaceC1891350zJl;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelLayoutResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.identity.AddressIdentityEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.lockup.SeaPdpInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.v3.SeaProductSelectUserRightVOV3;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.v3.SeaUserRightViewHolderV3;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.CounterDescription;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBottomWidgetNew;
import com.ss.android.ugc.aweme.ecommerce.core.view.CommerceProductInfoView;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class AwS43S1300000_1 extends C09AY implements Function1 {
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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS43S1300000_1 awS43S1300000_1, Object obj) {
        IdentityInfoPanel identityInfoPanel = (IdentityInfoPanel) awS43S1300000_1.l1;
        C2252611DEt c2252611DEt = AddressIdentityEditFragment.LLIZ;
        AddressIdentityEditFragment addressIdentityEditFragment = (AddressIdentityEditFragment) awS43S1300000_1.l2;
        ((C062P) obj).LIZ = new C876903bj(identityInfoPanel, c2252611DEt, addressIdentityEditFragment.LLILZ, awS43S1300000_1.s0, addressIdentityEditFragment.LLILZIL, (Boolean) awS43S1300000_1.l3, addressIdentityEditFragment.LLILZLL);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS43S1300000_1 awS43S1300000_1, Object obj) {
        String strLJJIIZ;
        PaymentMethod paymentMethod;
        ((C013C) awS43S1300000_1.l1).element = true;
        C912503hT c912503hT = (C912503hT) awS43S1300000_1.l2;
        if (c912503hT != null) {
            PaymentAppealHelper.LIZ.getClass();
            PaymentAppealHelper.LJ(c912503hT);
        }
        C03O0 c03o0 = C03O0.LIZ;
        String str = awS43S1300000_1.s0;
        PaymentInfo paymentInfo = ((C897703f5) awS43S1300000_1.l3).LJI;
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            strLJJIIZ = paymentMethod.LJJIIZ();
        } else {
            strLJJIIZ = null;
        }
        c03o0.getClass();
        C03O0.LJJZ(str, strLJJIIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(67:0|2|(3:6|(4:9|(3:11|(4:14|(4:396|16|(4:19|(3:400|21|403)(1:402)|401|17)|399)(1:398)|397|12)|395)(1:394)|22|7)|393)|23|(1:250)(1:27)|28|(1:249)(1:32)|33|(1:35)(1:248)|36|(1:38)(1:247)|39|(2:41|(1:43)(1:246))(0)|(1:245)(1:47)|48|(1:244)(1:52)|53|(1:243)(1:(1:57)(1:242))|58|(1:241)(1:62)|63|(1:65)(2:223|(3:225|(1:231)(1:229)|230)(1:(3:233|(1:239)(1:237)|238)(1:240)))|66|(1:68)(1:222)|69|(3:(1:221)(1:74)|75|(2:(1:78)|79))|80|(3:(1:220)(1:85)|86|(2:(1:89)|90))|91|(2:(1:219)(1:217)|218)(8:94|(1:213)(1:98)|99|(1:101)(1:212)|102|(2:(1:105)(1:211)|106)|(1:108)(1:210)|109)|(1:209)(1:113)|114|(1:118)|119|(1:121)(1:207)|122|(1:206)(1:128)|(1:130)(1:205)|131|(1:204)(1:135)|136|(3:199|(1:201)(1:203)|202)(1:139)|140|(3:(1:197)(1:147)|(1:196)(1:151)|152)(1:198)|153|(1:155)(1:195)|156|(1:158)(1:194)|159|(1:161)(1:193)|162|(2:(1:165)(1:192)|166)|(15:168|(1:170)|171|(1:189)(4:173|(1:177)|178|(1:180)(0))|181|(1:183)|184|(1:186)(1:188)|187|391|251|(8:253|(18:(1:267)|268|261|(1:270)(2:265|269)|271|(19:282|(1:284)|285|279|(2:281|286)(1:287)|288|(1:294)|295|(1:299)|300|(23:(1:386)|308|(1:310)(1:384)|311|(1:383)(1:315)|316|(1:382)(1:320)|321|(1:381)(1:329)|330|(1:380)(1:338)|339|(1:343)|344|(1:379)(1:350)|351|(8:375|(1:377)|378|359|(1:374)(1:365)|366|(1:373)(1:370)|371)(1:355)|356|(1:358)(1:378)|359|(4:361|374|366|(3:368|373|371)(0))(0)|389|390)(1:304)|305|(1:307)|308|(0)(0)|311|(4:313|383|316|(4:318|382|321|(4:323|381|330|(6:332|380|339|(2:341|343)|344|(4:346|379|351|(6:353|375|(0)|378|359|(0)(0))(0))(0))(0))(0))(0))(0)|389|390)(1:275)|276|(1:278)(1:285)|279|(0)(0)|288|(3:290|292|294)|295|(2:297|299)|300|(6:302|(0)|308|(0)(0)|311|(0)(0))(0)|389|390)(1:257)|258|(1:260)(1:268)|261|(4:263|270|271|(12:273|282|(0)|285|279|(0)(0)|288|(0)|295|(0)|300|(0)(0))(0))(0)|389|390)|372|389|390)(1:190)|191|171|(0)(0)|181|(0)|184|(0)(0)|187|391|251|(0)|372|389|390) */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0738, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0739, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        X.C1AF0.LJ(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:173:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0511 A[Catch: all -> 0x0738, TryCatch #0 {all -> 0x0738, blocks: (B:251:0x050b, B:253:0x0511, B:255:0x0524, B:257:0x0528, B:258:0x052a, B:260:0x052e, B:261:0x0532, B:263:0x0536, B:271:0x0548, B:273:0x0556, B:275:0x055a, B:276:0x055c, B:278:0x0560, B:279:0x0562, B:288:0x0572, B:290:0x058c, B:292:0x0590, B:294:0x0594, B:295:0x0598, B:297:0x059c, B:299:0x05a0, B:300:0x05a4, B:302:0x05a8, B:304:0x05ac, B:305:0x05b0, B:307:0x05b4, B:308:0x05b8, B:310:0x05c2, B:311:0x05c6, B:313:0x05ca, B:315:0x05ce, B:316:0x05d2, B:318:0x05de, B:320:0x05e2, B:321:0x05e6, B:323:0x05fc, B:325:0x0600, B:327:0x0604, B:329:0x0608, B:330:0x060c, B:332:0x0610, B:334:0x0614, B:336:0x0618, B:338:0x061c, B:339:0x0620, B:341:0x062e, B:343:0x0632, B:344:0x0636, B:346:0x064e, B:348:0x0652, B:350:0x0656, B:351:0x065a, B:353:0x0668, B:355:0x066c, B:356:0x066e, B:358:0x0672, B:359:0x0674, B:361:0x068c, B:363:0x0690, B:365:0x0694, B:366:0x0696, B:368:0x06a2, B:370:0x06a6, B:371:0x06aa, B:372:0x06e7), top: B:391:0x050b }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x058c A[Catch: all -> 0x0738, TryCatch #0 {all -> 0x0738, blocks: (B:251:0x050b, B:253:0x0511, B:255:0x0524, B:257:0x0528, B:258:0x052a, B:260:0x052e, B:261:0x0532, B:263:0x0536, B:271:0x0548, B:273:0x0556, B:275:0x055a, B:276:0x055c, B:278:0x0560, B:279:0x0562, B:288:0x0572, B:290:0x058c, B:292:0x0590, B:294:0x0594, B:295:0x0598, B:297:0x059c, B:299:0x05a0, B:300:0x05a4, B:302:0x05a8, B:304:0x05ac, B:305:0x05b0, B:307:0x05b4, B:308:0x05b8, B:310:0x05c2, B:311:0x05c6, B:313:0x05ca, B:315:0x05ce, B:316:0x05d2, B:318:0x05de, B:320:0x05e2, B:321:0x05e6, B:323:0x05fc, B:325:0x0600, B:327:0x0604, B:329:0x0608, B:330:0x060c, B:332:0x0610, B:334:0x0614, B:336:0x0618, B:338:0x061c, B:339:0x0620, B:341:0x062e, B:343:0x0632, B:344:0x0636, B:346:0x064e, B:348:0x0652, B:350:0x0656, B:351:0x065a, B:353:0x0668, B:355:0x066c, B:356:0x066e, B:358:0x0672, B:359:0x0674, B:361:0x068c, B:363:0x0690, B:365:0x0694, B:366:0x0696, B:368:0x06a2, B:370:0x06a6, B:371:0x06aa, B:372:0x06e7), top: B:391:0x050b }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x059c A[Catch: all -> 0x0738, TryCatch #0 {all -> 0x0738, blocks: (B:251:0x050b, B:253:0x0511, B:255:0x0524, B:257:0x0528, B:258:0x052a, B:260:0x052e, B:261:0x0532, B:263:0x0536, B:271:0x0548, B:273:0x0556, B:275:0x055a, B:276:0x055c, B:278:0x0560, B:279:0x0562, B:288:0x0572, B:290:0x058c, B:292:0x0590, B:294:0x0594, B:295:0x0598, B:297:0x059c, B:299:0x05a0, B:300:0x05a4, B:302:0x05a8, B:304:0x05ac, B:305:0x05b0, B:307:0x05b4, B:308:0x05b8, B:310:0x05c2, B:311:0x05c6, B:313:0x05ca, B:315:0x05ce, B:316:0x05d2, B:318:0x05de, B:320:0x05e2, B:321:0x05e6, B:323:0x05fc, B:325:0x0600, B:327:0x0604, B:329:0x0608, B:330:0x060c, B:332:0x0610, B:334:0x0614, B:336:0x0618, B:338:0x061c, B:339:0x0620, B:341:0x062e, B:343:0x0632, B:344:0x0636, B:346:0x064e, B:348:0x0652, B:350:0x0656, B:351:0x065a, B:353:0x0668, B:355:0x066c, B:356:0x066e, B:358:0x0672, B:359:0x0674, B:361:0x068c, B:363:0x0690, B:365:0x0694, B:366:0x0696, B:368:0x06a2, B:370:0x06a6, B:371:0x06aa, B:372:0x06e7), top: B:391:0x050b }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05a8 A[Catch: all -> 0x0738, TryCatch #0 {all -> 0x0738, blocks: (B:251:0x050b, B:253:0x0511, B:255:0x0524, B:257:0x0528, B:258:0x052a, B:260:0x052e, B:261:0x0532, B:263:0x0536, B:271:0x0548, B:273:0x0556, B:275:0x055a, B:276:0x055c, B:278:0x0560, B:279:0x0562, B:288:0x0572, B:290:0x058c, B:292:0x0590, B:294:0x0594, B:295:0x0598, B:297:0x059c, B:299:0x05a0, B:300:0x05a4, B:302:0x05a8, B:304:0x05ac, B:305:0x05b0, B:307:0x05b4, B:308:0x05b8, B:310:0x05c2, B:311:0x05c6, B:313:0x05ca, B:315:0x05ce, B:316:0x05d2, B:318:0x05de, B:320:0x05e2, B:321:0x05e6, B:323:0x05fc, B:325:0x0600, B:327:0x0604, B:329:0x0608, B:330:0x060c, B:332:0x0610, B:334:0x0614, B:336:0x0618, B:338:0x061c, B:339:0x0620, B:341:0x062e, B:343:0x0632, B:344:0x0636, B:346:0x064e, B:348:0x0652, B:350:0x0656, B:351:0x065a, B:353:0x0668, B:355:0x066c, B:356:0x066e, B:358:0x0672, B:359:0x0674, B:361:0x068c, B:363:0x0690, B:365:0x0694, B:366:0x0696, B:368:0x06a2, B:370:0x06a6, B:371:0x06aa, B:372:0x06e7), top: B:391:0x050b }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05c2 A[Catch: all -> 0x0738, TryCatch #0 {all -> 0x0738, blocks: (B:251:0x050b, B:253:0x0511, B:255:0x0524, B:257:0x0528, B:258:0x052a, B:260:0x052e, B:261:0x0532, B:263:0x0536, B:271:0x0548, B:273:0x0556, B:275:0x055a, B:276:0x055c, B:278:0x0560, B:279:0x0562, B:288:0x0572, B:290:0x058c, B:292:0x0590, B:294:0x0594, B:295:0x0598, B:297:0x059c, B:299:0x05a0, B:300:0x05a4, B:302:0x05a8, B:304:0x05ac, B:305:0x05b0, B:307:0x05b4, B:308:0x05b8, B:310:0x05c2, B:311:0x05c6, B:313:0x05ca, B:315:0x05ce, B:316:0x05d2, B:318:0x05de, B:320:0x05e2, B:321:0x05e6, B:323:0x05fc, B:325:0x0600, B:327:0x0604, B:329:0x0608, B:330:0x060c, B:332:0x0610, B:334:0x0614, B:336:0x0618, B:338:0x061c, B:339:0x0620, B:341:0x062e, B:343:0x0632, B:344:0x0636, B:346:0x064e, B:348:0x0652, B:350:0x0656, B:351:0x065a, B:353:0x0668, B:355:0x066c, B:356:0x066e, B:358:0x0672, B:359:0x0674, B:361:0x068c, B:363:0x0690, B:365:0x0694, B:366:0x0696, B:368:0x06a2, B:370:0x06a6, B:371:0x06aa, B:372:0x06e7), top: B:391:0x050b }] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05ca A[Catch: all -> 0x0738, TryCatch #0 {all -> 0x0738, blocks: (B:251:0x050b, B:253:0x0511, B:255:0x0524, B:257:0x0528, B:258:0x052a, B:260:0x052e, B:261:0x0532, B:263:0x0536, B:271:0x0548, B:273:0x0556, B:275:0x055a, B:276:0x055c, B:278:0x0560, B:279:0x0562, B:288:0x0572, B:290:0x058c, B:292:0x0590, B:294:0x0594, B:295:0x0598, B:297:0x059c, B:299:0x05a0, B:300:0x05a4, B:302:0x05a8, B:304:0x05ac, B:305:0x05b0, B:307:0x05b4, B:308:0x05b8, B:310:0x05c2, B:311:0x05c6, B:313:0x05ca, B:315:0x05ce, B:316:0x05d2, B:318:0x05de, B:320:0x05e2, B:321:0x05e6, B:323:0x05fc, B:325:0x0600, B:327:0x0604, B:329:0x0608, B:330:0x060c, B:332:0x0610, B:334:0x0614, B:336:0x0618, B:338:0x061c, B:339:0x0620, B:341:0x062e, B:343:0x0632, B:344:0x0636, B:346:0x064e, B:348:0x0652, B:350:0x0656, B:351:0x065a, B:353:0x0668, B:355:0x066c, B:356:0x066e, B:358:0x0672, B:359:0x0674, B:361:0x068c, B:363:0x0690, B:365:0x0694, B:366:0x0696, B:368:0x06a2, B:370:0x06a6, B:371:0x06aa, B:372:0x06e7), top: B:391:0x050b }] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x068c A[Catch: all -> 0x0738, TryCatch #0 {all -> 0x0738, blocks: (B:251:0x050b, B:253:0x0511, B:255:0x0524, B:257:0x0528, B:258:0x052a, B:260:0x052e, B:261:0x0532, B:263:0x0536, B:271:0x0548, B:273:0x0556, B:275:0x055a, B:276:0x055c, B:278:0x0560, B:279:0x0562, B:288:0x0572, B:290:0x058c, B:292:0x0590, B:294:0x0594, B:295:0x0598, B:297:0x059c, B:299:0x05a0, B:300:0x05a4, B:302:0x05a8, B:304:0x05ac, B:305:0x05b0, B:307:0x05b4, B:308:0x05b8, B:310:0x05c2, B:311:0x05c6, B:313:0x05ca, B:315:0x05ce, B:316:0x05d2, B:318:0x05de, B:320:0x05e2, B:321:0x05e6, B:323:0x05fc, B:325:0x0600, B:327:0x0604, B:329:0x0608, B:330:0x060c, B:332:0x0610, B:334:0x0614, B:336:0x0618, B:338:0x061c, B:339:0x0620, B:341:0x062e, B:343:0x0632, B:344:0x0636, B:346:0x064e, B:348:0x0652, B:350:0x0656, B:351:0x065a, B:353:0x0668, B:355:0x066c, B:356:0x066e, B:358:0x0672, B:359:0x0674, B:361:0x068c, B:363:0x0690, B:365:0x0694, B:366:0x0696, B:368:0x06a2, B:370:0x06a6, B:371:0x06aa, B:372:0x06e7), top: B:391:0x050b }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0736  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(kotlin.jvm.internal.AwS43S1300000_1 r81, java.lang.Object r82) {
        /*
            Method dump skipped, instruction units count: 1941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS43S1300000_1.invoke$10(kotlin.jvm.internal.AwS43S1300000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$11(kotlin.jvm.internal.AwS43S1300000_1 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS43S1300000_1.invoke$11(kotlin.jvm.internal.AwS43S1300000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$12(AwS43S1300000_1 awS43S1300000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS43S1300000_1.l1).LIZIZ);
        laneParams.plusAssign("enter_from_merge", ((SeaPdpViewModel) awS43S1300000_1.l2).OR2());
        laneParams.plusAssign("enter_from", ((SeaPdpViewModel) awS43S1300000_1.l2).OR2());
        C1010603xI.LIZJ(laneParams, awS43S1300000_1.s0);
        Map map = (Map) awS43S1300000_1.l3;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                laneParams.plusAssign((String) entry.getKey(), entry.getValue());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS43S1300000_1 awS43S1300000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS43S1300000_1.l1).LIZIZ);
        laneParams.plusAssign("enter_from_merge", ((SeaPdpViewModel) awS43S1300000_1.l2).OR2());
        laneParams.plusAssign("enter_from", ((SeaPdpViewModel) awS43S1300000_1.l2).OR2());
        C1010603xI.LIZJ(laneParams, awS43S1300000_1.s0);
        Map map = (Map) awS43S1300000_1.l3;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                laneParams.plusAssign((String) entry.getKey(), entry.getValue());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS43S1300000_1 awS43S1300000_1, Object obj) {
        C1748720vbi.LJ(((SeaUserRightViewHolderV3) awS43S1300000_1.l1).itemView, new C10517049j(), awS43S1300000_1.s0, (PageFinder) awS43S1300000_1.l2, new AwS367S0200000_1((SeaProductSelectUserRightVOV3) awS43S1300000_1.l3, (EnumC1005903wX) obj, 205));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS43S1300000_1 awS43S1300000_1, Object obj) {
        Availability availability;
        C872803b4 c872803b4 = (C872803b4) obj;
        List list = (List) awS43S1300000_1.l1;
        PaymentMethod paymentMethod = (PaymentMethod) awS43S1300000_1.l2;
        String str = awS43S1300000_1.s0;
        Map map = (Map) awS43S1300000_1.l3;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            ArrayList arrayList2 = null;
            if (i >= 0) {
                InstallmentInfo installmentInfo = (InstallmentInfo) obj2;
                String str2 = installmentInfo.iconUrl;
                String str3 = installmentInfo.iconUrlDark;
                String str4 = installmentInfo.bankCode;
                String str5 = installmentInfo.bankName;
                List<PaymentMethod> list2 = paymentMethod.subPaymentMethods;
                if (list2 != null) {
                    arrayList2 = new ArrayList();
                    for (PaymentMethod paymentMethod2 : list2) {
                        PaymentMethod paymentMethod3 = paymentMethod2;
                        Set set = (Set) map.get(installmentInfo.bankCode);
                        if ((set != null && set.contains(paymentMethod3.id)) || ((availability = paymentMethod3.availability) != null && Intrinsics.LJFF(availability.isAvailable(), Boolean.TRUE))) {
                            arrayList2.add(paymentMethod2);
                        }
                    }
                }
                PaymentMethod paymentMethod4 = paymentMethod;
                arrayList.add(new C847703Sx(new C873003b6(str2, str3, str4, str5, installmentInfo, PaymentMethod.LIZJ(paymentMethod4, null, null, arrayList2, null, null, null, null, null, null, false, null, null, null, null, null, null, -129, -1, -1), str, 64), i, false, true));
                i = i2;
                paymentMethod = paymentMethod4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ListProtector.add(arrayList3, 0, new C846703Sn(0));
        return C872803b4.LIZ(c872803b4, null, arrayList3, false, null, null, 29);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$16(AwS43S1300000_1 awS43S1300000_1, Object obj) {
        boolean z;
        C2262851Dhb c2262851Dhb = (C2262851Dhb) obj;
        if (C1533950q1J.LJ((String) ((C259800zU) awS43S1300000_1.l1).element) && !((C03M4) awS43S1300000_1.l2).LIZ().LLILZIL) {
            z = true;
        } else {
            z = false;
        }
        return C2262851Dhb.LIZ(c2262851Dhb, null, null, null, null, null, null, null, null, null, new C2262861Dhc(new C833003Ng(z, 2), (String) ((C259800zU) awS43S1300000_1.l1).element, (Price) null, (Integer) null, (Integer) 32, (Integer) null, (ECRichText) null, awS43S1300000_1.s0, (Boolean) null, (C2262991Dhp) ((C259800zU) awS43S1300000_1.l3).element, (Boolean) null, (Integer) null, 7020), null, 1535);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$17(kotlin.jvm.internal.AwS43S1300000_1 r8, java.lang.Object r9) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState r9 = (com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState) r9
            java.lang.Object r2 = r8.l1
            com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBottomWidgetNew r2 = (com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBottomWidgetNew) r2
            X.043o r1 = r9.getSkuStockInfo()
            java.lang.Object r0 = r8.l2
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton) r0
            r2.LJIILLIIL(r1, r0)
            java.lang.Object r0 = r8.l1
            com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBottomWidgetNew r0 = (com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBottomWidgetNew) r0
            X.048v r2 = r0.LLJILJILJ
            r3 = 0
            if (r2 == 0) goto L57
            com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel r0 = r0.LJII()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r0.LLJILJILJ
            if (r0 == 0) goto L28
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomArea r0 = r0.bottomArea
            if (r0 == 0) goto L28
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.view.btninterest.model.SeaPdpBottomBtnInterest> r3 = r0.interestMap
        L28:
            java.lang.String r4 = r8.s0
            java.lang.Object r5 = r8.l3
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r8.l2
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton r6 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton) r6
            X.03o5 r0 = r9.getCurrentPriceData()
            if (r0 == 0) goto L58
            boolean r1 = r0.LJ
            r0 = 1
            if (r1 != r0) goto L58
        L3d:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r0 = r8.l1
            com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBottomWidgetNew r0 = (com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBottomWidgetNew) r0
            r0.getClass()
            X.19EG r8 = X.C1745060vVo.LIZ(r0)
            X.048t r1 = X.C10495048n.LIZIZ(r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = "sku"
            r2.LIZJ(r1, r0)
            kotlin.Unit r3 = kotlin.Unit.LIZ
        L57:
            return r3
        L58:
            r0 = 0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS43S1300000_1.invoke$17(kotlin.jvm.internal.AwS43S1300000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$18(AwS43S1300000_1 awS43S1300000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS43S1300000_1.l1).LIZIZ);
        laneParams.plusAssign("enter_from_merge", ((PdpViewModel) awS43S1300000_1.l2).IR2());
        laneParams.plusAssign("enter_from", ((PdpViewModel) awS43S1300000_1.l2).IR2());
        C1010603xI.LIZJ(laneParams, awS43S1300000_1.s0);
        Map map = (Map) awS43S1300000_1.l3;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                laneParams.plusAssign((String) entry.getKey(), entry.getValue());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS43S1300000_1 awS43S1300000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS43S1300000_1.l1).LIZIZ);
        laneParams.plusAssign("enter_from_merge", ((PdpViewModel) awS43S1300000_1.l2).IR2());
        laneParams.plusAssign("enter_from", ((PdpViewModel) awS43S1300000_1.l2).IR2());
        C1010603xI.LIZJ(laneParams, awS43S1300000_1.s0);
        Map map = (Map) awS43S1300000_1.l3;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                laneParams.plusAssign((String) entry.getKey(), entry.getValue());
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS43S1300000_1 r35, java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS43S1300000_1.invoke$2(kotlin.jvm.internal.AwS43S1300000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$20(kotlin.jvm.internal.AwS43S1300000_1 r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS43S1300000_1.invoke$20(kotlin.jvm.internal.AwS43S1300000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[PHI: r3
      0x0050: PHI (r3v4 java.lang.String) = (r3v1 java.lang.String), (r3v5 java.lang.String) binds: [B:26:0x004e, B:24:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$21(kotlin.jvm.internal.AwS43S1300000_1 r21, java.lang.Object r22) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS43S1300000_1.invoke$21(kotlin.jvm.internal.AwS43S1300000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$22(AwS43S1300000_1 awS43S1300000_1, Object obj) {
        Integer num;
        Long l;
        Long l2;
        String strLJJLIIIJ;
        String str;
        Integer num2;
        String str2;
        PaymentMethod paymentMethod;
        CommuteInfo commuteInfoLJJIIJ;
        ToastContent toastContent;
        PaymentMethod paymentMethod2;
        PaymentMethod paymentMethod3;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("EVENT_ORIGIN_FEATURE", "TEMAI");
        laneParams.plusAssign("page_name", "order_submit");
        laneParams.plusAssign("error_code", awS43S1300000_1.s0);
        C03N8 c03n8 = (C03N8) awS43S1300000_1.l1;
        CommuteType commuteType = null;
        if (c03n8 != null) {
            num = c03n8.LIZ;
        } else {
            num = null;
        }
        laneParams.plusAssign("retry_time", num);
        C03N8 c03n82 = (C03N8) awS43S1300000_1.l1;
        if (c03n82 != null) {
            l = c03n82.LIZIZ;
        } else {
            l = null;
        }
        laneParams.plusAssign("start_time", l);
        C03N8 c03n83 = (C03N8) awS43S1300000_1.l1;
        if (c03n83 != null) {
            l2 = c03n83.LIZJ;
        } else {
            l2 = null;
        }
        laneParams.plusAssign("cost_time", l2);
        List<String> list = ((C03QL) awS43S1300000_1.l2).LLJJJJJIL.LIZ;
        if (list != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = null;
        }
        laneParams.plusAssign("order_id", strLJJLIIIJ);
        PaymentInfo paymentInfo = ((C03QL) awS43S1300000_1.l2).LLJJJJJIL.LJI;
        String strLJJIIZ = "";
        if (paymentInfo == null || (paymentMethod3 = paymentInfo.paymentMethod) == null || (str = paymentMethod3.id) == null) {
            str = "";
        }
        laneParams.plusAssign("payment_method_id", str);
        PaymentInfo paymentInfo2 = ((C03QL) awS43S1300000_1.l2).LLJJJJJIL.LJI;
        if (paymentInfo2 != null && (paymentMethod2 = paymentInfo2.paymentMethod) != null) {
            strLJJIIZ = paymentMethod2.LJJIIZ();
        }
        laneParams.plusAssign("payment_method_name", strLJJIIZ);
        C03N8 c03n84 = (C03N8) awS43S1300000_1.l1;
        if (c03n84 != null) {
            num2 = c03n84.LIZLLL;
        } else {
            num2 = null;
        }
        laneParams.plusAssign("order_status", num2);
        ExceptionUX exceptionUX = (ExceptionUX) awS43S1300000_1.l3;
        if (exceptionUX != null && (toastContent = exceptionUX.toastContent) != null) {
            str2 = toastContent.message;
        } else {
            str2 = null;
        }
        laneParams.plusAssign("message", str2);
        laneParams.plusAssign("log_id", ((C03QL) awS43S1300000_1.l2).LLJJJJJIL.LIZLLL);
        PaymentInfo paymentInfo3 = ((C03QL) awS43S1300000_1.l2).LLJJJJJIL.LJI;
        if (paymentInfo3 != null && (paymentMethod = paymentInfo3.paymentMethod) != null && (commuteInfoLJJIIJ = paymentMethod.LJJIIJ(false)) != null) {
            commuteType = commuteInfoLJJIIJ.commuteType;
        }
        laneParams.plusAssign("pay_commute_type", commuteType);
        laneParams.plusAssign("buy_type", 3);
        laneParams.plusAssign("order_source_type", "one_click_pay");
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS43S1300000_1 awS43S1300000_1, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, awS43S1300000_1.s0, new AwS210S0300000_1((OrderSubmitFragment) awS43S1300000_1.l1, (Boolean) awS43S1300000_1.l2, (Integer) awS43S1300000_1.l3, 123));
        c1397620mTQ.LIZJ(1, ((OrderSubmitFragment) awS43S1300000_1.l1).getResources().getString(2131833168), AFwS228S0000000_1.get$arr$(912));
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS43S1300000_1 awS43S1300000_1, Object obj) throws JSONException {
        PaymentMethod paymentMethod;
        String str;
        String str2 = null;
        if (((Boolean) obj).booleanValue()) {
            C833803No c833803No = ((C03LY) awS43S1300000_1.l1).LIZ.A;
            if (c833803No != null) {
                c833803No.LIZ();
            }
            C833803No c833803No2 = ((C03LY) awS43S1300000_1.l1).LIZ.A;
            if (c833803No2 != null) {
                c833803No2.LIZJ();
            }
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = ((C03LY) awS43S1300000_1.l1).LIZ;
            C833803No c833803No3 = orderSubmitAssemViewModel.A;
            if (c833803No3 != null) {
                c833803No3.LJII = null;
            }
            C03O6 c03o6 = orderSubmitAssemViewModel.B;
            if (c03o6 != null) {
                c03o6.LIZIZ = 4;
                c03o6.LIZJ();
            }
            OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = ((C03LY) awS43S1300000_1.l1).LIZ;
            GetAddonPanelLayoutResponseData getAddonPanelLayoutResponseData = orderSubmitAssemViewModel2.LLLZZIL;
            if (getAddonPanelLayoutResponseData == null || (str = getAddonPanelLayoutResponseData.schema) == null) {
                str = "";
            }
            HashMap<String, Object> mapLJFF = C7806033c.LJFF(orderSubmitAssemViewModel2.LLLIL);
            String str3 = awS43S1300000_1.s0;
            if (str3 != null) {
                mapLJFF.put("source_btm_token", str3);
            }
            String strLIZ = C919503ib.LIZ(str, mapLJFF);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C03LY c03ly = (C03LY) awS43S1300000_1.l1;
            OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = c03ly.LIZ;
            C03O6 c03o62 = orderSubmitAssemViewModel3.B;
            if (c03o62 != null) {
                linkedHashMap.put("request_data", c03o62.LIZIZ(orderSubmitAssemViewModel3));
            }
            GetAddonPanelLayoutResponseData getAddonPanelLayoutResponseData2 = c03ly.LIZ.LLLZZIL;
            if (getAddonPanelLayoutResponseData2 != null) {
                linkedHashMap.put("response_data", getAddonPanelLayoutResponseData2);
            }
            OrderSubmitAssemViewModel orderSubmitAssemViewModel4 = ((C03LY) awS43S1300000_1.l1).LIZ;
            if (!orderSubmitAssemViewModel4.LLL.isEmpty()) {
                C800903Ax.LIZ().storeString("osp_shop_notes", C1741890vQh.LJIIIIZZ(orderSubmitAssemViewModel4.LLL));
            }
            C1548750qPB c1548750qPB = C1548750qPB.LIZ;
            Context context = (Context) awS43S1300000_1.l2;
            C1548730qP9 c1548730qP9 = new C1548730qP9();
            c1548730qP9.LIZ = TemplateData.LJIIIIZZ(C1741890vQh.LJIIIIZZ(linkedHashMap));
            c1548730qP9.LJIIJJI = strLIZ;
            c1548750qPB.getClass();
            C1548750qPB.LIZIZ(context, c1548730qP9);
        } else {
            C03LU c03lu = ((C03LY) awS43S1300000_1.l1).LIZ.LLLL;
            if (c03lu != null) {
                PaymentInfo paymentInfo = ((C03JV) awS43S1300000_1.l3).LLIZ;
                if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
                    str2 = paymentMethod.id;
                }
                c03lu.LIZIZ(str2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS43S1300000_1 awS43S1300000_1, Object obj) {
        String strLJJIIZ;
        PaymentMethod paymentMethod;
        ((C013C) awS43S1300000_1.l1).element = true;
        C912503hT c912503hT = (C912503hT) awS43S1300000_1.l2;
        if (c912503hT != null) {
            PaymentAppealHelper.LIZ.getClass();
            PaymentAppealHelper.LJ(c912503hT);
        }
        C03O0 c03o0 = C03O0.LIZ;
        String str = awS43S1300000_1.s0;
        PaymentInfo paymentInfo = ((C897703f5) awS43S1300000_1.l3).LJI;
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            strLJJIIZ = paymentMethod.LJJIIZ();
        } else {
            strLJJIIZ = null;
        }
        c03o0.getClass();
        C03O0.LJJZ(str, strLJJIIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS43S1300000_1 awS43S1300000_1, Object obj) {
        PaymentMethod paymentMethod;
        C03JV c03jv = (C03JV) obj;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS43S1300000_1.l1;
        BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
        boolean z = c03jv.LLILZ;
        PaymentInfo paymentInfo = orderSubmitAssemViewModel.LLJJJ;
        if (paymentInfo != null) {
            paymentMethod = paymentInfo.paymentMethod;
        } else {
            paymentMethod = null;
        }
        return C03JV.LIZ(c03jv, 0, OrderSubmitAssemViewModel.nR2(orderSubmitAssemViewModel, billInfoData, z, paymentMethod, orderSubmitAssemViewModel.LLJL, true, false, EcPaymentIndependentPriceConfigSettings.LIZIZ(), awS43S1300000_1.s0, (ECRichText) awS43S1300000_1.l2, 544), (C722302rt) awS43S1300000_1.l3, false, null, false, null, null, null, null, awS43S1300000_1.s0, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1031, -1, -8193, 1048575);
    }

    public static final Object invoke$5(AwS43S1300000_1 awS43S1300000_1, Object obj) {
        C03JV c03jv = (C03JV) obj;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS43S1300000_1.l1;
        return C03JV.LIZ(c03jv, 0, OrderSubmitAssemViewModel.nR2(orderSubmitAssemViewModel, orderSubmitAssemViewModel.LLJJI, c03jv.LLILZ, null, orderSubmitAssemViewModel.LLJL, true, false, false, awS43S1300000_1.s0, (ECRichText) awS43S1300000_1.l2, 608), (C722302rt) awS43S1300000_1.l3, false, null, false, null, null, null, null, awS43S1300000_1.s0, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1031, -1, -8193, 1048575);
    }

    public static final Object invoke$6(AwS43S1300000_1 awS43S1300000_1, Object obj) {
        int i;
        Object objLJJIIZ;
        String str;
        Object obj2;
        ProductPackStruct productPackStruct;
        ProductBase productBase;
        SkuPanelState skuPanelStatePv0;
        String[] strArr;
        ProductPackStruct productPackStruct2;
        List<SaleProp> list;
        C957403oi c957403oi = (C957403oi) obj;
        Map<String, ? extends Object> map = (Map) awS43S1300000_1.l1;
        if (map != null) {
            c957403oi.LJ(map);
        }
        PdpViewModel pdpViewModel = ((C04AS) awS43S1300000_1.l2).LIZJ;
        if (pdpViewModel != null && (productPackStruct2 = pdpViewModel.LLJILLL) != null && (list = productPackStruct2.saleProps) != null) {
            Iterator<SaleProp> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                Integer num = it2.next().salePropType;
                int value = EnumC1012703xd.COLOR.getValue();
                if (num != null && num.intValue() == value) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            i = -1;
        }
        PdpViewModel pdpViewModel2 = ((C04AS) awS43S1300000_1.l2).LIZJ;
        Object obj3 = null;
        if (pdpViewModel2 != null && (skuPanelStatePv0 = pdpViewModel2.Pv0()) != null && (strArr = skuPanelStatePv0.checkedSkuIds) != null) {
            objLJJIIZ = C13LQ.LJJIIZ(i, strArr);
        } else {
            objLJJIIZ = null;
        }
        c957403oi.LIZJ("color_id", objLJJIIZ);
        PdpViewModel pdpViewModel3 = ((C04AS) awS43S1300000_1.l2).LIZJ;
        if (pdpViewModel3 != null && (productPackStruct = pdpViewModel3.LLJILLL) != null && (productBase = productPackStruct.baseInfo) != null) {
            str = productBase.categoryName;
        } else {
            str = null;
        }
        c957403oi.LIZJ("product_category_lv1", str);
        Map<String, ? extends Object> map2 = (Map) awS43S1300000_1.l3;
        if (map2 != null) {
            c957403oi.LJ(map2);
        }
        c957403oi.LIZJ("try_on_source", awS43S1300000_1.s0);
        c957403oi.LIZJ("entrance_form", ((C04AS) awS43S1300000_1.l2).LJIIIZ);
        Map<String, Object> mapLIZ = ((C04AS) awS43S1300000_1.l2).LIZ();
        if (mapLIZ != null) {
            c957403oi.LJ(C00H3.LIZ(mapLIZ));
        }
        c957403oi.LIZJ("button_name", "ai_try_on");
        c957403oi.LIZJ("is_ai_scene", 1);
        Map map3 = (Map) awS43S1300000_1.l1;
        if (map3 != null) {
            obj2 = map3.get("page_name");
        } else {
            obj2 = null;
        }
        c957403oi.LIZJ("source_page_type", obj2);
        Map map4 = (Map) awS43S1300000_1.l1;
        if (map4 != null) {
            obj3 = map4.get("source_page_type");
        }
        c957403oi.LIZJ("parent_source_page_type", obj3);
        PdpViewModel pdpViewModel4 = ((C04AS) awS43S1300000_1.l2).LIZJ;
        if (pdpViewModel4 != null) {
            c957403oi.LIZJ("product_pic_index", Integer.valueOf(pdpViewModel4.LLLZI));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS43S1300000_1 awS43S1300000_1, Object obj) {
        SkuState skuState = (SkuState) obj;
        ((C044Z) awS43S1300000_1.l1).Pw1((Integer) awS43S1300000_1.l2);
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.buyButton, skuState.buyButtonInterestId, skuState.buttonDynamicData, skuState.preOrderInfo, skuState.currentPriceData, skuState.hidePriceTip, awS43S1300000_1.s0, skuState.promotionDealVO, skuState.specifications, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.currentImagePosition, skuState.currentInstallmentPlan, skuState.keyBoardVisibility, skuState.skuFragmentClosed, skuState.skuDataState, skuState.addToCartButton, skuState.paymentModule, skuState.showLoadingView, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.localSizeSalePropList, skuState.isQuantityEditable, skuState.slideToBnpl, skuState.exceptionUX, (CounterDescription) awS43S1300000_1.l3, skuState.topOutsideWidgetVisibleHeight, skuState.cutPriceSkuPanel, skuState.skuPanelWaistBanner, skuState.skuPanelSellingPoints, skuState.skuHeaderTopLabels);
    }

    public static final Object invoke$8(AwS43S1300000_1 awS43S1300000_1, Object obj) {
        String str;
        Map linkedHashMap;
        DeliveryPanelStarter.EnterParam enterParam;
        DeliveryPanelStarter.OrderDetail orderDetail;
        DeliveryPanelStarter.OrderDetail orderDetail2;
        String str2;
        DeliveryPanelStarter.OrderDetail orderDetail3;
        Integer num;
        String str3;
        String str4;
        DeliveryPanelState deliveryPanelState = (DeliveryPanelState) obj;
        HashMap map = new HashMap();
        DeliveryPanelViewModel deliveryPanelViewModel = (DeliveryPanelViewModel) awS43S1300000_1.l3;
        DeliveryPanelStarter.EnterParam enterParam2 = deliveryPanelViewModel.LLILZIL;
        if (enterParam2 != null && (str4 = enterParam2.createOrderInfoFromBill) != null) {
            map.put("create_order_info_from_bill", str4);
        }
        DeliveryPanelStarter.EnterParam enterParam3 = deliveryPanelViewModel.LLILZIL;
        String str5 = null;
        if (enterParam3 != null) {
            str = enterParam3.shippingAddress;
        } else {
            str = null;
        }
        if (str != null) {
            map.put("shipping_address", str);
        } else if (deliveryPanelState.getCenterAddress() != null) {
            map.put("shipping_address", C1741890vQh.LJIIIIZZ(deliveryPanelState.getCenterAddress()));
        }
        DeliveryPanelStarter.EnterParam enterParam4 = deliveryPanelViewModel.LLILZIL;
        if (enterParam4 == null || (str3 = enterParam4.trackParams) == null || (linkedHashMap = C1741890vQh.LJIIJ(str3)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put("previous_page", "logistics");
        map.put("track_params", C1741890vQh.LJIIIIZZ(linkedHashMap));
        DeliveryPanelStarter.EnterParam enterParam5 = deliveryPanelViewModel.LLILZIL;
        if (enterParam5 != null) {
            str5 = enterParam5.selectedBuyerAddressId;
        }
        if ((str5 != null && str5.length() != 0) || ((enterParam = deliveryPanelViewModel.LLILZIL) != null && (orderDetail = enterParam.orderDetail) != null && (str5 = orderDetail.addressId) != null)) {
            map.put("address_id", str5);
        }
        if (deliveryPanelViewModel.zR2()) {
            DeliveryPanelStarter.EnterParam enterParam6 = deliveryPanelViewModel.LLILZIL;
            if (enterParam6 != null && (orderDetail3 = enterParam6.orderDetail) != null && (num = orderDetail3.changeAddrOrderType) != null) {
                map.put("change_addr_order_type", Integer.valueOf(num.intValue()));
            }
            DeliveryPanelStarter.EnterParam enterParam7 = deliveryPanelViewModel.LLILZIL;
            if (enterParam7 != null && (orderDetail2 = enterParam7.orderDetail) != null && (str2 = orderDetail2.changeAddrOrderId) != null) {
                map.put("change_addr_order_id", str2);
            }
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        C5182020e c5182020e = new C5182020e(map, (HashMap<String, String>) 195);
        c2341109Fh.getClass();
        C2341109Fh.LIZIZ(c5182020e);
        C1323720kYE.LIZ((Context) awS43S1300000_1.l1).LJIIIIZZ(C1741890vQh.LJIIIIZZ(map), "ecom_pudo_address_data");
        C919503ib.LIZIZ((Context) awS43S1300000_1.l1, awS43S1300000_1.s0, (Map) awS43S1300000_1.l2, false).open();
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS43S1300000_1 awS43S1300000_1, Object obj) {
        List listLJJLL;
        List listLJJLL2;
        C03JV c03jv = (C03JV) obj;
        Image image = (Image) C13LP.LJJJLZIJ(0, (List) awS43S1300000_1.l1);
        String[] strArr = (String[]) awS43S1300000_1.l2;
        if (strArr != null) {
            listLJJLL = C13LQ.LJJLL(strArr);
        } else {
            listLJJLL = null;
        }
        List<InterfaceC1891350zJl> list = c03jv.LLILLJJLI;
        String[] strArr2 = (String[]) awS43S1300000_1.l2;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Object objLIZIZ : list) {
            if (objLIZIZ instanceof C755702xH) {
                C755702xH c755702xH = (C755702xH) objLIZIZ;
                if (strArr2 != null) {
                    listLJJLL2 = C13LQ.LJJLL(strArr2);
                } else {
                    listLJJLL2 = null;
                }
                objLIZIZ = C755702xH.LIZIZ(c755702xH, null, listLJJLL2, null, 13);
            }
            arrayList.add(objLIZIZ);
        }
        return C03JV.LIZ(c03jv, 0, arrayList, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 1, listLJJLL, awS43S1300000_1.s0, (SkuItem) awS43S1300000_1.l3, image, (List) awS43S1300000_1.l1, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -3, -1, 67108863, 1048575);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S1300000_1(C259800zU c259800zU, C03M4 c03m4, String str, C259800zU c259800zU2, int i) {
        super(1);
        this.$t = i;
        this.l1 = c259800zU;
        this.l2 = c03m4;
        this.s0 = str;
        this.l3 = c259800zU2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S1300000_1(C013C c013c, C912503hT c912503hT, String str, C897703f5 c897703f5, int i) {
        super(1);
        this.$t = i;
        this.l1 = c013c;
        this.l2 = c912503hT;
        this.s0 = str;
        this.l3 = c897703f5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S1300000_1(C03LY c03ly, Context context, C03JV c03jv, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c03ly;
        this.l2 = context;
        this.l3 = c03jv;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S1300000_1(C03O6 c03o6, Context context, OrderSubmitAssemViewModel orderSubmitAssemViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c03o6;
        this.l2 = context;
        this.l3 = orderSubmitAssemViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S1300000_1(C044Z c044z, C044Z<ViewModel> c044z2, Integer num, String str, CounterDescription counterDescription) {
        super(1);
        this.$t = counterDescription;
        this.l1 = c044z;
        this.l2 = c044z2;
        this.s0 = num;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S1300000_1(C1054004Ag c1054004Ag, C1054004Ag c1054004Ag2, PdpViewModel pdpViewModel, String str, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l1 = c1054004Ag;
        this.l2 = c1054004Ag2;
        this.s0 = pdpViewModel;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S1300000_1(C1054004Ag c1054004Ag, C1054004Ag c1054004Ag2, Map<String, ? extends Object> map, String str, C765002ym c765002ym) {
        super(1);
        this.$t = c765002ym;
        this.l1 = c1054004Ag;
        this.l2 = c1054004Ag2;
        this.s0 = map;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S1300000_1(C1054104Ah c1054104Ah, C1054104Ah c1054104Ah2, SeaPdpViewModel seaPdpViewModel, String str, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l1 = c1054104Ah;
        this.l2 = c1054104Ah2;
        this.s0 = seaPdpViewModel;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S1300000_1(Context context, Context context2, String str, Map<String, ? extends Object> map, DeliveryPanelViewModel deliveryPanelViewModel) {
        super(1);
        this.$t = deliveryPanelViewModel;
        this.l1 = context;
        this.s0 = context2;
        this.l2 = str;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S1300000_1(PageFinder pageFinder, SeaProductSelectUserRightVOV3 seaProductSelectUserRightVOV3, SeaUserRightViewHolderV3 seaUserRightViewHolderV3, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = seaUserRightViewHolderV3;
        this.s0 = str;
        this.l2 = pageFinder;
        this.l3 = seaProductSelectUserRightVOV3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S1300000_1(PaymentFragment paymentFragment, PaymentFragment paymentFragment2, String str, C259800zU<Integer> c259800zU, C259800zU<Integer> c259800zU2) {
        super(1);
        this.$t = c259800zU2;
        this.l1 = paymentFragment;
        this.s0 = paymentFragment2;
        this.l2 = str;
        this.l3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S1300000_1(IdentityInfoPanel identityInfoPanel, AddressIdentityEditFragment addressIdentityEditFragment, String str, Boolean bool, int i) {
        super(1);
        this.$t = i;
        this.l1 = identityInfoPanel;
        this.l2 = addressIdentityEditFragment;
        this.s0 = str;
        this.l3 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S1300000_1(OrderSubmitAssemViewModel orderSubmitAssemViewModel, String str, ECRichText eCRichText, C722302rt c722302rt, int i) {
        super(1);
        this.$t = i;
        this.l1 = orderSubmitAssemViewModel;
        this.s0 = str;
        this.l2 = eCRichText;
        this.l3 = c722302rt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S1300000_1(SkuPanelBottomWidgetNew skuPanelBottomWidgetNew, SkuPanelBottomWidgetNew skuPanelBottomWidgetNew2, BuyButton buyButton, String str, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l1 = skuPanelBottomWidgetNew;
        this.l2 = skuPanelBottomWidgetNew2;
        this.s0 = buyButton;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S1300000_1(Boolean bool, String str, OrderSubmitAssemViewModel orderSubmitAssemViewModel, Context context, int i) {
        super(1);
        this.$t = i;
        this.l1 = bool;
        this.s0 = str;
        this.l2 = orderSubmitAssemViewModel;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S1300000_1(String str, C03N8 c03n8, C03QL c03ql, ExceptionUX exceptionUX, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c03n8;
        this.l2 = c03ql;
        this.l3 = exceptionUX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S1300000_1(String str, OrderSubmitFragment orderSubmitFragment, Boolean bool, Integer num, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = orderSubmitFragment;
        this.l2 = bool;
        this.l3 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S1300000_1(List list, List<InstallmentInfo> list2, PaymentMethod paymentMethod, String str, Map<String, Set<String>> map) {
        super(1);
        this.$t = map;
        this.l1 = list;
        this.l2 = list2;
        this.s0 = paymentMethod;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S1300000_1(List list, List<Image> list2, String[] strArr, String str, SkuItem skuItem) {
        super(1);
        this.$t = skuItem;
        this.l1 = list;
        this.l2 = list2;
        this.s0 = strArr;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S1300000_1(Map map, Map<String, ? extends Object> map2, C04AS c04as, Map<String, ? extends Object> map3, String str) {
        super(1);
        this.$t = str;
        this.l1 = map;
        this.l2 = map2;
        this.l3 = c04as;
        this.s0 = map3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S1300000_1(SeaPdpInfoViewHolder seaPdpInfoViewHolder, PdpPaymentModule pdpPaymentModule, CommerceProductInfoView commerceProductInfoView, String str, C10321041v c10321041v, int i) {
        super(1);
        this.$t = i;
        this.l1 = seaPdpInfoViewHolder;
        this.l2 = pdpPaymentModule;
        this.l3 = commerceProductInfoView;
        this.s0 = str;
    }
}
