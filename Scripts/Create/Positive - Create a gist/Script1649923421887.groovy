import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/Positive - Sukses Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/create/icon_create'))

WebUI.setText(findTestObject('Object Repository/create/input_Instantly share code, notes, and snip_67d86d'), 'TestQADTO')

WebUI.setText(findTestObject('Object Repository/create/input_Instantly share code, notes, and snip_415405'), 'test.json')

WebUI.setText(findTestObject('Object Repository/create/div_1test DTO'), '<div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">1</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-variable">test</span> <span class="cm-variable">DTO</span></span></pre></div>')

WebUI.setText(findTestObject('Object Repository/create/div_1div styleposition relativediv classCod_782357'), '<div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: 1794px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">1</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-operator">&lt;</span><span class="cm-variable">div</span> <span class="cm-variable">style</span><span class="cm-operator">=</span><span class="cm-string">"position: relative;"</span><span class="cm-operator">&gt;&lt;</span><span class="cm-variable">div</span> <span class="cm-keyword">class</span><span class="cm-operator">=</span><span class="cm-string">"CodeMirror-gutter-wrapper"</span> <span class="cm-variable">contenteditable</span><span class="cm-operator">=</span><span class="cm-string">"false"</span> <span class="cm-variable">style</span><span class="cm-operator">=</span><span class="cm-string">"left: -53px;"</span><span class="cm-operator">&gt;&lt;</span><span class="cm-variable">div</span> <span class="cm-keyword">class</span><span class="cm-operator">=</span><span class="cm-string">"CodeMirror-linenumber CodeMirror-gutter-elt"</span> <span class="cm-variable">style</span><span class="cm-operator">=</span><span class="cm-string">"left: 0px; width: 21px;"</span><span class="cm-operator">&gt;</span><span class="cm-number">1</span><span class="cm-operator">&lt;</span><span class="cm-string-2">/div&gt;&lt;/</span><span class="cm-variable">div</span><span class="cm-operator">&gt;&lt;</span><span class="cm-variable">pre</span> <span class="cm-keyword">class</span><span class="cm-operator">=</span><span class="cm-string">" CodeMirror-line "</span> <span class="cm-variable">role</span><span class="cm-operator">=</span><span class="cm-string">"presentation"</span><span class="cm-operator">&gt;&lt;</span><span class="cm-variable">span</span> <span class="cm-variable">role</span><span class="cm-operator">=</span><span class="cm-string">"presentation"</span> <span class="cm-variable">style</span><span class="cm-operator">=</span><span class="cm-string">"padding-right: 0.1px;"</span><span class="cm-operator">&gt;&lt;</span><span class="cm-variable">span</span> <span class="cm-keyword">class</span><span class="cm-operator">=</span><span class="cm-string">"cm-variable"</span><span class="cm-operator">&gt;</span><span class="cm-variable">test</span><span class="cm-operator">&lt;</span><span class="cm-string-2">/span&gt; &lt;span class="cm-variable"&gt;DTO&lt;/</span><span class="cm-variable">span</span><span class="cm-operator">&gt;&lt;</span><span class="cm-string-2">/span&gt;&lt;/</span><span class="cm-variable">pre</span><span class="cm-operator">&gt;&lt;</span><span class="cm-string-2">/div&gt;</span></span></pre></div>')

WebUI.click(findTestObject('Object Repository/create/button_Create secret gist'))

