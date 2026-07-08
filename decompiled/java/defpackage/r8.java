package defpackage;

import X.C09AY;
import X.C0SZ5;
import X.C13IQ;
import X.InterfaceC893080Z1u;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.data.IChatDetailApi;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class r8 extends C09AY implements Function1<C0SZ5, Unit> {
    public final /* synthetic */ C13IQ<? extends UISlotAssem> LL;
    public final /* synthetic */ IMUser LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(C13IQ<? extends UISlotAssem> c13iq, IMUser iMUser, boolean z, boolean z2, String str) {
        super(1);
        this.LL = c13iq;
        this.LLILLJJLI = iMUser;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0SZ5 c0sz5) {
        C0SZ5 c0sz52 = c0sz5;
        c0sz52.LL = this.LL;
        c0sz52.LLIZLLLIL = R.id.k6z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final IMUser iMUser = this.LLILLJJLI;
        boolean z = this.LLILLL;
        boolean z2 = this.LLILZ;
        final String str = this.LLILZIL;
        linkedHashMap.put("key_user", iMUser);
        linkedHashMap.put("is_stranger", Boolean.valueOf(z));
        linkedHashMap.put("is_author_supporter", Boolean.valueOf(z2));
        linkedHashMap.put("key_conversation_id", str);
        linkedHashMap.put("key_action_data_source", new InterfaceC893080Z1u(iMUser, str) { // from class: X.0Z1v
            public final C0Z1N LL;
            public final C0Z1L LLILLJJLI;

            @Override // X.InterfaceC893080Z1u
            public final InterfaceC893120Z1y LJIIZILJ() {
                return null;
            }

            @Override // X.InterfaceC893080Z1u
            public final void LJI() {
                this.LL.LJI();
                this.LLILLJJLI.LJI();
            }

            @Override // X.InterfaceC893080Z1u
            public final void register() {
                this.LL.register();
                this.LLILLJJLI.register();
            }

            @Override // X.InterfaceC893080Z1u
            public final C0Z1N LJJJ() {
                return this.LL;
            }

            @Override // X.InterfaceC893080Z1u
            public final C0Z1M LJJJJ() {
                return this.LLILLJJLI;
            }

            {
                IChatDetailApi.LIZ.getClass();
                this.LL = C04TC.LIZIZ.getValue().LIZ(str);
                this.LLILLJJLI = new C0Z1L(iMUser);
            }
        });
        c0sz52.LLILZ = linkedHashMap;
        return Unit.LIZ;
    }
}
