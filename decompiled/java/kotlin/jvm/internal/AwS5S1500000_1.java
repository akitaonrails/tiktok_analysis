package kotlin.jvm.internal;

import X.AnonymousClass0317;
import X.C034S;
import X.C09AY;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C1120604Zw;
import X.C1748730vbj;
import X.C1AQS;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.Button;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.addressitem.UsAddressItemVH;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS5S1500000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
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
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03e2 A[PHI: r13
      0x03e2: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v5 java.lang.String) binds: [B:234:0x03de, B:149:0x01dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03ef A[PHI: r21
      0x03ef: PHI (r21v1 java.lang.String) = (r21v0 java.lang.String), (r21v8 java.lang.String) binds: [B:239:0x03eb, B:124:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03f5 A[PHI: r21 r22
      0x03f5: PHI (r21v2 java.lang.String) = (r21v1 java.lang.String), (r21v7 java.lang.String), (r21v7 java.lang.String) binds: [B:242:0x03f1, B:127:0x0193, B:129:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x03f5: PHI (r22v1 java.lang.String) = (r22v0 java.lang.String), (r22v6 java.lang.String), (r22v6 java.lang.String) binds: [B:242:0x03f1, B:127:0x0193, B:129:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03fa A[PHI: r15 r21 r22
      0x03fa: PHI (r15v1 java.lang.String) = (r15v0 java.lang.String), (r15v4 java.lang.String) binds: [B:245:0x03f6, B:132:0x019d] A[DONT_GENERATE, DONT_INLINE]
      0x03fa: PHI (r21v3 java.lang.String) = (r21v2 java.lang.String), (r21v6 java.lang.String) binds: [B:245:0x03f6, B:132:0x019d] A[DONT_GENERATE, DONT_INLINE]
      0x03fa: PHI (r22v2 java.lang.String) = (r22v1 java.lang.String), (r22v5 java.lang.String) binds: [B:245:0x03f6, B:132:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS5S1500000_1 r25, java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS5S1500000_1.invoke$0(kotlin.jvm.internal.AwS5S1500000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05b6 A[PHI: r36
      0x05b6: PHI (r36v1 java.lang.String) = (r36v0 java.lang.String), (r36v8 java.lang.String) binds: [B:350:0x05b2, B:175:0x0235] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x05bc A[PHI: r36 r37
      0x05bc: PHI (r36v2 java.lang.String) = (r36v1 java.lang.String), (r36v7 java.lang.String), (r36v7 java.lang.String) binds: [B:353:0x05b8, B:178:0x023d, B:180:0x0241] A[DONT_GENERATE, DONT_INLINE]
      0x05bc: PHI (r37v1 java.lang.String) = (r37v0 java.lang.String), (r37v6 java.lang.String), (r37v6 java.lang.String) binds: [B:353:0x05b8, B:178:0x023d, B:180:0x0241] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x05c2 A[PHI: r27 r36 r37
      0x05c2: PHI (r27v1 java.lang.String) = (r27v0 java.lang.String), (r27v3 java.lang.String) binds: [B:356:0x05be, B:183:0x0249] A[DONT_GENERATE, DONT_INLINE]
      0x05c2: PHI (r36v3 java.lang.String) = (r36v2 java.lang.String), (r36v6 java.lang.String) binds: [B:356:0x05be, B:183:0x0249] A[DONT_GENERATE, DONT_INLINE]
      0x05c2: PHI (r37v2 java.lang.String) = (r37v1 java.lang.String), (r37v5 java.lang.String) binds: [B:356:0x05be, B:183:0x0249] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r35v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS5S1500000_1 r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 1493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS5S1500000_1.invoke$1(kotlin.jvm.internal.AwS5S1500000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS5S1500000_1 awS5S1500000_1, Object obj) {
        ((SeaPdpViewModel) awS5S1500000_1.l1).vR2((Context) awS5S1500000_1.l2, (View) awS5S1500000_1.l3, awS5S1500000_1.s0, awS5S1500000_1.l4, ((Boolean) obj).booleanValue(), (ExceptionUX) awS5S1500000_1.l5, null);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS5S1500000_1 awS5S1500000_1, Object obj) {
        ((PdpViewModel) awS5S1500000_1.l1).qR2((Context) awS5S1500000_1.l2, (View) awS5S1500000_1.l3, awS5S1500000_1.s0, awS5S1500000_1.l4, ((Boolean) obj).booleanValue(), (ExceptionUX) awS5S1500000_1.l5);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:218:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS5S1500000_1 r29, java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 1301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS5S1500000_1.invoke$4(kotlin.jvm.internal.AwS5S1500000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS5S1500000_1 r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS5S1500000_1.invoke$5(kotlin.jvm.internal.AwS5S1500000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$6(AwS5S1500000_1 awS5S1500000_1, Object obj) {
        String str;
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS5S1500000_1.l1).LIZIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1054104Ah c1054104Ah = (C1054104Ah) awS5S1500000_1.l1;
        int iTg2 = ((SeaPdpViewModel) awS5S1500000_1.l2).Tg2();
        c1054104Ah.getClass();
        if (iTg2 != 1) {
            if (iTg2 != 2) {
                str = "product_detail";
            } else {
                str = "shop_review";
            }
        } else {
            str = "product_review";
        }
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("previous_page", "product_detail");
        linkedHashMap.put("chat_type", String.valueOf((List) awS5S1500000_1.l3));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IAccountDependencyService.class.getName();
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        linkedHashMap.put("from_user_id", ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId());
        linkedHashMap.put("to_user_id", String.valueOf((List) awS5S1500000_1.l4));
        linkedHashMap.put("conversation_id", String.valueOf((List) awS5S1500000_1.l5));
        linkedHashMap.put("tips_type", "share_product_card");
        String str2 = awS5S1500000_1.s0;
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("tips_title", str2);
        laneParams.compareTo(laneParams, linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS5S1500000_1 awS5S1500000_1, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((UsAddressItemVH) awS5S1500000_1.l1).b6().It0(null);
        } else {
            ((UsAddressItemVH) awS5S1500000_1.l1).b6().KM(((View) awS5S1500000_1.l2).getContext(), C1748730vbj.LIZ((View) awS5S1500000_1.l2), (Address) awS5S1500000_1.l3, null, null, Integer.valueOf(((UsAddressItemVH) awS5S1500000_1.l1).LLJI), ((Button) awS5S1500000_1.l4).params, "c95166.d33409", awS5S1500000_1.s0, (Map) awS5S1500000_1.l5);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS5S1500000_1 awS5S1500000_1, Object obj) {
        String str;
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS5S1500000_1.l1).LIZIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1054004Ag c1054004Ag = (C1054004Ag) awS5S1500000_1.l1;
        int iTg2 = ((PdpViewModel) awS5S1500000_1.l2).Tg2();
        c1054004Ag.getClass();
        if (iTg2 != 1) {
            if (iTg2 != 2) {
                str = "product_detail";
            } else {
                str = "shop_review";
            }
        } else {
            str = "product_review";
        }
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("previous_page", "product_detail");
        linkedHashMap.put("chat_type", String.valueOf((List) awS5S1500000_1.l3));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IAccountDependencyService.class.getName();
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        linkedHashMap.put("from_user_id", ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId());
        linkedHashMap.put("to_user_id", String.valueOf((List) awS5S1500000_1.l4));
        linkedHashMap.put("conversation_id", String.valueOf((List) awS5S1500000_1.l5));
        linkedHashMap.put("tips_type", "share_product_card");
        String str2 = awS5S1500000_1.s0;
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("tips_title", str2);
        laneParams.compareTo(laneParams, linkedHashMap);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS5S1500000_1(android.content.Context r3, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r4, java.lang.Boolean r5, java.lang.Boolean r6, java.lang.Integer r7, java.lang.String r8, int r9) {
        /*
            r2 = this;
            r2.$t = r9
            int r9 = 4 - r9
            if (r9 == 0) goto L18
            r1 = r2
            r1.l1 = r4
            r1.l2 = r5
            r1.l3 = r3
            r1.s0 = r8
            r1.l4 = r6
            r1.l5 = r7
            r0 = 1
        L14:
            r1.<init>(r0)
            return
        L18:
            r1 = r2
            r1.l1 = r5
            r1.l2 = r4
            r1.l3 = r3
            r1.l4 = r6
            r1.s0 = r8
            r1.l5 = r7
            r0 = 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS5S1500000_1.<init>(android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS5S1500000_1(C1054004Ag c1054004Ag, C1054004Ag c1054004Ag2, PdpViewModel pdpViewModel, List<String> list, List<String> list2, List<String> list3, String str) {
        super(1);
        this.$t = str;
        this.l1 = c1054004Ag;
        this.l2 = c1054004Ag2;
        this.l3 = pdpViewModel;
        this.l4 = list;
        this.l5 = list2;
        this.s0 = list3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS5S1500000_1(C1054104Ah c1054104Ah, C1054104Ah c1054104Ah2, SeaPdpViewModel seaPdpViewModel, List<String> list, List<String> list2, List<String> list3, String str) {
        super(1);
        this.$t = str;
        this.l1 = c1054104Ah;
        this.l2 = c1054104Ah2;
        this.l3 = seaPdpViewModel;
        this.l4 = list;
        this.l5 = list2;
        this.s0 = list3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1500000_1(MiniOspViewModel miniOspViewModel, Long l, Boolean bool, Integer num, String str, Context context, int i) {
        super(1);
        this.$t = i;
        this.l1 = miniOspViewModel;
        this.l2 = l;
        this.l3 = bool;
        this.l4 = num;
        this.s0 = str;
        this.l5 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1500000_1(OrderSubmitAssemViewModel orderSubmitAssemViewModel, Long l, Boolean bool, Integer num, String str, Context context, int i) {
        super(1);
        this.$t = i;
        this.l1 = orderSubmitAssemViewModel;
        this.l2 = l;
        this.l3 = bool;
        this.l4 = num;
        this.s0 = str;
        this.l5 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1500000_1(SeaPdpViewModel seaPdpViewModel, Context context, View view, String str, Object obj, ExceptionUX exceptionUX, int i) {
        super(1);
        this.$t = i;
        this.l1 = seaPdpViewModel;
        this.l2 = context;
        this.l3 = view;
        this.s0 = str;
        this.l4 = obj;
        this.l5 = exceptionUX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1500000_1(PdpViewModel pdpViewModel, Context context, View view, String str, Object obj, ExceptionUX exceptionUX, int i) {
        super(1);
        this.$t = i;
        this.l1 = pdpViewModel;
        this.l2 = context;
        this.l3 = view;
        this.s0 = str;
        this.l4 = obj;
        this.l5 = exceptionUX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS5S1500000_1(UsAddressItemVH usAddressItemVH, UsAddressItemVH usAddressItemVH2, View view, Address address, Button button, String str, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l1 = usAddressItemVH;
        this.l2 = usAddressItemVH2;
        this.l3 = view;
        this.l4 = address;
        this.s0 = button;
        this.l5 = str;
    }
}
