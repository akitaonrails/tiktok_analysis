package com.ss.android.ugc.aweme.ttlive;

import X.C040J;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1485605ri;
import X.InterfaceC1485705rj;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC2174908fb;
import X.InterfaceC2177008fw;
import X.InterfaceC820680WHi;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface ILiveApi {
    @C040J
    @InterfaceC1501200pAU
    C0X9S<TypedInput> downloadFile(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC1485705rj String str, @InterfaceC1485605ri Map<String, String> map, @InterfaceC2177008fw Object obj);

    @InterfaceC1501200pAU
    C0X9S<TypedInput> get(@InterfaceC1485705rj String str, @InterfaceC1485605ri Map<String, String> map, @InterfaceC2177008fw Object obj);

    @InterfaceC1501240pAY
    C0X9S<TypedInput> post(@InterfaceC1485705rj String str, @InterfaceC1485405rg TypedByteArray typedByteArray, @InterfaceC1485605ri Map<String, String> map, @InterfaceC2177008fw Object obj);

    @InterfaceC1501240pAY
    C0X9S<TypedInput> postMultiPart(@InterfaceC2174908fb int i, @InterfaceC1485705rj String str, @InterfaceC1485605ri Map<String, String> map, @InterfaceC1485405rg TypedOutput typedOutput);
}
