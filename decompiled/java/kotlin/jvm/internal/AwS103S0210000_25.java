package kotlin.jvm.internal;

import X.C09AY;
import X.C1351210lGZ;
import X.InterfaceC1679450tnz;
import X.InterfaceC1686540tzQ;
import android.content.Context;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS103S0210000_25 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS103S0210000_25 awS103S0210000_25) {
        ((StoryHighlightsCreationVM) awS103S0210000_25.l0).FQ2((StoryHighlightAwemePreview) awS103S0210000_25.l1, !awS103S0210000_25.z2);
        ((StoryHighlightsCreationVM) awS103S0210000_25.l0).zJ("select_video", null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS103S0210000_25 awS103S0210000_25) {
        ((StoryHighlightsCreationVM) awS103S0210000_25.l0).FQ2((StoryHighlightAwemePreview) awS103S0210000_25.l1, !awS103S0210000_25.z2);
        ((StoryHighlightsCreationVM) awS103S0210000_25.l0).zJ("select_video", null);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS103S0210000_25 awS103S0210000_25) {
        ((Function1) awS103S0210000_25.l0).invoke(Boolean.valueOf(!awS103S0210000_25.z2));
        new C1351210lGZ((Context) awS103S0210000_25.l1).LIZIZ(12, 120);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS103S0210000_25 awS103S0210000_25) {
        if (awS103S0210000_25.z2) {
            ((InterfaceC1686540tzQ) awS103S0210000_25.l0).LJIJJ(false);
            InterfaceC1679450tnz interfaceC1679450tnz = (InterfaceC1679450tnz) awS103S0210000_25.l1;
            if (interfaceC1679450tnz != null) {
                interfaceC1679450tnz.hide();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0210000_25(Context context, Function1 function1, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = function1;
        this.z2 = z;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0210000_25(StoryHighlightsCreationVM storyHighlightsCreationVM, StoryHighlightAwemePreview storyHighlightAwemePreview, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = storyHighlightsCreationVM;
        this.l1 = storyHighlightAwemePreview;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0210000_25(boolean z, InterfaceC1686540tzQ interfaceC1686540tzQ, InterfaceC1679450tnz interfaceC1679450tnz, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = interfaceC1686540tzQ;
        this.l1 = interfaceC1679450tnz;
    }
}
