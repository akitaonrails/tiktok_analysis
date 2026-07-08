package com.tiktok.strategycenter;

import X.EnumC2213551BkH;

/* JADX INFO: loaded from: classes35.dex */
public class TTMStrategyRule {
    public byte[] byteRule;
    public EnumC2213551BkH contentType;
    public boolean overWrite;
    public String rule;
    public final String ruleName;
    public long ruleStrAddr;

    public byte[] getByteRule() {
        return this.byteRule;
    }

    public String getRule() {
        return this.rule;
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public long getRuleStrAddr() {
        return this.ruleStrAddr;
    }

    public EnumC2213551BkH getRuleType() {
        return this.contentType;
    }

    public boolean isOverWrite() {
        return this.overWrite;
    }

    public TTMStrategyRule(String str, String str2) {
        this(str, str2, false);
    }

    public TTMStrategyRule(String str, byte[] bArr) {
        this(str, bArr, false);
    }

    public TTMStrategyRule(String str, long j, boolean z) {
        this.ruleStrAddr = j;
        this.ruleName = str;
        this.overWrite = z;
        this.contentType = EnumC2213551BkH.CONTENT_STRING;
    }

    public TTMStrategyRule(String str, String str2, boolean z) {
        this.rule = str2;
        this.contentType = EnumC2213551BkH.CONTENT_STRING;
        this.ruleName = str;
        this.overWrite = z;
    }

    public TTMStrategyRule(String str, byte[] bArr, boolean z) {
        this.byteRule = bArr;
        this.contentType = EnumC2213551BkH.CONTENT_BYTE;
        this.ruleName = str;
        this.overWrite = z;
    }

    public TTMStrategyRule(String str, long j, boolean z, EnumC2213551BkH enumC2213551BkH) {
        this.ruleStrAddr = j;
        this.ruleName = str;
        this.overWrite = z;
        this.contentType = enumC2213551BkH;
    }
}
