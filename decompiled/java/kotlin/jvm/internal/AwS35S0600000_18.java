package kotlin.jvm.internal;

import X.C09AY;
import X.C1171050gZz;
import X.C1192810h95;
import X.C1397620mTQ;
import X.C1397660mTU;
import X.C1749280vcc;
import X.C197039127h;
import X.C20642515q3;
import X.C291001Au;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.AddVideoAssem;
import com.ss.android.ugc.aweme.poi.osp.repo.model.ButtonAction;
import com.ss.android.ugc.aweme.poi.osp.repo.model.ButtonActionPayload;
import com.ss.android.ugc.aweme.poi.osp.repo.model.DialogContent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS35S0600000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$0(kotlin.jvm.internal.AwS35S0600000_18 r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS35S0600000_18.invoke$0(kotlin.jvm.internal.AwS35S0600000_18, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS35S0600000_18 awS35S0600000_18, Object obj) {
        int iIntValue;
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        C1192810h95 c1192810h95 = C1192810h95.LIZ;
        List<ButtonAction> list = ((DialogContent) awS35S0600000_18.l0).actionList;
        final Function0 function0 = (Function0) awS35S0600000_18.l1;
        final Function0 function02 = (Function0) awS35S0600000_18.l2;
        final Function0 function03 = (Function0) awS35S0600000_18.l3;
        final Function1 function1 = (Function1) awS35S0600000_18.l4;
        final Function0 function04 = (Function0) awS35S0600000_18.l5;
        c1192810h95.getClass();
        if (list != null) {
            for (final ButtonAction buttonAction : list) {
                C1192810h95 c1192810h952 = C1192810h95.LIZ;
                String str = buttonAction.text;
                if (str == null) {
                    str = "";
                }
                Integer num = buttonAction.style;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                Function1<C1397660mTU, Unit> function12 = new Function1<C1397660mTU, Unit>() { // from class: X.0h94
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(C1397660mTU c1397660mTU) {
                        String str2;
                        Integer num2 = buttonAction.type;
                        int value = EnumC1192790h93.CLOSE_PAGE.getValue();
                        if (num2 != null && num2.intValue() == value) {
                            function0.invoke();
                        } else {
                            int value2 = EnumC1192790h93.CLOSE_AND_REFRESH.getValue();
                            if (num2 != null && num2.intValue() == value2) {
                                function02.invoke();
                            } else {
                                int value3 = EnumC1192790h93.REFRESH.getValue();
                                if (num2 != null && num2.intValue() == value3) {
                                    function03.invoke();
                                } else {
                                    int value4 = EnumC1192790h93.REDIRECT.getValue();
                                    if (num2 != null && num2.intValue() == value4) {
                                        Function1<String, Unit> function13 = function1;
                                        ButtonActionPayload buttonActionPayload = buttonAction.payload;
                                        if (buttonActionPayload != null) {
                                            str2 = buttonActionPayload.schema;
                                        } else {
                                            str2 = null;
                                        }
                                        function13.invoke(str2);
                                    } else {
                                        int value5 = EnumC1192790h93.RESUBMIT_ORDER.getValue();
                                        if (num2 != null && num2.intValue() == value5) {
                                            function04.invoke();
                                        } else {
                                            EnumC1192790h93.NONE.getValue();
                                            if (num2 != null) {
                                                num2.intValue();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return Unit.LIZ;
                    }
                };
                c1192810h952.getClass();
                if (iIntValue != 0) {
                    if (iIntValue != 1) {
                        if (iIntValue != 2) {
                            c1397620mTQ.LIZJ(1, str, function12);
                        } else {
                            c1397620mTQ.LIZJ(2, str, function12);
                        }
                    } else {
                        c1397620mTQ.LIZJ(1, str, function12);
                    }
                } else {
                    c1397620mTQ.LIZJ(0, str, function12);
                }
            }
        } else {
            c1397620mTQ.LIZJ(0, C20642515q3.LJI(2131821883), null);
        }
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS35S0600000_18(C291001Au c291001Au, C291001Au<? extends List<C1171050gZz>> c291001Au2, AddVideoAssem addVideoAssem, View view, C1749280vcc c1749280vcc, Context context, C197039127h c197039127h) {
        super(1);
        this.$t = c197039127h;
        this.l0 = c291001Au;
        this.l1 = c291001Au2;
        this.l2 = addVideoAssem;
        this.l3 = view;
        this.l4 = c1749280vcc;
        this.l5 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS35S0600000_18(DialogContent dialogContent, AwS562S0100000_18 awS562S0100000_18, AwS562S0100000_18 awS562S0100000_182, AwS419S0200000_18 awS419S0200000_18, AwS597S0100000_18 awS597S0100000_18, AwS562S0100000_18 awS562S0100000_183, int i) {
        super(1);
        this.$t = i;
        this.l0 = dialogContent;
        this.l1 = awS562S0100000_18;
        this.l2 = awS562S0100000_182;
        this.l3 = awS419S0200000_18;
        this.l4 = awS597S0100000_18;
        this.l5 = awS562S0100000_183;
    }
}
