package kotlin.jvm.internal;

import X.C09AY;
import X.C1248930ibb;
import X.C13IQ;
import X.C705930RmZ;
import android.content.Context;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkStickerStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarBaseComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS4S1401000_19 extends C09AY implements Function1 {
    public final int $t;
    public int i5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS4S1401000_19 r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS4S1401000_19.invoke$0(kotlin.jvm.internal.AwS4S1401000_19, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS4S1401000_19 awS4S1401000_19, Object obj) {
        Assembler assembler = (Assembler) obj;
        ProfileNavBarBaseComponent profileNavBarBaseComponent = (ProfileNavBarBaseComponent) awS4S1401000_19.l1;
        assembler.EQ2(profileNavBarBaseComponent, new AwS21S1201000_19(profileNavBarBaseComponent, awS4S1401000_19.i5, (ProfileComponents) awS4S1401000_19.l3, awS4S1401000_19.s0, 2));
        ProfileNavBarBaseComponent profileNavBarBaseComponent2 = (ProfileNavBarBaseComponent) awS4S1401000_19.l1;
        assembler.QQ2(profileNavBarBaseComponent2, new AwS87S1200000_2((C13IQ) awS4S1401000_19.l4, (C13IQ<? extends UIContentAssem>) awS4S1401000_19.s0, (String) profileNavBarBaseComponent2, (ProfileNavBarBaseComponent) 13));
        ((ProfileNavBarBaseComponent) awS4S1401000_19.l1).LLJILJILJ.put(((C1248930ibb) awS4S1401000_19.l2).LIZ, Integer.valueOf(awS4S1401000_19.i5));
        ((ProfileNavBarBaseComponent) awS4S1401000_19.l1).LLJILJIL.put(awS4S1401000_19.s0, ((C1248930ibb) awS4S1401000_19.l2).LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S1401000_19(int i, Context context, AttributionLinkStickerStruct attributionLinkStickerStruct, Aweme aweme, C705930RmZ c705930RmZ, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = c705930RmZ;
        this.s0 = str;
        this.i5 = i;
        this.l2 = aweme;
        this.l3 = attributionLinkStickerStruct;
        this.l4 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S1401000_19(ProfileNavBarBaseComponent profileNavBarBaseComponent, ProfileNavBarBaseComponent profileNavBarBaseComponent2, C1248930ibb c1248930ibb, int i, String str, ProfileComponents profileComponents, C13IQ<? extends UIContentAssem> c13iq) {
        super(1);
        this.$t = c13iq;
        this.l1 = profileNavBarBaseComponent;
        this.l2 = profileNavBarBaseComponent2;
        this.i5 = c1248930ibb;
        this.s0 = i;
        this.l3 = str;
        this.l4 = profileComponents;
    }
}
