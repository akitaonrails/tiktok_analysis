package com.ss.android.ugc.aweme.search.middle.decoupling.wrapper;

import X.C1051660dTQ;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.search.middle.decoupling.basenonbiz.AbsDecouplingBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchKeywordChangeMethodWrapper extends AbsDecouplingBridgeMethod.DecouplingBridgeMethod {
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.search.middle.decoupling.basenonbiz.AbsDecouplingBridgeMethod.DecouplingBridgeMethod, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SearchKeywordChangeMethodWrapper(final C1051660dTQ c1051660dTQ) {
        super(new AbsDecouplingBridgeMethod(c1051660dTQ) { // from class: X.0Q3U
            public final String LIZJ = "searchKeywordChange";
            public final C663340Q0e LIZLLL;
            public InterfaceC1058710den LJ;

            @Override // X.InterfaceC686000QvW
            public final String getName() {
                return this.LIZJ;
            }

            {
                this.LIZLLL = new C663340Q0e(c1051660dTQ, "searchKeywordChange", EnumC663360Q0g.STABLE);
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:136:0x0242  */
            /* JADX WARN: Removed duplicated region for block: B:145:0x026b  */
            /* JADX WARN: Removed duplicated region for block: B:167:0x02ae  */
            /* JADX WARN: Removed duplicated region for block: B:168:0x02b0 A[EDGE_INSN: B:168:0x02b0->B:172:0x02b8 BREAK  A[LOOP:0: B:169:0x02b2->B:202:0x038a]] */
            /* JADX WARN: Removed duplicated region for block: B:174:0x02c1 A[Catch: Exception -> 0x051d, TryCatch #0 {Exception -> 0x051d, blocks: (B:123:0x01ee, B:125:0x021a, B:126:0x021e, B:133:0x0232, B:134:0x0236, B:141:0x0251, B:143:0x0265, B:146:0x026d, B:149:0x0282, B:151:0x0286, B:153:0x028a, B:155:0x0290, B:156:0x0294, B:158:0x029a, B:169:0x02b2, B:171:0x02b6, B:172:0x02b8, B:174:0x02c1, B:176:0x02e1, B:178:0x02f9, B:180:0x0301, B:181:0x0305, B:183:0x0311, B:184:0x0326, B:186:0x032c, B:188:0x0332, B:190:0x033e, B:192:0x034a, B:193:0x034f, B:195:0x0359, B:197:0x0365, B:204:0x038e, B:205:0x0392, B:206:0x0395, B:208:0x039d, B:210:0x03a5, B:232:0x03e6, B:234:0x03ec, B:236:0x03f2, B:238:0x03f8, B:240:0x03fe, B:241:0x0405, B:292:0x050d, B:213:0x03ae, B:216:0x03b7, B:219:0x03c0, B:222:0x03c9, B:225:0x03d2, B:228:0x03db, B:243:0x0411, B:245:0x0415, B:248:0x041d, B:250:0x0426, B:252:0x042a, B:253:0x042e, B:255:0x0432, B:256:0x0436, B:258:0x043b, B:260:0x043f, B:262:0x0445, B:264:0x0449, B:265:0x044e, B:267:0x0452, B:200:0x0384, B:162:0x02a1, B:164:0x02a5, B:268:0x0456, B:270:0x045a, B:272:0x0472, B:273:0x0476, B:275:0x04db, B:277:0x04e4, B:278:0x04e8, B:280:0x04ec, B:281:0x04f0, B:283:0x04f4, B:285:0x04fa, B:287:0x04fe, B:288:0x0502, B:290:0x0506, B:293:0x0512, B:137:0x0244, B:139:0x024a, B:140:0x024e), top: B:301:0x01ee }] */
            /* JADX WARN: Removed duplicated region for block: B:199:0x0382  */
            /* JADX WARN: Removed duplicated region for block: B:208:0x039d A[Catch: Exception -> 0x051d, TryCatch #0 {Exception -> 0x051d, blocks: (B:123:0x01ee, B:125:0x021a, B:126:0x021e, B:133:0x0232, B:134:0x0236, B:141:0x0251, B:143:0x0265, B:146:0x026d, B:149:0x0282, B:151:0x0286, B:153:0x028a, B:155:0x0290, B:156:0x0294, B:158:0x029a, B:169:0x02b2, B:171:0x02b6, B:172:0x02b8, B:174:0x02c1, B:176:0x02e1, B:178:0x02f9, B:180:0x0301, B:181:0x0305, B:183:0x0311, B:184:0x0326, B:186:0x032c, B:188:0x0332, B:190:0x033e, B:192:0x034a, B:193:0x034f, B:195:0x0359, B:197:0x0365, B:204:0x038e, B:205:0x0392, B:206:0x0395, B:208:0x039d, B:210:0x03a5, B:232:0x03e6, B:234:0x03ec, B:236:0x03f2, B:238:0x03f8, B:240:0x03fe, B:241:0x0405, B:292:0x050d, B:213:0x03ae, B:216:0x03b7, B:219:0x03c0, B:222:0x03c9, B:225:0x03d2, B:228:0x03db, B:243:0x0411, B:245:0x0415, B:248:0x041d, B:250:0x0426, B:252:0x042a, B:253:0x042e, B:255:0x0432, B:256:0x0436, B:258:0x043b, B:260:0x043f, B:262:0x0445, B:264:0x0449, B:265:0x044e, B:267:0x0452, B:200:0x0384, B:162:0x02a1, B:164:0x02a5, B:268:0x0456, B:270:0x045a, B:272:0x0472, B:273:0x0476, B:275:0x04db, B:277:0x04e4, B:278:0x04e8, B:280:0x04ec, B:281:0x04f0, B:283:0x04f4, B:285:0x04fa, B:287:0x04fe, B:288:0x0502, B:290:0x0506, B:293:0x0512, B:137:0x0244, B:139:0x024a, B:140:0x024e), top: B:301:0x01ee }] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:243:0x0411 A[Catch: Exception -> 0x051d, TryCatch #0 {Exception -> 0x051d, blocks: (B:123:0x01ee, B:125:0x021a, B:126:0x021e, B:133:0x0232, B:134:0x0236, B:141:0x0251, B:143:0x0265, B:146:0x026d, B:149:0x0282, B:151:0x0286, B:153:0x028a, B:155:0x0290, B:156:0x0294, B:158:0x029a, B:169:0x02b2, B:171:0x02b6, B:172:0x02b8, B:174:0x02c1, B:176:0x02e1, B:178:0x02f9, B:180:0x0301, B:181:0x0305, B:183:0x0311, B:184:0x0326, B:186:0x032c, B:188:0x0332, B:190:0x033e, B:192:0x034a, B:193:0x034f, B:195:0x0359, B:197:0x0365, B:204:0x038e, B:205:0x0392, B:206:0x0395, B:208:0x039d, B:210:0x03a5, B:232:0x03e6, B:234:0x03ec, B:236:0x03f2, B:238:0x03f8, B:240:0x03fe, B:241:0x0405, B:292:0x050d, B:213:0x03ae, B:216:0x03b7, B:219:0x03c0, B:222:0x03c9, B:225:0x03d2, B:228:0x03db, B:243:0x0411, B:245:0x0415, B:248:0x041d, B:250:0x0426, B:252:0x042a, B:253:0x042e, B:255:0x0432, B:256:0x0436, B:258:0x043b, B:260:0x043f, B:262:0x0445, B:264:0x0449, B:265:0x044e, B:267:0x0452, B:200:0x0384, B:162:0x02a1, B:164:0x02a5, B:268:0x0456, B:270:0x045a, B:272:0x0472, B:273:0x0476, B:275:0x04db, B:277:0x04e4, B:278:0x04e8, B:280:0x04ec, B:281:0x04f0, B:283:0x04f4, B:285:0x04fa, B:287:0x04fe, B:288:0x0502, B:290:0x0506, B:293:0x0512, B:137:0x0244, B:139:0x024a, B:140:0x024e), top: B:301:0x01ee }] */
            /* JADX WARN: Removed duplicated region for block: B:248:0x041d A[Catch: Exception -> 0x051d, TryCatch #0 {Exception -> 0x051d, blocks: (B:123:0x01ee, B:125:0x021a, B:126:0x021e, B:133:0x0232, B:134:0x0236, B:141:0x0251, B:143:0x0265, B:146:0x026d, B:149:0x0282, B:151:0x0286, B:153:0x028a, B:155:0x0290, B:156:0x0294, B:158:0x029a, B:169:0x02b2, B:171:0x02b6, B:172:0x02b8, B:174:0x02c1, B:176:0x02e1, B:178:0x02f9, B:180:0x0301, B:181:0x0305, B:183:0x0311, B:184:0x0326, B:186:0x032c, B:188:0x0332, B:190:0x033e, B:192:0x034a, B:193:0x034f, B:195:0x0359, B:197:0x0365, B:204:0x038e, B:205:0x0392, B:206:0x0395, B:208:0x039d, B:210:0x03a5, B:232:0x03e6, B:234:0x03ec, B:236:0x03f2, B:238:0x03f8, B:240:0x03fe, B:241:0x0405, B:292:0x050d, B:213:0x03ae, B:216:0x03b7, B:219:0x03c0, B:222:0x03c9, B:225:0x03d2, B:228:0x03db, B:243:0x0411, B:245:0x0415, B:248:0x041d, B:250:0x0426, B:252:0x042a, B:253:0x042e, B:255:0x0432, B:256:0x0436, B:258:0x043b, B:260:0x043f, B:262:0x0445, B:264:0x0449, B:265:0x044e, B:267:0x0452, B:200:0x0384, B:162:0x02a1, B:164:0x02a5, B:268:0x0456, B:270:0x045a, B:272:0x0472, B:273:0x0476, B:275:0x04db, B:277:0x04e4, B:278:0x04e8, B:280:0x04ec, B:281:0x04f0, B:283:0x04f4, B:285:0x04fa, B:287:0x04fe, B:288:0x0502, B:290:0x0506, B:293:0x0512, B:137:0x0244, B:139:0x024a, B:140:0x024e), top: B:301:0x01ee }] */
            /* JADX WARN: Removed duplicated region for block: B:250:0x0426 A[Catch: Exception -> 0x051d, TryCatch #0 {Exception -> 0x051d, blocks: (B:123:0x01ee, B:125:0x021a, B:126:0x021e, B:133:0x0232, B:134:0x0236, B:141:0x0251, B:143:0x0265, B:146:0x026d, B:149:0x0282, B:151:0x0286, B:153:0x028a, B:155:0x0290, B:156:0x0294, B:158:0x029a, B:169:0x02b2, B:171:0x02b6, B:172:0x02b8, B:174:0x02c1, B:176:0x02e1, B:178:0x02f9, B:180:0x0301, B:181:0x0305, B:183:0x0311, B:184:0x0326, B:186:0x032c, B:188:0x0332, B:190:0x033e, B:192:0x034a, B:193:0x034f, B:195:0x0359, B:197:0x0365, B:204:0x038e, B:205:0x0392, B:206:0x0395, B:208:0x039d, B:210:0x03a5, B:232:0x03e6, B:234:0x03ec, B:236:0x03f2, B:238:0x03f8, B:240:0x03fe, B:241:0x0405, B:292:0x050d, B:213:0x03ae, B:216:0x03b7, B:219:0x03c0, B:222:0x03c9, B:225:0x03d2, B:228:0x03db, B:243:0x0411, B:245:0x0415, B:248:0x041d, B:250:0x0426, B:252:0x042a, B:253:0x042e, B:255:0x0432, B:256:0x0436, B:258:0x043b, B:260:0x043f, B:262:0x0445, B:264:0x0449, B:265:0x044e, B:267:0x0452, B:200:0x0384, B:162:0x02a1, B:164:0x02a5, B:268:0x0456, B:270:0x045a, B:272:0x0472, B:273:0x0476, B:275:0x04db, B:277:0x04e4, B:278:0x04e8, B:280:0x04ec, B:281:0x04f0, B:283:0x04f4, B:285:0x04fa, B:287:0x04fe, B:288:0x0502, B:290:0x0506, B:293:0x0512, B:137:0x0244, B:139:0x024a, B:140:0x024e), top: B:301:0x01ee }] */
            /* JADX WARN: Removed duplicated region for block: B:258:0x043b A[Catch: Exception -> 0x051d, TryCatch #0 {Exception -> 0x051d, blocks: (B:123:0x01ee, B:125:0x021a, B:126:0x021e, B:133:0x0232, B:134:0x0236, B:141:0x0251, B:143:0x0265, B:146:0x026d, B:149:0x0282, B:151:0x0286, B:153:0x028a, B:155:0x0290, B:156:0x0294, B:158:0x029a, B:169:0x02b2, B:171:0x02b6, B:172:0x02b8, B:174:0x02c1, B:176:0x02e1, B:178:0x02f9, B:180:0x0301, B:181:0x0305, B:183:0x0311, B:184:0x0326, B:186:0x032c, B:188:0x0332, B:190:0x033e, B:192:0x034a, B:193:0x034f, B:195:0x0359, B:197:0x0365, B:204:0x038e, B:205:0x0392, B:206:0x0395, B:208:0x039d, B:210:0x03a5, B:232:0x03e6, B:234:0x03ec, B:236:0x03f2, B:238:0x03f8, B:240:0x03fe, B:241:0x0405, B:292:0x050d, B:213:0x03ae, B:216:0x03b7, B:219:0x03c0, B:222:0x03c9, B:225:0x03d2, B:228:0x03db, B:243:0x0411, B:245:0x0415, B:248:0x041d, B:250:0x0426, B:252:0x042a, B:253:0x042e, B:255:0x0432, B:256:0x0436, B:258:0x043b, B:260:0x043f, B:262:0x0445, B:264:0x0449, B:265:0x044e, B:267:0x0452, B:200:0x0384, B:162:0x02a1, B:164:0x02a5, B:268:0x0456, B:270:0x045a, B:272:0x0472, B:273:0x0476, B:275:0x04db, B:277:0x04e4, B:278:0x04e8, B:280:0x04ec, B:281:0x04f0, B:283:0x04f4, B:285:0x04fa, B:287:0x04fe, B:288:0x0502, B:290:0x0506, B:293:0x0512, B:137:0x0244, B:139:0x024a, B:140:0x024e), top: B:301:0x01ee }] */
            /* JADX WARN: Removed duplicated region for block: B:268:0x0456 A[Catch: Exception -> 0x051d, TryCatch #0 {Exception -> 0x051d, blocks: (B:123:0x01ee, B:125:0x021a, B:126:0x021e, B:133:0x0232, B:134:0x0236, B:141:0x0251, B:143:0x0265, B:146:0x026d, B:149:0x0282, B:151:0x0286, B:153:0x028a, B:155:0x0290, B:156:0x0294, B:158:0x029a, B:169:0x02b2, B:171:0x02b6, B:172:0x02b8, B:174:0x02c1, B:176:0x02e1, B:178:0x02f9, B:180:0x0301, B:181:0x0305, B:183:0x0311, B:184:0x0326, B:186:0x032c, B:188:0x0332, B:190:0x033e, B:192:0x034a, B:193:0x034f, B:195:0x0359, B:197:0x0365, B:204:0x038e, B:205:0x0392, B:206:0x0395, B:208:0x039d, B:210:0x03a5, B:232:0x03e6, B:234:0x03ec, B:236:0x03f2, B:238:0x03f8, B:240:0x03fe, B:241:0x0405, B:292:0x050d, B:213:0x03ae, B:216:0x03b7, B:219:0x03c0, B:222:0x03c9, B:225:0x03d2, B:228:0x03db, B:243:0x0411, B:245:0x0415, B:248:0x041d, B:250:0x0426, B:252:0x042a, B:253:0x042e, B:255:0x0432, B:256:0x0436, B:258:0x043b, B:260:0x043f, B:262:0x0445, B:264:0x0449, B:265:0x044e, B:267:0x0452, B:200:0x0384, B:162:0x02a1, B:164:0x02a5, B:268:0x0456, B:270:0x045a, B:272:0x0472, B:273:0x0476, B:275:0x04db, B:277:0x04e4, B:278:0x04e8, B:280:0x04ec, B:281:0x04f0, B:283:0x04f4, B:285:0x04fa, B:287:0x04fe, B:288:0x0502, B:290:0x0506, B:293:0x0512, B:137:0x0244, B:139:0x024a, B:140:0x024e), top: B:301:0x01ee }] */
            /* JADX WARN: Removed duplicated region for block: B:292:0x050d A[Catch: Exception -> 0x051d, TryCatch #0 {Exception -> 0x051d, blocks: (B:123:0x01ee, B:125:0x021a, B:126:0x021e, B:133:0x0232, B:134:0x0236, B:141:0x0251, B:143:0x0265, B:146:0x026d, B:149:0x0282, B:151:0x0286, B:153:0x028a, B:155:0x0290, B:156:0x0294, B:158:0x029a, B:169:0x02b2, B:171:0x02b6, B:172:0x02b8, B:174:0x02c1, B:176:0x02e1, B:178:0x02f9, B:180:0x0301, B:181:0x0305, B:183:0x0311, B:184:0x0326, B:186:0x032c, B:188:0x0332, B:190:0x033e, B:192:0x034a, B:193:0x034f, B:195:0x0359, B:197:0x0365, B:204:0x038e, B:205:0x0392, B:206:0x0395, B:208:0x039d, B:210:0x03a5, B:232:0x03e6, B:234:0x03ec, B:236:0x03f2, B:238:0x03f8, B:240:0x03fe, B:241:0x0405, B:292:0x050d, B:213:0x03ae, B:216:0x03b7, B:219:0x03c0, B:222:0x03c9, B:225:0x03d2, B:228:0x03db, B:243:0x0411, B:245:0x0415, B:248:0x041d, B:250:0x0426, B:252:0x042a, B:253:0x042e, B:255:0x0432, B:256:0x0436, B:258:0x043b, B:260:0x043f, B:262:0x0445, B:264:0x0449, B:265:0x044e, B:267:0x0452, B:200:0x0384, B:162:0x02a1, B:164:0x02a5, B:268:0x0456, B:270:0x045a, B:272:0x0472, B:273:0x0476, B:275:0x04db, B:277:0x04e4, B:278:0x04e8, B:280:0x04ec, B:281:0x04f0, B:283:0x04f4, B:285:0x04fa, B:287:0x04fe, B:288:0x0502, B:290:0x0506, B:293:0x0512, B:137:0x0244, B:139:0x024a, B:140:0x024e), top: B:301:0x01ee }] */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[EDGE_INSN: B:30:0x0089->B:303:0x00f5 BREAK  A[LOOP:2: B:37:0x009a->B:313:?]] */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
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
            @Override // com.ss.android.ugc.aweme.search.middle.decoupling.basenonbiz.AbsDecouplingBridgeMethod
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod r25, org.json.JSONObject r26, X.InterfaceC1019840ce6 r27) {
                /*
                    Method dump skipped, instruction units count: 1354
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0Q3U.LIZIZ(com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, org.json.JSONObject, X.0ce6):void");
            }

            @Override // com.ss.android.ugc.aweme.search.middle.decoupling.basenonbiz.AbsDecouplingBridgeMethod
            public final void LIZJ(BaseBridgeMethod baseBridgeMethod, JSONObject jSONObject, InterfaceC1058710den interfaceC1058710den) {
                View viewE1;
                super.LIZJ(baseBridgeMethod, jSONObject, interfaceC1058710den);
                this.LJ = interfaceC1058710den;
                InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) baseBridgeMethod.contextProviderFactory.LIZIZ(InterfaceC1541990qEH.class);
                if (interfaceC1541990qEH != null) {
                    viewE1 = interfaceC1541990qEH.e1();
                } else {
                    viewE1 = null;
                }
                new C667750QHd(LIZ(), C651580Ph6.LIZLLL(viewE1)).LJFF(jSONObject.optString("impr_id"));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x01a1  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static void LIZLLL(android.view.View r16, androidx.fragment.app.Fragment r17, X.C19EG r18, java.lang.String r19, org.json.JSONObject r20) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 425
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0Q3U.LIZLLL(android.view.View, androidx.fragment.app.Fragment, X.19EG, java.lang.String, org.json.JSONObject):void");
            }
        }, new AbsDecouplingBridgeMethod(c1051660dTQ) { // from class: X.0Q3V
            public final String LIZJ = "searchKeywordChange";
            public final C663340Q0e LIZLLL;
            public InterfaceC1058710den LJ;

            @Override // X.InterfaceC686000QvW
            public final String getName() {
                return this.LIZJ;
            }

            {
                this.LIZLLL = new C663340Q0e(c1051660dTQ, "searchKeywordChange", EnumC663360Q0g.STABLE);
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:133:0x022e  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x0257  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x029a  */
            /* JADX WARN: Removed duplicated region for block: B:165:0x029c A[EDGE_INSN: B:165:0x029c->B:169:0x02a4 BREAK  A[LOOP:0: B:166:0x029e->B:199:0x0374]] */
            /* JADX WARN: Removed duplicated region for block: B:171:0x02ad A[Catch: Exception -> 0x04f2, TryCatch #1 {Exception -> 0x04f2, blocks: (B:120:0x01da, B:122:0x0206, B:123:0x020a, B:130:0x021e, B:131:0x0222, B:138:0x023d, B:140:0x0251, B:143:0x0259, B:146:0x026e, B:148:0x0272, B:150:0x0276, B:152:0x027c, B:153:0x0280, B:155:0x0286, B:166:0x029e, B:168:0x02a2, B:169:0x02a4, B:171:0x02ad, B:173:0x02cd, B:175:0x02e5, B:177:0x02ed, B:178:0x02f1, B:180:0x02fb, B:181:0x0310, B:183:0x0316, B:185:0x031c, B:187:0x0328, B:189:0x0334, B:190:0x0339, B:192:0x0343, B:194:0x034f, B:201:0x0378, B:202:0x037c, B:203:0x037f, B:205:0x0387, B:207:0x038f, B:229:0x03ce, B:231:0x03d4, B:233:0x03da, B:284:0x04e2, B:210:0x0398, B:213:0x03a1, B:216:0x03aa, B:219:0x03b1, B:222:0x03ba, B:225:0x03c3, B:235:0x03e6, B:237:0x03ea, B:240:0x03f2, B:242:0x03fb, B:244:0x03ff, B:245:0x0403, B:247:0x0407, B:248:0x040b, B:250:0x0410, B:252:0x0414, B:254:0x041a, B:256:0x041e, B:257:0x0423, B:259:0x0427, B:197:0x036e, B:159:0x028d, B:161:0x0291, B:260:0x042b, B:262:0x042f, B:264:0x0447, B:265:0x044b, B:267:0x04b0, B:269:0x04b9, B:270:0x04bd, B:272:0x04c1, B:273:0x04c5, B:275:0x04c9, B:277:0x04cf, B:279:0x04d3, B:280:0x04d7, B:282:0x04db, B:285:0x04e7, B:134:0x0230, B:136:0x0236, B:137:0x023a), top: B:294:0x01da }] */
            /* JADX WARN: Removed duplicated region for block: B:196:0x036c  */
            /* JADX WARN: Removed duplicated region for block: B:205:0x0387 A[Catch: Exception -> 0x04f2, TryCatch #1 {Exception -> 0x04f2, blocks: (B:120:0x01da, B:122:0x0206, B:123:0x020a, B:130:0x021e, B:131:0x0222, B:138:0x023d, B:140:0x0251, B:143:0x0259, B:146:0x026e, B:148:0x0272, B:150:0x0276, B:152:0x027c, B:153:0x0280, B:155:0x0286, B:166:0x029e, B:168:0x02a2, B:169:0x02a4, B:171:0x02ad, B:173:0x02cd, B:175:0x02e5, B:177:0x02ed, B:178:0x02f1, B:180:0x02fb, B:181:0x0310, B:183:0x0316, B:185:0x031c, B:187:0x0328, B:189:0x0334, B:190:0x0339, B:192:0x0343, B:194:0x034f, B:201:0x0378, B:202:0x037c, B:203:0x037f, B:205:0x0387, B:207:0x038f, B:229:0x03ce, B:231:0x03d4, B:233:0x03da, B:284:0x04e2, B:210:0x0398, B:213:0x03a1, B:216:0x03aa, B:219:0x03b1, B:222:0x03ba, B:225:0x03c3, B:235:0x03e6, B:237:0x03ea, B:240:0x03f2, B:242:0x03fb, B:244:0x03ff, B:245:0x0403, B:247:0x0407, B:248:0x040b, B:250:0x0410, B:252:0x0414, B:254:0x041a, B:256:0x041e, B:257:0x0423, B:259:0x0427, B:197:0x036e, B:159:0x028d, B:161:0x0291, B:260:0x042b, B:262:0x042f, B:264:0x0447, B:265:0x044b, B:267:0x04b0, B:269:0x04b9, B:270:0x04bd, B:272:0x04c1, B:273:0x04c5, B:275:0x04c9, B:277:0x04cf, B:279:0x04d3, B:280:0x04d7, B:282:0x04db, B:285:0x04e7, B:134:0x0230, B:136:0x0236, B:137:0x023a), top: B:294:0x01da }] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:235:0x03e6 A[Catch: Exception -> 0x04f2, TryCatch #1 {Exception -> 0x04f2, blocks: (B:120:0x01da, B:122:0x0206, B:123:0x020a, B:130:0x021e, B:131:0x0222, B:138:0x023d, B:140:0x0251, B:143:0x0259, B:146:0x026e, B:148:0x0272, B:150:0x0276, B:152:0x027c, B:153:0x0280, B:155:0x0286, B:166:0x029e, B:168:0x02a2, B:169:0x02a4, B:171:0x02ad, B:173:0x02cd, B:175:0x02e5, B:177:0x02ed, B:178:0x02f1, B:180:0x02fb, B:181:0x0310, B:183:0x0316, B:185:0x031c, B:187:0x0328, B:189:0x0334, B:190:0x0339, B:192:0x0343, B:194:0x034f, B:201:0x0378, B:202:0x037c, B:203:0x037f, B:205:0x0387, B:207:0x038f, B:229:0x03ce, B:231:0x03d4, B:233:0x03da, B:284:0x04e2, B:210:0x0398, B:213:0x03a1, B:216:0x03aa, B:219:0x03b1, B:222:0x03ba, B:225:0x03c3, B:235:0x03e6, B:237:0x03ea, B:240:0x03f2, B:242:0x03fb, B:244:0x03ff, B:245:0x0403, B:247:0x0407, B:248:0x040b, B:250:0x0410, B:252:0x0414, B:254:0x041a, B:256:0x041e, B:257:0x0423, B:259:0x0427, B:197:0x036e, B:159:0x028d, B:161:0x0291, B:260:0x042b, B:262:0x042f, B:264:0x0447, B:265:0x044b, B:267:0x04b0, B:269:0x04b9, B:270:0x04bd, B:272:0x04c1, B:273:0x04c5, B:275:0x04c9, B:277:0x04cf, B:279:0x04d3, B:280:0x04d7, B:282:0x04db, B:285:0x04e7, B:134:0x0230, B:136:0x0236, B:137:0x023a), top: B:294:0x01da }] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:240:0x03f2 A[Catch: Exception -> 0x04f2, TryCatch #1 {Exception -> 0x04f2, blocks: (B:120:0x01da, B:122:0x0206, B:123:0x020a, B:130:0x021e, B:131:0x0222, B:138:0x023d, B:140:0x0251, B:143:0x0259, B:146:0x026e, B:148:0x0272, B:150:0x0276, B:152:0x027c, B:153:0x0280, B:155:0x0286, B:166:0x029e, B:168:0x02a2, B:169:0x02a4, B:171:0x02ad, B:173:0x02cd, B:175:0x02e5, B:177:0x02ed, B:178:0x02f1, B:180:0x02fb, B:181:0x0310, B:183:0x0316, B:185:0x031c, B:187:0x0328, B:189:0x0334, B:190:0x0339, B:192:0x0343, B:194:0x034f, B:201:0x0378, B:202:0x037c, B:203:0x037f, B:205:0x0387, B:207:0x038f, B:229:0x03ce, B:231:0x03d4, B:233:0x03da, B:284:0x04e2, B:210:0x0398, B:213:0x03a1, B:216:0x03aa, B:219:0x03b1, B:222:0x03ba, B:225:0x03c3, B:235:0x03e6, B:237:0x03ea, B:240:0x03f2, B:242:0x03fb, B:244:0x03ff, B:245:0x0403, B:247:0x0407, B:248:0x040b, B:250:0x0410, B:252:0x0414, B:254:0x041a, B:256:0x041e, B:257:0x0423, B:259:0x0427, B:197:0x036e, B:159:0x028d, B:161:0x0291, B:260:0x042b, B:262:0x042f, B:264:0x0447, B:265:0x044b, B:267:0x04b0, B:269:0x04b9, B:270:0x04bd, B:272:0x04c1, B:273:0x04c5, B:275:0x04c9, B:277:0x04cf, B:279:0x04d3, B:280:0x04d7, B:282:0x04db, B:285:0x04e7, B:134:0x0230, B:136:0x0236, B:137:0x023a), top: B:294:0x01da }] */
            /* JADX WARN: Removed duplicated region for block: B:242:0x03fb A[Catch: Exception -> 0x04f2, TryCatch #1 {Exception -> 0x04f2, blocks: (B:120:0x01da, B:122:0x0206, B:123:0x020a, B:130:0x021e, B:131:0x0222, B:138:0x023d, B:140:0x0251, B:143:0x0259, B:146:0x026e, B:148:0x0272, B:150:0x0276, B:152:0x027c, B:153:0x0280, B:155:0x0286, B:166:0x029e, B:168:0x02a2, B:169:0x02a4, B:171:0x02ad, B:173:0x02cd, B:175:0x02e5, B:177:0x02ed, B:178:0x02f1, B:180:0x02fb, B:181:0x0310, B:183:0x0316, B:185:0x031c, B:187:0x0328, B:189:0x0334, B:190:0x0339, B:192:0x0343, B:194:0x034f, B:201:0x0378, B:202:0x037c, B:203:0x037f, B:205:0x0387, B:207:0x038f, B:229:0x03ce, B:231:0x03d4, B:233:0x03da, B:284:0x04e2, B:210:0x0398, B:213:0x03a1, B:216:0x03aa, B:219:0x03b1, B:222:0x03ba, B:225:0x03c3, B:235:0x03e6, B:237:0x03ea, B:240:0x03f2, B:242:0x03fb, B:244:0x03ff, B:245:0x0403, B:247:0x0407, B:248:0x040b, B:250:0x0410, B:252:0x0414, B:254:0x041a, B:256:0x041e, B:257:0x0423, B:259:0x0427, B:197:0x036e, B:159:0x028d, B:161:0x0291, B:260:0x042b, B:262:0x042f, B:264:0x0447, B:265:0x044b, B:267:0x04b0, B:269:0x04b9, B:270:0x04bd, B:272:0x04c1, B:273:0x04c5, B:275:0x04c9, B:277:0x04cf, B:279:0x04d3, B:280:0x04d7, B:282:0x04db, B:285:0x04e7, B:134:0x0230, B:136:0x0236, B:137:0x023a), top: B:294:0x01da }] */
            /* JADX WARN: Removed duplicated region for block: B:250:0x0410 A[Catch: Exception -> 0x04f2, TryCatch #1 {Exception -> 0x04f2, blocks: (B:120:0x01da, B:122:0x0206, B:123:0x020a, B:130:0x021e, B:131:0x0222, B:138:0x023d, B:140:0x0251, B:143:0x0259, B:146:0x026e, B:148:0x0272, B:150:0x0276, B:152:0x027c, B:153:0x0280, B:155:0x0286, B:166:0x029e, B:168:0x02a2, B:169:0x02a4, B:171:0x02ad, B:173:0x02cd, B:175:0x02e5, B:177:0x02ed, B:178:0x02f1, B:180:0x02fb, B:181:0x0310, B:183:0x0316, B:185:0x031c, B:187:0x0328, B:189:0x0334, B:190:0x0339, B:192:0x0343, B:194:0x034f, B:201:0x0378, B:202:0x037c, B:203:0x037f, B:205:0x0387, B:207:0x038f, B:229:0x03ce, B:231:0x03d4, B:233:0x03da, B:284:0x04e2, B:210:0x0398, B:213:0x03a1, B:216:0x03aa, B:219:0x03b1, B:222:0x03ba, B:225:0x03c3, B:235:0x03e6, B:237:0x03ea, B:240:0x03f2, B:242:0x03fb, B:244:0x03ff, B:245:0x0403, B:247:0x0407, B:248:0x040b, B:250:0x0410, B:252:0x0414, B:254:0x041a, B:256:0x041e, B:257:0x0423, B:259:0x0427, B:197:0x036e, B:159:0x028d, B:161:0x0291, B:260:0x042b, B:262:0x042f, B:264:0x0447, B:265:0x044b, B:267:0x04b0, B:269:0x04b9, B:270:0x04bd, B:272:0x04c1, B:273:0x04c5, B:275:0x04c9, B:277:0x04cf, B:279:0x04d3, B:280:0x04d7, B:282:0x04db, B:285:0x04e7, B:134:0x0230, B:136:0x0236, B:137:0x023a), top: B:294:0x01da }] */
            /* JADX WARN: Removed duplicated region for block: B:260:0x042b A[Catch: Exception -> 0x04f2, TryCatch #1 {Exception -> 0x04f2, blocks: (B:120:0x01da, B:122:0x0206, B:123:0x020a, B:130:0x021e, B:131:0x0222, B:138:0x023d, B:140:0x0251, B:143:0x0259, B:146:0x026e, B:148:0x0272, B:150:0x0276, B:152:0x027c, B:153:0x0280, B:155:0x0286, B:166:0x029e, B:168:0x02a2, B:169:0x02a4, B:171:0x02ad, B:173:0x02cd, B:175:0x02e5, B:177:0x02ed, B:178:0x02f1, B:180:0x02fb, B:181:0x0310, B:183:0x0316, B:185:0x031c, B:187:0x0328, B:189:0x0334, B:190:0x0339, B:192:0x0343, B:194:0x034f, B:201:0x0378, B:202:0x037c, B:203:0x037f, B:205:0x0387, B:207:0x038f, B:229:0x03ce, B:231:0x03d4, B:233:0x03da, B:284:0x04e2, B:210:0x0398, B:213:0x03a1, B:216:0x03aa, B:219:0x03b1, B:222:0x03ba, B:225:0x03c3, B:235:0x03e6, B:237:0x03ea, B:240:0x03f2, B:242:0x03fb, B:244:0x03ff, B:245:0x0403, B:247:0x0407, B:248:0x040b, B:250:0x0410, B:252:0x0414, B:254:0x041a, B:256:0x041e, B:257:0x0423, B:259:0x0427, B:197:0x036e, B:159:0x028d, B:161:0x0291, B:260:0x042b, B:262:0x042f, B:264:0x0447, B:265:0x044b, B:267:0x04b0, B:269:0x04b9, B:270:0x04bd, B:272:0x04c1, B:273:0x04c5, B:275:0x04c9, B:277:0x04cf, B:279:0x04d3, B:280:0x04d7, B:282:0x04db, B:285:0x04e7, B:134:0x0230, B:136:0x0236, B:137:0x023a), top: B:294:0x01da }] */
            /* JADX WARN: Removed duplicated region for block: B:284:0x04e2 A[Catch: Exception -> 0x04f2, TryCatch #1 {Exception -> 0x04f2, blocks: (B:120:0x01da, B:122:0x0206, B:123:0x020a, B:130:0x021e, B:131:0x0222, B:138:0x023d, B:140:0x0251, B:143:0x0259, B:146:0x026e, B:148:0x0272, B:150:0x0276, B:152:0x027c, B:153:0x0280, B:155:0x0286, B:166:0x029e, B:168:0x02a2, B:169:0x02a4, B:171:0x02ad, B:173:0x02cd, B:175:0x02e5, B:177:0x02ed, B:178:0x02f1, B:180:0x02fb, B:181:0x0310, B:183:0x0316, B:185:0x031c, B:187:0x0328, B:189:0x0334, B:190:0x0339, B:192:0x0343, B:194:0x034f, B:201:0x0378, B:202:0x037c, B:203:0x037f, B:205:0x0387, B:207:0x038f, B:229:0x03ce, B:231:0x03d4, B:233:0x03da, B:284:0x04e2, B:210:0x0398, B:213:0x03a1, B:216:0x03aa, B:219:0x03b1, B:222:0x03ba, B:225:0x03c3, B:235:0x03e6, B:237:0x03ea, B:240:0x03f2, B:242:0x03fb, B:244:0x03ff, B:245:0x0403, B:247:0x0407, B:248:0x040b, B:250:0x0410, B:252:0x0414, B:254:0x041a, B:256:0x041e, B:257:0x0423, B:259:0x0427, B:197:0x036e, B:159:0x028d, B:161:0x0291, B:260:0x042b, B:262:0x042f, B:264:0x0447, B:265:0x044b, B:267:0x04b0, B:269:0x04b9, B:270:0x04bd, B:272:0x04c1, B:273:0x04c5, B:275:0x04c9, B:277:0x04cf, B:279:0x04d3, B:280:0x04d7, B:282:0x04db, B:285:0x04e7, B:134:0x0230, B:136:0x0236, B:137:0x023a), top: B:294:0x01da }] */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[EDGE_INSN: B:30:0x0088->B:31:0x0089 BREAK  A[LOOP:2: B:38:0x009a->B:305:?]] */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
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
            @Override // com.ss.android.ugc.aweme.search.middle.decoupling.basenonbiz.AbsDecouplingBridgeMethod
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod r24, org.json.JSONObject r25, X.InterfaceC1019840ce6 r26) {
                /*
                    Method dump skipped, instruction units count: 1310
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0Q3V.LIZIZ(com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, org.json.JSONObject, X.0ce6):void");
            }

            @Override // com.ss.android.ugc.aweme.search.middle.decoupling.basenonbiz.AbsDecouplingBridgeMethod
            public final void LIZJ(BaseBridgeMethod baseBridgeMethod, JSONObject jSONObject, InterfaceC1058710den interfaceC1058710den) {
                View viewE1;
                super.LIZJ(baseBridgeMethod, jSONObject, interfaceC1058710den);
                this.LJ = interfaceC1058710den;
                InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) baseBridgeMethod.contextProviderFactory.LIZIZ(InterfaceC1541990qEH.class);
                if (interfaceC1541990qEH != null) {
                    viewE1 = interfaceC1541990qEH.e1();
                } else {
                    viewE1 = null;
                }
                new C667750QHd(LIZ(), C651580Ph6.LIZLLL(viewE1)).LJFF(jSONObject.optString("impr_id"));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static void LIZLLL(androidx.fragment.app.Fragment r12, X.C19EG r13, java.lang.String r14, org.json.JSONObject r15) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 262
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0Q3V.LIZLLL(androidx.fragment.app.Fragment, X.19EG, java.lang.String, org.json.JSONObject):void");
            }
        }, c1051660dTQ);
    }
}
