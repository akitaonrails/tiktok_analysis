package com.bytedance.hybrid.spark.roma;

import X.C08FF;
import X.C09CT;
import X.C1550330qRj;
import X.C2254308sP;
import X.EnumC1153760g86;
import X.InterfaceC2044707zh;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public interface IRomaHostDepend {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class ExposeType {

        @C09CT(CardStruct.IStatusCode.DEFAULT)
        public static final ExposeType DID;
        public static final /* synthetic */ ExposeType[] LL;
        public static final /* synthetic */ C2254308sP LLILLJJLI;

        @C09CT("1")
        public static final ExposeType UID;

        public static InterfaceC2044707zh<ExposeType> getEntries() {
            return LLILLJJLI;
        }

        static {
            ExposeType exposeType = new ExposeType("DID", 0);
            DID = exposeType;
            ExposeType exposeType2 = new ExposeType("UID", 1);
            UID = exposeType2;
            ExposeType[] exposeTypeArr = {exposeType, exposeType2};
            LL = exposeTypeArr;
            LLILLJJLI = new C2254308sP(exposeTypeArr);
        }

        public static ExposeType[] values() {
            return (ExposeType[]) LL.clone();
        }

        public static ExposeType valueOf(String str) {
            return (ExposeType) C08FF.LIZ(ExposeType.class, str);
        }

        public ExposeType(String str, int i) {
        }
    }

    void LIZ(Context context, String str);

    boolean LIZLLL(String str);

    Long LJI();

    void LJII(String str, JSONObject jSONObject);

    Object LJIIIIZZ(Class cls, String str);

    String LJIIIZ();

    void LJIIJ(ExposeType exposeType, String str);

    C1550330qRj LJIIJJI();

    EnumC1153760g86 LJIIL();

    Set<String> LJIILIIL();

    Set<String> LJIILJJIL();

    Map<String, String> LJIILL(String str);

    Object LJIILLIIL(Class cls);

    String LJIIZILJ();

    String getOpRegion();

    boolean isLocalTest();

    boolean ki(String str);
}
