package kotlin.jvm.internal;

import X.C09AY;
import X.C19KU;
import X.C20736316Cj;
import X.C259800zU;
import X.C786410Ut5;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ImageSpan;
import android.view.ViewTreeObserver;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.tools.chat.room.model.CreationChatRoomEnterParams;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import com.ss.android.ugc.tools.data.AIChatTrackingConfig;
import com.zhiliaoapp.musically.R;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AwS54S0301000_32 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS54S0301000_32 awS54S0301000_32, Object obj) {
        final ImageSpan imageSpan = (ImageSpan) obj;
        ((C19KU) awS54S0301000_32.l0).LLILLJJLI.setText((SpannableStringBuilder) awS54S0301000_32.l1);
        C19KU c19ku = (C19KU) awS54S0301000_32.l0;
        c19ku.LLILLJJLI.setTextColor(C20736316Cj.LIZIZ(R.attr.c9j, c19ku.LLIZLLLIL));
        ((C19KU) awS54S0301000_32.l0).LLILLJJLI.invalidate();
        if (((C259800zU) awS54S0301000_32.l2).element != 0) {
            ((C19KU) awS54S0301000_32.l0).LLILLJJLI.setMovementMethod(LinkMovementMethod.getInstance());
            ViewTreeObserver viewTreeObserver = ((C19KU) awS54S0301000_32.l0).LLILLJJLI.getViewTreeObserver();
            final C19KU c19ku2 = (C19KU) awS54S0301000_32.l0;
            final SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) awS54S0301000_32.l1;
            final C259800zU c259800zU = (C259800zU) awS54S0301000_32.l2;
            final int i = awS54S0301000_32.i3;
            C786410Ut5.y3(viewTreeObserver, new ViewTreeObserver.OnPreDrawListener() { // from class: X.19KT
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    C786410Ut5.D3(c19ku2.LLILLJJLI.getViewTreeObserver(), this);
                    Layout layout = c19ku2.LLILLJJLI.getLayout();
                    if (layout == null) {
                        return false;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    C259800zU<ImageSpan> c259800zU2 = c259800zU;
                    ImageSpan imageSpan2 = imageSpan;
                    int i2 = i;
                    C19KU c19ku3 = c19ku2;
                    if (layout.getLineForOffset(spannableStringBuilder2.getSpanStart(c259800zU2.element)) == layout.getLineForOffset(spannableStringBuilder2.getSpanStart(imageSpan2))) {
                        return false;
                    }
                    spannableStringBuilder2.replace(i2 - 2, i2 - 1, (CharSequence) "\n");
                    c19ku3.LLILLJJLI.setText(spannableStringBuilder2);
                    return true;
                }
            });
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS54S0301000_32 awS54S0301000_32, Object obj) {
        String str = (String) obj;
        String creationId = new CreativeInfo(null, 0, null, 7, null).getCreationId();
        AIChatTrackingConfig aIChatTrackingConfig = ((AIChatPageConfig) awS54S0301000_32.l0).tracking;
        String str2 = aIChatTrackingConfig.enterFrom;
        String str3 = aIChatTrackingConfig.enterMethod;
        String str4 = aIChatTrackingConfig.sessionId;
        if (str4 == null) {
            str4 = creationId;
        }
        CreationChatRoomEnterParams creationChatRoomEnterParams = new CreationChatRoomEnterParams(str, creationId, str4, UUID.randomUUID().toString(), "comment", str2, str3, "photo_comment", null, "unknow", null, null, null, null);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) awS54S0301000_32.l1, "//creation/chat/host");
        smartRouteBuildRoute.withParam("enter_params", creationChatRoomEnterParams);
        smartRouteBuildRoute.withParam("input_config", (AIChatPageConfig) awS54S0301000_32.l0);
        smartRouteBuildRoute.open(awS54S0301000_32.i3, (OnActivityResultCallback) awS54S0301000_32.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS54S0301000_32(Context context, OnActivityResultCallback onActivityResultCallback, AIChatPageConfig aIChatPageConfig, int i) {
        super(1);
        this.$t = i;
        this.l0 = aIChatPageConfig;
        this.l1 = context;
        this.i3 = 0;
        this.l2 = onActivityResultCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS54S0301000_32(C19KU c19ku, C19KU c19ku2, SpannableStringBuilder spannableStringBuilder, C259800zU<ImageSpan> c259800zU, int i) {
        super(1);
        this.$t = i;
        this.l0 = c19ku;
        this.l1 = c19ku2;
        this.l2 = spannableStringBuilder;
        this.i3 = c259800zU;
    }
}
