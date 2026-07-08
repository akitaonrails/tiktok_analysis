package kotlin.jvm.internal;

import X.C09AY;
import X.C0HOM;
import X.C0I20;
import X.C19EG;
import X.C420500GeG;
import X.C440440HOw;
import X.InterfaceC440230HOb;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.container.BaseChatInputAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.SearchableEditText;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS16S0600000_6 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS16S0600000_6 awS16S0600000_6) {
        return Boolean.valueOf(((MixStudioHomePageAssem) awS16S0600000_6.l0).Fp((Context) awS16S0600000_6.l1, (C0HOM) awS16S0600000_6.l2, (C440440HOw) awS16S0600000_6.l3, (View) awS16S0600000_6.l4, (Function1) awS16S0600000_6.l5));
    }

    public static final Object invoke$1(AwS16S0600000_6 awS16S0600000_6) {
        ((MixStudioHomePageAssem) awS16S0600000_6.l0).Fp((Context) awS16S0600000_6.l1, (C0HOM) awS16S0600000_6.l2, (C440440HOw) awS16S0600000_6.l3, (View) awS16S0600000_6.l4, (Function1) awS16S0600000_6.l5);
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0098 A[Catch: SecurityException -> 0x00fa, TryCatch #0 {SecurityException -> 0x00fa, blocks: (B:3:0x0019, B:5:0x0028, B:8:0x002e, B:10:0x003d, B:11:0x0058, B:13:0x005c, B:14:0x0068, B:17:0x0071, B:18:0x0075, B:20:0x007b, B:22:0x0083, B:30:0x0092, B:32:0x0098, B:33:0x009c, B:35:0x00a2, B:37:0x00aa, B:47:0x00bf, B:49:0x00cc, B:51:0x00d2, B:53:0x00e0, B:59:0x00ec), top: B:65:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec A[Catch: SecurityException -> 0x00fa, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x00fa, blocks: (B:3:0x0019, B:5:0x0028, B:8:0x002e, B:10:0x003d, B:11:0x0058, B:13:0x005c, B:14:0x0068, B:17:0x0071, B:18:0x0075, B:20:0x007b, B:22:0x0083, B:30:0x0092, B:32:0x0098, B:33:0x009c, B:35:0x00a2, B:37:0x00aa, B:47:0x00bf, B:49:0x00cc, B:51:0x00d2, B:53:0x00e0, B:59:0x00ec), top: B:65:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS16S0600000_6 r15) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS16S0600000_6.invoke$2(kotlin.jvm.internal.AwS16S0600000_6):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S0600000_6(SearchableEditText searchableEditText, C19EG c19eg, BaseChatInputAssem baseChatInputAssem, SessionInfo sessionInfo, IAlbumUpdateGuideViewModel iAlbumUpdateGuideViewModel, C0I20 c0i20, int i) {
        super(0);
        this.$t = i;
        this.l0 = searchableEditText;
        this.l1 = c19eg;
        this.l2 = baseChatInputAssem;
        this.l3 = sessionInfo;
        this.l4 = iAlbumUpdateGuideViewModel;
        this.l5 = c0i20;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S0600000_6(MixStudioHomePageAssem mixStudioHomePageAssem, Context context, C0HOM c0hom, C440440HOw c440440HOw, C420500GeG c420500GeG, AwS215S0300000_6 awS215S0300000_6, int i) {
        super(0);
        this.$t = i;
        this.l0 = mixStudioHomePageAssem;
        this.l1 = context;
        this.l2 = c0hom;
        this.l3 = c440440HOw;
        this.l4 = c420500GeG;
        this.l5 = awS215S0300000_6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS16S0600000_6(MixStudioHomePageAssem mixStudioHomePageAssem, MixStudioHomePageAssem mixStudioHomePageAssem2, Context context, C0HOM<? extends List<C440440HOw>> c0hom, C440440HOw c440440HOw, View view, Function1<? super InterfaceC440230HOb<? extends List<C440440HOw>>, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l0 = mixStudioHomePageAssem;
        this.l1 = mixStudioHomePageAssem2;
        this.l2 = context;
        this.l3 = c0hom;
        this.l4 = c440440HOw;
        this.l5 = view;
    }
}
