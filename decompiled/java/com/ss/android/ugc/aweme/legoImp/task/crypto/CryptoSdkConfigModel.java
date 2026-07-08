package com.ss.android.ugc.aweme.legoImp.task.crypto;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class CryptoSdkConfigModel {

    @C09CT("cipher_suite_id")
    public final int cipherSuiteId;

    @C09CT("expiration_time_global")
    public final long defaultGlobalKeyExpirationTime;

    @C09CT("expiration_time")
    public final long defaultKeyExpirationTime;

    @C09CT("expiration_time_rsa")
    public final long defaultRsaKeyExpirationTime;

    @C09CT("enable_pqc")
    public final boolean enablePQC;

    @C09CT("enable_verify")
    public final boolean enableVerify;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("rsa_key")
    public final Map<String, KeyVersion> rsaKey;

    @C09CT("sign_key")
    public final Map<String, KeyVersion> signKey;

    @C09CT("using_global_rsa_key_for_fallback")
    public final boolean usingGlobalRsaKeyForFallback;

    public CryptoSdkConfigModel() {
        this(0, false, false, 0L, 0L, 0L, false, false, null, null, 1023, null);
    }

    public CryptoSdkConfigModel(int i, boolean z, boolean z2, long j, long j2, long j3, boolean z3, boolean z4, Map<String, KeyVersion> map, Map<String, KeyVersion> map2) {
        this.cipherSuiteId = i;
        this.enabled = z;
        this.enablePQC = z2;
        this.defaultKeyExpirationTime = j;
        this.defaultGlobalKeyExpirationTime = j2;
        this.defaultRsaKeyExpirationTime = j3;
        this.enableVerify = z3;
        this.usingGlobalRsaKeyForFallback = z4;
        this.signKey = map;
        this.rsaKey = map2;
    }

    public CryptoSdkConfigModel(int i, boolean z, boolean z2, long j, long j2, long j3, boolean z3, boolean z4, Map map, Map map2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? 1209600L : j, (i2 & 16) == 0 ? j2 : 1209600L, (i2 & 32) != 0 ? 2592000L : j3, (i2 & 64) != 0 ? true : z3, (i2 & 128) != 0 ? true : z4, (i2 & 256) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("row", new KeyVersion("x8dT9OVrqie5ROe8MTwsqWioOF/gE7KOQ7IF9mA6lnI=", 0)), new Pair("eu", new KeyVersion("BxVD1axeoo57drHeT7cNARAnTz9372dQDBB5Nlox4QA=", 0)), new Pair("us", new KeyVersion("+Vj0ZTosAvjn4Hx9oLhX7ifNX51nOCQExuskOwIIxdE=", 0)), new Pair("global", new KeyVersion("bNPJkzpR8FzLrLuZQvpcvpQYcN8c4af6M0Bngg7Urn0=", 0))) : map, (i2 & 512) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("row", new KeyVersion("MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAlTq2t7YtU578Of02icjuBI8pfZHK8tQOp0Vkz04Gfp53X0+q4kBtUobVKP92T5EAiad656XUCICkX8Nf7bCHYPiDfVg4uWD/M8zu7/Qovj4d+AIXxfzdP+nCeeufNKZY/v+MqwuSuVceRwVoeRfW3Mgvz757GB6+gmx0OhUWHGnQdPhQKLe3QgvadvyozHWjon5SOw2XdQaLMeWqJrLCA6OTNdwdcrXcgvfwlHNedGeMKkQ+x89xjMIzs0eAzxI7TSg4UnMNznrKjwAk053ZDroTcs0vl2Ui8AN580JTP8nZi7yUOWHToB+ZQrrLmuomCkIUVidg4L1fIxiF6Kx2ORwE233PTnUPqB8TtP04CDCAKYUJOriakx1RpG+8JnwpCKv7LN6U43hWs3WcPu+czbMHnNrTmx140jeXCAwRpCmnxfTptQWsKBQuqJ0MzhDdRByZPS4khwUew7Bf9lkIZ5bmHIK6mDXv5sR9C1iTM1BmhmWG4Ic2qyn6+9zhozN7AgMBAAE=", 0)), new Pair("eu", new KeyVersion("MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEA942ktZrm7iOwGB+O4DI8aP/HpEna1htpJBk7k2T9HkRRw+XnWSSEjV5ycnBSZzs9KP6zZInmhcP2+CvsQ39kC8HFLdUI6bp0sUV+dWhRsphJId/NoguW1BiUw1Svhv8bFUqRwuXrK9M9tuC5X7SKLPle/LmTIPmwAEMFdfv0KmVRcU8Sj0+kpjzmuzBcEnsfThHTqX4Fhn2kkPixAglD5BzGuPwQBww73CatF8+bgTsFrQXHGnyi2v7oTdnXLh1PwCwrK86d2qrROHWC8GTQtpDvzd5I6qX4aRCLYjR9H/tjY0vbEBH6oeMI211J5eQ9mV5P+sXiQifTtQRw5X0LIU4Py71sBX+LXAzA6dRDZNA9y/D9441rlb81Pn8TbhpQT/pN3djvceeSTlsPx3RuDxWSxVdlAWD99Eb69qKtvOcAY0v8GbBYWR5dITBTkFYfN+9++rWmTsYZYUGqlAGzUKoKMP7OiOHoSv0gxIS5ZcrJB0/Ges7RRGxWsN3FaTRjAgMBAAE=", 0)), new Pair("us", new KeyVersion("MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAm6Snf5DGD+vFS90bC5lSSXuMFn0jooiv3jrvH40fFCusxVcdphTJrTjjI7bHHG2AOBwnj6m15LPLtOfYn0+fhYnXYHztT1rBZa86ogICZEgrBonh5Z1XOWvxOgBpOHEyfJdasnmqZybo3i/6B1AzfBWSQxbQdc1yPvNtJQxr6D89HexS/S12xXFTaCq9MJzCjNamoTevdJpW6Y/qxwAS+b7K2/lo3aDcpeLW8dgELFyevpf61pStGlR7G9U+oRFDdPY0ZkUYUeGhIWIFLPf+oGO1YYeaDl0boruVsSsK+Pep0XncPWA1GXSOJOvqKlakgtabSc6LbZnmlGWWF64JGEDI8+48dbtMTO3fwC867bdOvfR9cOsx3uqleWrxSqZtMFQTVjP1ZYIEPPk1uQht55KcpQICK+DooAYiWHumUsJN37kGx482vHnOSt1oeDRV1WVtNjMvvI1ZumiP+zHrQ+1zN49anvUIP4lcjqvK5ADSfJghFjXwD32taMPaqVAvAgMBAAE=", 0)), new Pair("global", new KeyVersion("MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAjwlohUVkd+vT9ESn5wt+7Od9ZXB6HN4i0qrHxPDELmh8gtXc/2oCZFavG3s+8h6+fsdvW0FO0aakxnDYYoG0E//TlI52kBXmMyQEnAZX+VghjIEC+jKfSzX/ur14uo5YFrnrobiSybcBKFLojjC41EqDzrjDyZF0Zqu3hOI6/4Tsld5PoNtta9DAymPM1Ve2kDzXl6nS3Uyioz3q8Kmlj1FHxNjq+qHmLpgdoOcOVKrAV1+KX6d0CCdOlrV8QeCa2kRQ3C/X0zHQf1pD3HgJ/KzAaUtDC4YNKaVsjeiSVM0x6Gc1S9eSE0hqoBN0MHeidEu+tw+k39cJ669SxvPwhZkJaVxIGp/nETimsEnKviCle33rB+l5PVgk3DFYwdJablPEBFUE4ODDXmXtjCtrhqrO16jNNP7Scwikp87X0JEF5sbSk4M7CQtb1b+cZ0VNLqROv+9wDifSUoNP2G+BxdkiFetSF52DJVVNSuzY21CaHFmSg28QCIoQ+Q/+jEbHAgMBAAE=", 9999))) : map2);
    }
}
