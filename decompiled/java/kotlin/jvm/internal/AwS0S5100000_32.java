package kotlin.jvm.internal;

import X.C09AY;
import X.C0MWH;
import X.C18BA;
import X.C21290818Tq;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tools.chat.room.model.CreationChatRoomEnterParams;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class AwS0S5100000_32 extends C09AY implements Function1 {
    public final int $t;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public String s4;

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

    public static final Object invoke$0(AwS0S5100000_32 awS0S5100000_32, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("type", awS0S5100000_32.s0);
        jSONObject.put("page_name", awS0S5100000_32.s1);
        jSONObject.put("finder", C18BA.LIZIZ((PageFinder) awS0S5100000_32.l5));
        String str = awS0S5100000_32.s2;
        if (str == null) {
            str = "null";
        }
        jSONObject.put("biz", str);
        jSONObject.put("resumed_btm_page", awS0S5100000_32.s3);
        jSONObject.put("resumed_page", awS0S5100000_32.s4);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S5100000_32 awS0S5100000_32, Object obj) {
        Bundle bundle;
        C21290818Tq.LIZ("AiChatRoomLauncher", "launchFromEditorPage");
        String string = UUID.randomUUID().toString();
        String str = awS0S5100000_32.s0;
        CreationChatRoomEnterParams creationChatRoomEnterParams = new CreationChatRoomEnterParams((String) obj, str, str, string, "editor_tab", awS0S5100000_32.s1, awS0S5100000_32.s2, awS0S5100000_32.s3, null, awS0S5100000_32.s4, null, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("enter_params", creationChatRoomEnterParams);
        Context context = (Context) awS0S5100000_32.l5;
        try {
            bundle = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        C0MWH.LJIIL(context, bundle, "CreationChatRoomContainerScene", null, 12360, null, false, 104);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S5100000_32(Context context, String str, String str2, String str3, String str4, String str5, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
        this.s4 = str5;
        this.l5 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S5100000_32(PageFinder pageFinder, String str, String str2, String str3, String str4, String str5, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l5 = pageFinder;
        this.s2 = str3;
        this.s3 = str4;
        this.s4 = str5;
    }
}
